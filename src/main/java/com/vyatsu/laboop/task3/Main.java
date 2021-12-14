package com.vyatsu.laboop.task3;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = ((int) (Math.random() * (100) - 1));
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        try {
            try {
                int result = method(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен");
            }
        } catch (MyArrayDataException e) {
        }
    }

    public static int method(int[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 10) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 10) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    if (array[i][j] % 2 > 0)
                        throw new MyArrayDataException(i, j);
                } catch (NumberFormatException e) {
                    e.printStackTrace(System.out);
                    throw new MyArrayDataException(i, j);
                }
                catch (MyArrayDataException e){
                    e.printStackTrace();
                }
            }
        }
        return count;
    }
}
