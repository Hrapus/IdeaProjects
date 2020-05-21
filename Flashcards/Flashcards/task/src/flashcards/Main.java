package flashcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static List<String> fullLog = new ArrayList<>();
    static Map<String, String> mainMap = new LinkedHashMap<>();
    static Map<String, Integer> mistakes = new LinkedHashMap<>();

    public static void main(String[] args) {
        String expT = "";

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-import".toLowerCase())){
                importTry(args[i + 1]);
            }
            if (args[i].equals("-export".toLowerCase())){
                expT = args[i + 1];

            }
        }

        Scanner scanner = new Scanner(System.in);


        outputMsg("Input the action (add, remove, import, export, ask, exit, log, hardest card, reset stats):");
        String action = getUserInput(scanner);

        while (!action.equals("exit")) {

            switch (action) {

                case ("reset stats"): {
                    for (var v : mistakes.entrySet()) {
                        v.setValue(0);
                    }
                    outputMsg("Card statistics has been reset.");
                    break;
                }
                case ("log"): {
                    outputMsg("File name:");
                    String path = getUserInput(scanner);
                    //getUserInput(scanner);
                    File file = new File(path);

                    try {
                        PrintWriter printwriter = new PrintWriter(file);
                        for (String s : fullLog) {
                            printwriter.println(s);
                        }
                        outputMsg("The log has been saved.");
                        printwriter.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
//                    for (String s :
//                            fullLog) {
//                        System.out.println(s);
//                    }
                    break;
                }
                case ("hardest card"): {
                    int maxMistakes = 0;
                    StringBuilder out = new StringBuilder();
                    String output = null;
                    ArrayList<String> list = new ArrayList<>();

                    for (var v : mistakes.entrySet()) {
                        if (v.getValue() > maxMistakes) {
                            maxMistakes = v.getValue();
                        }
                    }

                    if (maxMistakes == 0) {
                        outputMsg("There are no cards with errors.");
                        break;
                    } else {
                        for (var v : mistakes.entrySet()) {
                            if (v.getValue() == maxMistakes) {
                                list.add(" \"" + v.getKey() + "\",");
                            }
                        }
                        for (String s : list) {
                            out.append(s);
                        }

                        output = out.substring(0, out.length() - 1);

                        outputMsg("The hardest card is" + output + ". You have " + maxMistakes + " errors answering it.");
                        break;
                    }
                }
                case ("add"): {
                    outputMsg("The card:");
                    String question = getUserInput(scanner);

                    if (mainMap.containsKey(question)) {
                        outputMsg("The card \"" + question + "\" already exists.");
                        break;
                    }

                    outputMsg("The definition of the card:");
                    String definition = getUserInput(scanner);

                    if (mainMap.containsValue(definition)) {
                        outputMsg("The definition \"" + definition + "\" already exists.");
                        break;
                    }

                    mainMap.put(question, definition);
                    mistakes.put(question, 0);
                    outputMsg("The pair (\"" + question + "\":\"" + definition + "\") has been added.");
                    break;
                }
                case ("remove"): {
                    outputMsg("The card:");
                    String i = getUserInput(scanner);
                    //scanner.nextLine();
                    if (mainMap.containsKey(i)) {
                        mainMap.remove(i);
                        mistakes.remove(i);
                        outputMsg("The card has been removed.");
                        break;
                    } else {
                        outputMsg("Can't remove \"" + i + "\": there is no such card.");
                        break;
                    }
                }
                case ("ask"): {
                    outputMsg("How many times to ask?");
                    int counter = Integer.parseInt(getUserInput(scanner));
                    //getUserInput(scanner);

                    String[] keyArr = new String[mainMap.size()];

                    Random r = new Random();
                    int temp = 0;
                    String randkey = "";

                    for (String key : mainMap.keySet()) {
                        keyArr[temp] = key;
                        temp++;
                    }

                    for (int i = 0; i < counter; i++) {
                        randkey = keyArr[r.nextInt(keyArr.length)];

                        outputMsg("Print the definition of \"" + randkey + "\":");
                        String y = getUserInput(scanner);
                        //getUserInput(scanner);

                        if (mainMap.containsValue(y)) {

                            if (mainMap.get(randkey).equals(y)) {
                                outputMsg("Correct answer.");
                            } else {
                                String z = "";
                                for (var v : mainMap.entrySet()) {
                                    if (v.getValue().equals(y))
                                        z = v.getKey();
                                }
                                outputMsg("Wrong answer. The correct one is \"" + mainMap.get(randkey) + "\", you've just written the definition of \"" + z + "\".");
                                mistakes.replace(randkey, (mistakes.get(randkey) + 1));
                            }
                        } else {
                            outputMsg("Wrong answer. The correct one is \"" + mainMap.get(randkey) + "\".");
                            mistakes.replace(randkey, (mistakes.get(randkey) + 1));
                        }
                    }
                    break;
                }
                case ("export"): {
                    outputMsg("File name:");
                    String path = getUserInput(scanner);
                    exportTry(path);
                    break;
                }
                case ("import"): {
                    outputMsg("File name:");
                    String path = getUserInput(scanner);
                    importTry(path);
                    break;
                }
            }

            outputMsg("");
            outputMsg("Input the action (add, remove, import, export, ask, exit, log, hardest card, reset stats):");
            action = getUserInput(scanner);
        }

        outputMsg("Bye bye!");
        if (!expT.equals("")) {
            exportTry(expT);
        }
    }

    static void outputMsg(String msg) {
        fullLog.add(msg);
        System.out.println(msg);
    }

    static String getUserInput(Scanner scanner) {
        String temp = scanner.nextLine();
        fullLog.add(temp);
        return temp;
    }

    static void importTry(String string){
        int counter = 0;

        String[] tempArr;
        File file = new File(string);
        try {
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNext()) {
                tempArr = scanner1.nextLine().split("!");

                if (mainMap.containsKey(tempArr[0])) {
                    mainMap.replace(tempArr[0], tempArr[1]);
                    mistakes.replace(tempArr[0], Integer.valueOf(tempArr[2]));
                } else {
                    mainMap.put(tempArr[0], tempArr[1]);
                    mistakes.put(tempArr[0], Integer.valueOf(tempArr[2]));
                }
                counter++;
            }
            outputMsg(counter + " cards have been loaded.");
        } catch (FileNotFoundException e) {
            outputMsg("File not found.");
        }
    }

    static void exportTry(String string){
        int counter = 0;
        File file = new File(string);

        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (var v : mainMap.entrySet()) {
                printWriter.println(v.getKey() + "!" + v.getValue() + "!" + mistakes.get(v.getKey()));
                counter++;
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        outputMsg(counter + " cards have been saved.");
    }

}