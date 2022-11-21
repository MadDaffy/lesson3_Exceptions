package com.geekbrains.lesson3;

import com.geekbrains.lesson3.myArrayException.MyArrayDataException;
import com.geekbrains.lesson3.myArrayException.MyArraySizeException;

public class MainApp {
    public static void main(String[] args) {

        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1"},
        };

        System.out.println(getArraySum(array));
    }

    public static int getArraySum(String[][] array4x4) {
        if (array4x4.length != 4) {
            throw new MyArraySizeException();
        }

        int sumArray = 0;

        for (int row = 0; row < array4x4.length; row++) {
            if (array4x4[row].length != 4) {
                throw new MyArraySizeException();
            }
            for (int column = 0; column < array4x4[row].length; column++) {
                try {
                    sumArray += Integer.parseInt(array4x4[row][column]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(row, column, array4x4);
                }
            }
        }
        return sumArray;
    }

}