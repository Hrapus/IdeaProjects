package tictactoe;

import java.util.Scanner;

public class Main {

    static char[][] gameBoardArr = new char[3][3];

    public static void main(String[] args) {
        // write your code here
        int counter = 0;
        for (int i = 0; i < gameBoardArr.length; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoardArr[i][j] = ' ';
            }
        }

        printMatrix(gameBoardArr);
        System.out.print("Enter the coordinates: ");
        Scanner scanner = new Scanner(System.in);
        int[] checked = inputChecker(scanner.nextLine());

        while (true) {

            gameBoardArr[checked[0]][checked[1]] = 'X';
            printMatrix(gameBoardArr);
            if (checkIsWin('X')) {
                System.out.println("X wins");
                break;
            }
            counter++;
            if (counter == 9) {
                System.out.println("Draw");
                break;
            }

            System.out.print("Enter the coordinates: ");
            checked = inputChecker(scanner.nextLine());
            gameBoardArr[checked[0]][checked[1]] = 'O';
            printMatrix(gameBoardArr);
            if (checkIsWin('O')) {
                System.out.println("O wins");
                break;
            }
            counter++;
            if (counter == 9) {
                System.out.println("Draw");
                break;
            }

            System.out.print("Enter the coordinates: ");
            checked = inputChecker(scanner.nextLine());

        }


    }

    static boolean checkIsWin(char symbol) {
        //Проверяем горизонталь и вертикаль
        for (int i = 0; i < 3; i++) {
            int hor = 0;
            int ver = 0;
            for (int j = 0; j < 3; j++) {
                if (gameBoardArr[i][j] == symbol) {
                    hor++;
                }
                if (gameBoardArr[j][i] == symbol) {
                    ver++;
                }
                if (hor == 3 || ver == 3) {
                    return true;
                }
            }
        }

        //Диагонали
        int mdig = 0;
        int supdig = 0;
        for (int i = 0; i < 3; i++) {
            if (gameBoardArr[i][i] == symbol) {
                mdig++;
            }
            if (gameBoardArr[i][2 - i] == symbol) {
                supdig++;
            }
        }
        return mdig == 3 || supdig == 3;
    }

    static int[] inputChecker(String string) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int x = 0;
        int y = 0;
        String[] asd = string.split(" ");

        while (flag) {
            try {
                x = Integer.parseInt(asd[0]);
                y = Integer.parseInt(asd[1]);

                if ((x < 1 || x > 3) || (y < 1 || y > 3)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    System.out.print("Enter the coordinates: ");
                    asd = scanner.nextLine().split(" ");
                } else if (gameBoardArr[transpondOne(y)][transpondTwo(x)] == 'O' || gameBoardArr[transpondOne(y)][transpondTwo(x)] == 'X') {
                    System.out.println("This cell is occupied! Choose another one!");
                    System.out.print("Enter the coordinates: ");
                    asd = scanner.nextLine().split(" ");
                } else {
                    flag = false;
                }
            } catch (NumberFormatException | NullPointerException exception) {
                System.out.println("You should enter numbers!");
                System.out.print("Enter the coordinates: ");
                asd = scanner.nextLine().split(" ");
            }
        }
        return new int[]{transpondOne(y), transpondTwo(x)};
    }

    static int transpondOne(int x) {
        if (x == 1) return 2;
        else if (x == 2) return 1;
        else return 0;
    }

    static int transpondTwo(int y) {
        if (y == 1) return 0;
        else if (y == 2) return 1;
        else return 2;
    }

    static void printMatrix(char[][] gameBoardArr) {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", gameBoardArr[0][0], gameBoardArr[0][1], gameBoardArr[0][2]);
        System.out.printf("| %c %c %c |\n", gameBoardArr[1][0], gameBoardArr[1][1], gameBoardArr[1][2]);
        System.out.printf("| %c %c %c |\n", gameBoardArr[2][0], gameBoardArr[2][1], gameBoardArr[2][2]);
        System.out.println("---------");
    }
}
