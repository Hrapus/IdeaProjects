package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;


        System.out.print("Write action (buy, fill, take, remaining, exit): ");



        while (true){
            String cases = scanner.next();

            if (cases.equals("exit")) {
                break;
            } else {
                switch (cases){
                    case ("buy") : {
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

                        String sort = scanner.next();
                        switch (sort){
                            case "1" : {
                                if (water >=250 && beans >= 16 && cups >= 1) {
                                    water -= 250;
                                    beans -= 16;
                                    cups--;
                                    money += 4;
                                    System.out.println("I have enough resources, making you a coffee!");
                                } else if (water < 250){System.out.println("Sorry, not enough water!");
                                } else if (beans < 16){System.out.println("Sorry, not enough coffee beans!");
                                } else {System.out.println("Sorry, not enough cups!");
                                }
                                break;
                            }

                            case "2" : {
                                if (water >= 350 && milk >=75 && beans >= 20 && cups >= 1){
                                    water -= 350;
                                    milk -= 75;
                                    beans -= 20;
                                    cups--;
                                    money += 7;
                                    System.out.println("I have enough resources, making you a coffee!");
                                }else if (water < 350){System.out.println("Sorry, not enough water!");
                                }else if (milk < 75){System.out.println("Sorry, not enough milk!");
                                }else if (beans < 20){System.out.println("Sorry, not enough coffee beans!");
                                }else {System.out.println("Sorry, not enough cups!");
                                }
                                break;
                            }

                            case "3" : {
                                if (water >= 200 && milk >= 100 && beans >= 12 && cups >=1){
                                    water -= 200;
                                    milk -= 100;
                                    beans -= 12;
                                    cups--;
                                    money += 6;
                                    System.out.println("I have enough resources, making you a coffee!");
                                }else if (water < 200){System.out.println("Sorry, not enough water!");
                                }else if (milk < 100){System.out.println("Sorry, not enough milk!");
                                }else if (beans < 12){System.out.println("Sorry, not enough coffee beans!");
                                }else {System.out.println("Sorry, not enough cups!");
                                }
                                break;
                            }
                            case "back" : {
                                break;
                            }
                        }
                        break;
                    }
                    case ("fill") : {
                        System.out.print("Write how many ml of water do you want to add: ");
                        water += scanner.nextInt();
                        System.out.print("Write how many ml of milk do you want to add: ");
                        milk += scanner.nextInt();
                        System.out.print("Write how many grams of coffee beans do you want to add: ");
                        beans += scanner.nextInt();
                        System.out.print("Write how many disposable cups of coffee do you want to add: ");
                        cups += scanner.nextInt();
                        break;
                    }

                    case ("remaining") : {
                        System.out.printf("The coffee machine has:\n" +
                                "%d of water\n" +
                                "%d of milk\n" +
                                "%d of coffee beans\n" +
                                "%d of disposable cups\n" +
                                "$%d of money\n", water, milk, beans, cups, money);
                        System.out.println();
                        break;
                    }

                    case ("take") : {
                        System.out.printf("I gave you $%d\n", money);
                        System.out.println();
                        money = 0;
                        break;
                    }

                }
            }
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
        }
    }
}
