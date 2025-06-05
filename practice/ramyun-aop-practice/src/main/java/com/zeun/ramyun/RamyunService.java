package com.zeun.ramyun;

import org.springframework.stereotype.Service;

@Service
public class RamyunService {

    public void boilWater() {
        System.out.println("물 끓이는 중...");
    }

    public void addNoodles() {
        System.out.println("면 넣는 중...");
    }

    public void addSoup() {
        System.out.println("스프 넣는 중...");
    }

    public void eat() {
        System.out.println("라면 먹는 중... 냠냠 😋");
    }

    public void cookRamyun() {
        System.out.println("[🍜 라면 조리 시작]");
        boilWater();
        addNoodles();
        addSoup();
        System.out.println("[🍜 라면 조리 끝]");
    }
}