package com.zeun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Storage<String> stringGeneric = new Storage<>();
        stringGeneric.setItem("Hello Generic");

        System.out.println(stringGeneric.getItem());

        GenericPrinter gp = new GenericPrinter();
        gp.printTwice("Java");
        gp.printTwice(123);

        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world");

        List<Integer> intList = Arrays.asList(1, 2, 3);

        gp.printList(strList);
        gp.printList(intList);

        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        NumberBox<Double> doubleNumberBox = new NumberBox<>();

        integerNumberBox.addItem(7);
        integerNumberBox.addItem(10);
        integerNumberBox.addItem(20);

        doubleNumberBox.addItem(10.0);
        doubleNumberBox.addItem(15.0);
        doubleNumberBox.addItem(12.0);

        System.out.println((int)(integerNumberBox.getSum()));
        System.out.println((int)(doubleNumberBox.getSum()));

    }
}
