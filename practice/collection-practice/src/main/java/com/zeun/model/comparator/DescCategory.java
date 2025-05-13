package com.zeun.model.comparator;

import com.zeun.model.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        if (o1.getCategory() < o2.getCategory()) {
            return 1;
        } else if (o1.getCategory() > o2.getCategory()) {
            return -1;
        } else {
            return 0;
        }
    }
}