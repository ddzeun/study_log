package com.zeun.model;

import java.util.HashMap;
import java.util.Map;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public int getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {

        Map<Integer, String> categories = new HashMap<>();
        categories.put(1, "인문");
        categories.put(2, "자연과학");
        categories.put(3, "의료");
        categories.put(4, "기타");

        return "책 번호:" + bNo +
                ", 카테고리: " + categories.get(category) +
                ", 제목: " + title +
                ", 저자: " + author;
    }
}
