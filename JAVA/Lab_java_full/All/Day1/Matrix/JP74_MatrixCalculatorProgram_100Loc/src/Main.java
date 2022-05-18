

import java.util.Scanner;


public class Main {
    
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        Main m = new Main();
        //start program
        m.run();
    }

    //start program
    void run() {
        //allow user can choose different option
        while (true) {
            //display option to choose
            menu();
            //get input choose option
            int choice = getInputInt("Your choice: ", "Choose only 1-4!", 1, 4);
            //check exit program
            if (choice == 4) {
                System.exit(0);
            }
            //
            matrixHandling(choice);
            System.out.println();
        }
    }   
    
    //get input integer number between min and max
    int getInputInt(String message, String error, int min, int max) {
        int number;
        //force user input exectly integer number
        while (true) {
            try {
                System.out.print(message);
                number = Integer.parseInt(sc.nextLine());                //check range of number
                if (number < min || number > max) {
                    System.out.println(error);
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Values of matrix must be the number!");
            }
        }
        
    }
    
    //display menu
    void menu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }
    
    //add two matrix
    public int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] newMat = new int[matrix1.length][matrix1[0].length];
        //point from the first row to the last row
        for (int i = 0; i < matrix1.length; i++) {
            //point from the first column to the last column
            for (int j = 0; j < matrix1[0].length; j++) {
                newMat[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return newMat;
    }
    
    //sub two matrix
    public int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] newMat = new int[matrix1.length][matrix1[0].length];
        //point from the first row to the last row
        for (int i = 0; i < matrix1.length; i++) {
            //point from the first column to the last column
            for (int j = 0; j < matrix1[0].length; j++) {
                newMat[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return newMat;
    }
    
    //mul two matrix
    public int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] newMat = new int[matrix1.length][matrix2[0].length];
        //point from the first row to the last row of matrix1
        for (int i = 0; i < matrix1.length; i++) {
            //point from the first column to the last column of matrix2
            for (int j = 0; j < matrix2[0].length; j++) {
                //point from the first column to the last column of matrix1 as well as each row of matrix2
                for (int k = 0; k < matrix1[0].length; k++) {
                    newMat[i][j] = newMat[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return newMat;
    }
    
    //display matrix
     void displayMatrix(int[][] matrix) {
         //point from the first row to the last row
        for (int i = 0; i < matrix.length; i++) {
            //point from the first column to the last column
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

     //get new input matrix
    int[][] newMatrix(int row, int col) {
        int[][] newMat = new int[row][col];
        //point from the first row to the last row
        for (int i = 0; i < row; i++) {
            //point from the first column to the last column
            for (int j = 0; j < col; j++) {
                newMat[i][j] = getInputInt(String.format("Enter Matrix[%d][%d]: ", i+1, j+1), "Out of range!", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        return newMat;
    }
    
    //díplay result
    void displayResult(int[][] matrix1, int[][] matrix2, int[][] result, int option) {
        System.out.println("--------- Result ---------");
        //display matrix1
        displayMatrix(matrix1);
        //display operator
        switch (option) {
            case 1:
                System.out.println("+");
                break;
            case 2:
                System.out.println("-");
                break;
            case 3:
                System.out.println("*");
                break;
        }
        //display matrix2
        displayMatrix(matrix2);
        System.out.println("=");
        //display result
        displayMatrix(result);
    }
    
    //handle matrix
    void matrixHandling(int option) {
        //input size of matrix 1
        int row1 = getInputInt("Enter Row Matrix1: ", "Out of range!", 1, Integer.MAX_VALUE);
        int col1 = getInputInt("Enter Column Matrix1: ", "Out of range!", 1, Integer.MAX_VALUE);
        //input matrix1
        int[][] mat1 = newMatrix(row1, col1);
        int row2, col2;
        //force user input exectly row of matrix2
        while (true) {
            row2 = getInputInt("Enter Row Matrix2: ", "Out of range!", 1, Integer.MAX_VALUE);
            //check if operator is multiple or not
            if (option != 3) {
                //check if row of matrix2 equal row of matrix1 or not
                if (row2 != row1) {
                    System.out.println("Two matrix must be same size!");
                } else {
                    break;
                }
            } else {
                //check if row of matrix2 equal column of matrix1 or not
                if (row2 != col1) {
                    System.out.println("Matrix2 rows number must equal Matrix1 cols number!");
                } else {
                    break;
                }
            }
        }
        //force user input exectly column of matrix2
        while (true) {
            col2 = getInputInt("Enter Column Matrix2: ", "Out of range!", 1, Integer.MAX_VALUE);
            //check if operator is multiple or not
            if (option != 3) {
                //check if column of matrix2 equal column of matrix1 or not
                if (col2 != col1) {
                    System.out.println("Two matrix must be same size!");
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        //input matrix2
        int[][] mat2 = newMatrix(row2, col2);
        int[][] result;
        switch (option) {
            case 1: //add matrix1 and matrix2
                result = new int[row1][col1];
                result = additionMatrix(mat1, mat2);
                displayResult(mat1, mat2, result, option);
                break;
            case 2: //sub matrix1 and matrix2
                result = new int[row1][col1];
                result = subtractionMatrix(mat1, mat2);
                displayResult(mat1, mat2, result, option);
                break;
            case 3: // mul matrix1 and matrix2
                result = new int[row1][col2];
                result = multiplicationMatrix(mat1, mat2);
                displayResult(mat1, mat2, result, option);
                break;
        }
    }

}
