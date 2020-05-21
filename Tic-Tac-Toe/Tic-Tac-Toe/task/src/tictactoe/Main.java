package tictactoe;

import java.util.Scanner;

public class Main {
    static char[][] gameBoardArr = new char[3][3];

    public static void main(String[] args) {
        // write your code here
        System.out.print("Enter cells:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        char[] arr = string.toCharArray();
        char[][] gameBoardArr = new char[3][3];

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

    }

    static String CheckIsWin(char symbol) {
        //Проверяем горизонталь и вертикаль
        int win = 0;
        int mdig, supdig, hor, ver;

        for (int i = 0; i < 3; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < 3; j++) {
                if (gameBoardArr[i][j] == symbol) {
                    hor++;
                }
                if (gameBoardArr[j][i] == symbol) {
                    ver++;
                }
            }
            if (hor == 3 || ver == 3) {
                return true;
            }

        }

        mdig = 0;
        supdig = 0;
        //Диагонали
        for (int i = 0; i < 3; i++) {
            if (gameBoardArr[i,i] ==symbol){
                mdig++;
            }
            if (gameBoardArr[i,2 - i] ==symbol ){
                supdig++;
            }
        }
        if (mdig == 3 || supdig == 3) {
            return true;
        }

    }
}
