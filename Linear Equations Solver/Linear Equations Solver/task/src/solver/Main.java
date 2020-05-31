package solver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[1]);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String s = scanner.nextLine();
        int lineCount = Integer.parseInt(s);

        double[][] mainMatrix = new double[lineCount][lineCount + 1];

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j <= lineCount; j++) {
                mainMatrix[i][j] = Double.parseDouble(scanner.next());
            }
        }
        scanner.close();


        Matrix matrix = new Matrix(mainMatrix);
        matrix.firstColumn();
        System.out.println();
        matrix.print();
        System.out.println();
        matrix.lastColumn();
        matrix.print();
        
        File file1 = new File(args[3]);
        FileWriter writer = new FileWriter(file1);
        for (double d :
                matrix.answer()) {
            writer.write(Double.toString(d) + "\n");
        }
        writer.close();

        


    }
}

class Matrix {

    double[][] matrix;

    public Matrix(double[][] mainMatrix) {
        this.matrix = mainMatrix;
    }    
    


    public void firstColumn() {
        //рассчет первой строки
        for (int l = 0; l < matrix.length - 1; l++) {
            double x = matrix[l][l];
            for (int i = l; i < matrix[0].length; i++) {
                matrix[l][i] = matrix[l][i] / x;
            }

            for (int k = l + 1; k < matrix.length; k++) {
                //рассчет одной строки
                double coef = matrix[k][l];
                for (int j = l; j < matrix[0].length; j++) {
                    matrix[k][j] = matrix[k][j] - matrix[l][j] * coef;
                }
            }
        }

        //рассчет последней строки
        double lastCoef = matrix[matrix.length - 1][matrix[0].length - 2];
        matrix[matrix.length - 1][matrix[0].length - 2] = matrix[matrix.length - 1][matrix[0].length - 2] / lastCoef;
        matrix[matrix.length - 1][matrix[0].length - 1] = matrix[matrix.length - 1][matrix[0].length - 1] / lastCoef;
    }

    public void lastColumn() {

        for (int l = matrix.length - 2; l >= 0; l--) {

            //рассчет столбца
            for (int i = l; i >= 0; i--) {
                //рассчет одной строки
                double coef = matrix[i][l + 1];
                for (int k = matrix[0].length - 1; k >= 0; k--) {
                    matrix[i][k] = matrix[i][k] - matrix[l + 1][k] * coef;
                }
            }

        }

    }


    public void print() {
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.printf(" %.5f", aDouble);
            }
            System.out.println();
        }
    } 
    
    public double[] answer(){
        double[] a = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            a[i] = matrix[i][matrix[0].length - 1];
        }
        return a;
    }
    
}









