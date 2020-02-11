package com.company;

import java.util.Arrays;

public class OperationsWithArray {
    public void LookingForMaxValue() {
        int[] ArrayOfNumbers = {1, 5, 24, 0, 2, 55, 35, 99, 87};
        int maxValue = 0;
        System.out.println("Looking for maximum value of array : ");
        System.out.println(Arrays.toString(ArrayOfNumbers));
        for (int arrayOfNumber : ArrayOfNumbers) if (maxValue < arrayOfNumber) maxValue = arrayOfNumber;
        System.out.println("The maximal value is " + maxValue);
    }

    public void RearrangeRowsInArray(int changingRows1, int changingRows2) {
        int[][] MatrixOfNumbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int helpingChangeVariable;
        System.out.println(Arrays.deepToString(MatrixOfNumbers));
        System.out.println("Swap " + changingRows1 + " and " + changingRows2 + " rows");
        for (int columnIndex = 0; columnIndex < MatrixOfNumbers.length; columnIndex++) {
            helpingChangeVariable = MatrixOfNumbers[changingRows1][columnIndex];
            MatrixOfNumbers[changingRows1][columnIndex] = MatrixOfNumbers[changingRows2][columnIndex];
            MatrixOfNumbers[changingRows2][columnIndex] = helpingChangeVariable;

        }
        System.out.println("The result : ");
        System.out.println(Arrays.deepToString(MatrixOfNumbers));

    }


    public void RearrangeColumnsInArray(int changingColumns1, int changingColumns2) {
        int[][] MatrixOfNumbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int helpingChangeVariable;
        System.out.println(Arrays.deepToString(MatrixOfNumbers));
        System.out.println("Swap " + changingColumns1 + " and " + changingColumns2 + " columns");
        for (int rowsIndex = 0; rowsIndex < MatrixOfNumbers[0].length; rowsIndex++) {
            helpingChangeVariable = MatrixOfNumbers[rowsIndex][changingColumns1];
            MatrixOfNumbers[rowsIndex][changingColumns1] = MatrixOfNumbers[rowsIndex][changingColumns2];
            MatrixOfNumbers[rowsIndex][changingColumns2] = helpingChangeVariable;

        }
        System.out.println("The result : ");
        System.out.println(Arrays.deepToString(MatrixOfNumbers));

    }

    public void MultiplicationMatrixsMembersUnderMainDiagonal() {
        int[][] MatrixOfNumbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int productOfNumbers = 1;
        System.out.println(Arrays.deepToString(MatrixOfNumbers));
        System.out.println("Multiply the elements of the matrix that are under the main diagonal");
        for (int rowsIndex = 0; rowsIndex < MatrixOfNumbers.length; rowsIndex++) {
            for (int columnIndex = 0; columnIndex < rowsIndex; columnIndex++)
                productOfNumbers *= MatrixOfNumbers[rowsIndex][columnIndex];
        }
        System.out.println("The result : ");
        System.out.println(productOfNumbers);
    }
}
