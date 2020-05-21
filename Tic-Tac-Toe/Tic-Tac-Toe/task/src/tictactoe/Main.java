package tictactoe;

import java.util.Scanner;

public class Main {
    static char[][] gameBoardArr = new char[3][3];

    public static void main(String[] args) {
        // write your code here
        System.out.print("Enter cells: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int counterX = 0;
        int counterY = 0;

        char[] arr = string.toCharArray();

        for (int i = 0; i < arr.length; ) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    gameBoardArr[j][k] = arr[i];
                    i++;
                }
            }
        }

        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", gameBoardArr[0][0], gameBoardArr[0][1], gameBoardArr[0][2]);
        System.out.printf("| %c %c %c |\n", gameBoardArr[1][0], gameBoardArr[1][1], gameBoardArr[1][2]);
        System.out.printf("| %c %c %c |\n", gameBoardArr[2][0], gameBoardArr[2][1], gameBoardArr[2][2]);
        System.out.println("---------");

        for (char c : arr) {
            if (c == 'X') {
                counterX++;
            } else if (c == 'O') {
                counterY++;
            }
        }

        if ((Math.abs(counterX - counterY) > 1)) {
            System.out.println("Impossible");
        } else if (checkIsWin('X') && checkIsWin('O')) {
            System.out.println("Impossible");
        } else if (checkIsWin('X')) {
            System.out.println("X wins");
        } else if (checkIsWin('O')) {
            System.out.println("O wins");
        } else if ((counterX + counterY) == 9) {
            System.out.println("Draw");
        } else System.out.println("Game not finished");


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
}
