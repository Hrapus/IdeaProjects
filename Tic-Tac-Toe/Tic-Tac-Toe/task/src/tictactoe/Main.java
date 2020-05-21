package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        char[] arr = string.toCharArray();

        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", arr[0], arr[1], arr[2]);
        System.out.printf("| %c %c %c |\n", arr[3], arr[4], arr[5]);
        System.out.printf("| %c %c %c |\n", arr[6], arr[7], arr[8]);
        System.out.println("---------");

    }

    boolean CheckIsWin(String symbol)
    {
        //Проверяем горизонталь и вертикаль
        int win = 0;
        int mdig, supdig, hor, ver;

        for (int i = 0; i < 3; i++)
        {
            hor = 0; ver = 0;
            for (int j = 0; j < 3; j++)
            {
                if (GameBoardArr[i, j] == symbol)
                {
                    hor++;
                }
                if (GameBoardArr[j, i] == symbol)
                {
                    ver++;
                }
            }
            if (hor == 3 || ver == 3)
            {
                return true;
            }

        }

        mdig = 0; supdig = 0;
        //Диагонали
        for (int i = 0; i < 3; i++)
        {
            if (GameBoardArr[i, i] == symbol)
            {
                mdig++;
            }
            if (GameBoardArr[i,2 - i] == symbol )
            {
                supdig++;
            }
        }
        if (mdig == 3 || supdig == 3)
        {
            return true;
        }

    }
}
