package com.zeun;

import java.util.ArrayList;
import java.util.List;

public class NumberBox <T extends Number> {

    private List<T> numbox = new ArrayList<>();

    public void addItem(T item) {
        numbox.add(item);
    }

    public double getSum() {
        double total = 0.0;
        for (int i = 0; i < numbox.size(); i++) {
            total += (numbox.get(i)).doubleValue();
        }
        return total;
    }
}
