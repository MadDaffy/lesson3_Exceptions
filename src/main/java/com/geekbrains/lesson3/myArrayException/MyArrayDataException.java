package com.geekbrains.lesson3.myArrayException;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int row, int column, String[][] array) {
        super("Неверное значение в " + column + " колонке "
                + row + " строки, а именео: " + array[row][column]);
    }

}
