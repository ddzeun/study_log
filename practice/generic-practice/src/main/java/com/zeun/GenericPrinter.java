package com.zeun;

import java.util.List;

public class GenericPrinter<T> {

    public void printTwice(T item) {
        System.out.println(item);
        System.out.println(item);
    }

    public void printList(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
