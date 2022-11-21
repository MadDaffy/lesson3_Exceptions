package com.geekbrains.lesson3;

import com.geekbrains.lesson3.myArrayException.MyArrayDataException;
import com.geekbrains.lesson3.myArrayException.MyArraySizeException;

//Практическое задание
//        1. Создайте исключения: MyArraySizeException (неправильный размер массива), и
//        MyArrayDataException (в ячейке массива лежит что-то не то);
//        2. Напишите метод, на вход которого подаётся двумерный строковый массив (String[][]) размером
//        4×4. При подаче массива другого размера необходимо бросить исключение
//        MyArraySizeException.
//        3. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
//        просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
//        ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//        MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. Расчет
//        данных для этой матрицы прекращается.
//        4. В методе main() нужно вызвать полученный метод, обработать возможные исключения
//        MySizeArrayException и MyArrayDataException и вывести результат расчёта.
//            Заметка: для преобразования строки в число можно использовать метод класса Integer:
//        Integer. valueOf ( "1" )

public class MainApp {
    public static void main(String[] args) {

        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "wrong"},
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