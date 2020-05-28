package solver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        File file = new File(args[0]);
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//            e.printStackTrace();
//        }


        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();

        double[][] mainMatrix = new double[lineCount][lineCount + 1];

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j <= lineCount; j++){
                mainMatrix[i][j] = Double.parseDouble(scanner.next());
            }
        }
        Matrix matrix = new Matrix(mainMatrix);
        matrix.print();




    }
}

class Matrix{

    double[][] matrix;

    public Matrix(double[][] mainMatrix) {
        this.matrix = mainMatrix;
    }


    public void print(){
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "    ");
            }
            System.out.println();
        }

    }

}






