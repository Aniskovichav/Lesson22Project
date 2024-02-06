package by.itstep.aniskovich.java.lesson22.controller;

import by.itstep.aniskovich.java.lesson22.model.entity.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        System.out.println(array.convert());

        array.add(5);
        array.add(7);
        array.add(34);
        array.add(2);
        array.add(8);

        System.out.println(array.convert());

        array.remove(3);
        array.remove(2);

        System.out.println(array.convert());
    }
}
