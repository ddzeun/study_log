package com.zeun.controller;

import com.zeun.model.BookDTO;
import com.zeun.model.comparator.AscCategory;
import com.zeun.model.comparator.DescCategory;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    private ArrayList<BookDTO> bookList = new ArrayList<>();

    public BookManager() {}

    public void addBook(BookDTO book) {
        bookList.add(book);
        System.out.println("도서가 추가되었습니다.");
    }

    public void deleteBook(int index) {
        bookList.remove(index);
    }

    public int searchBook(String bTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(bTitle)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        BookDTO selectedBook = bookList.get(index);
        System.out.println(selectedBook.toString());
    }

    public void displayAll() {
        int len = bookList.size();
        if (len == 0) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            for (int i = 0; i < len; i++) {
                System.out.println(bookList.get(i).toString());
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sortedBookList = new ArrayList<>(bookList);

        if (select == 1) {
            sortedBookList.sort(new AscCategory());
        } else {
            sortedBookList.sort(new DescCategory());
        }
        return sortedBookList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book: br) {
            System.out.println(book);
        }
    }
}
