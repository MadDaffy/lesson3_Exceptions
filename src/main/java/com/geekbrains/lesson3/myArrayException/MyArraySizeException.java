package com.geekbrains.lesson3.myArrayException;

public class MyArraySizeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Неверный размер массива. Укажите массив размером [4][4]";
    }
}
