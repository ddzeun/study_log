package com.zeun.ramyun;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RamyunAspect {

    @Pointcut("execution(* com.zeun.ramyun.RamyunService.cookRamyun(..))")
    public void ramyunPointCut() {}

    @Before("ramyunPointCut()")
    public void washHands(JoinPoint joinPoint) {
        System.out.println("🧼 조리 전 손 씻기 완료!");
    }

    @After("ramyunPointCut()")
    public void takePhotoAndEat() {
        System.out.println("📸 조리 후 사진 한 컷 찰칵!");
        System.out.println("😋 이제 맛있게 먹자~ 냠냠!");
    }
}

/*  @Pointcut을 안쓰면?

@Aspect
@Component
public class RamyunAspect {

    @Before("execution(* com.zeun.ramyun.RamyunService.cookRamyun(..))")        --> 재사용성과 코드 가독성이 떨어짐
    public void washHands(JoinPoint joinPoint) {
        System.out.println("🧼 조리 전 손 씻기 완료!");
    }

    @After("execution(* com.zeun.ramyun.RamyunService.cookRamyun(..))")
    public void takePhotoAndEat() {
        System.out.println("📸 조리 후 사진 한 컷 찰칵!");
        System.out.println("😋 이제 맛있게 먹자~ 냠냠!");
    }

}



*/