package com.zeun.view;

import com.zeun.model.BookDTO;
import com.zeun.controller.BookManager;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu () {}

    public void menu() {


        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가\n2. 도서정보 정렬 후 출력\n3. 도서 삭제\n4. 도서 검색출력\n5. 전체 출력\n6. 끝내기");
            System.out.print("메뉴 번호 선택: ");

            int select = sc.nextInt();
            switch (select) {
                case 1:
                    bm.addBook(inputBook());
                    break;

                case 2:
                    System.out.println("정렬방식을 선택해주세요 (1. 오름차순, 2. 내림차순)");

                    int sortType = sc.nextInt();

                    if ((sortType == 1) || (sortType == 2)) {
                        bm.printBookList(bm.sortedBookList(sortType));
                    }
                    else {
                        System.out.println("번호를 잘못입력하였습니다.");
                    }
                    break;

                case 3:
                    int deleteBook = bm.searchBook(inputBookTitle());
                    if (deleteBook == -1) {
                        System.out.println("삭제할 도서가 존재하지 않음");
                    } else {
                        bm.deleteBook(deleteBook);
                        System.out.println("성공적으로 삭제");
                    }
                    break;

                case 4:
                    int searchBook = bm.searchBook(inputBookTitle());
                    if (searchBook == -1) {
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else {
                        int index = searchBook;
                        bm.printBook(index);
                    }
                    break;

                case 5:
                    bm.displayAll();
                    break;

                case 6:
                    return;
            }
        }
    }

    public BookDTO inputBook() {

        int bNo = (int)(Math.random() * 100);

        System.out.print("도서 제목: ");
        String title = sc.next();

        System.out.print("도서 장르(1: 인문 / 2: 자연과학 / 3: 의료 / 4: 기타): ");
        int category = sc.nextInt();

        System.out.print("도서 저자: ");
        String author = sc.next();

        BookDTO newBook = new BookDTO(bNo, category, title, author);

        return newBook;
    }

    public String inputBookTitle() {
        System.out.print("도서 제목: ");

        String title = sc.next();
        return title;
    }
}
