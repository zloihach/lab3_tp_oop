package com.vyatsu.laboop.task3;

public class MyArrayDataException extends RuntimeException {
    public int i;
    public int j;
    MyArrayDataException(int i, int j){
        super("Ошибка в ячейке" + i+"x"+j);
        this.i = i;
        this.j = j;
    }
}
