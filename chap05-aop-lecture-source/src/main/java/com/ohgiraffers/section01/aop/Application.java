package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Member;

public class Application {
    public static void main(String[] args) {

        ApplicationContext  context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");

        MemberService memberService =
                (MemberService) context.getBean("memberService");

        System.out.println("================= selectAllMebers ===================");
        System.out.println(memberService.selectMembers());
        System.out.println("================= selectAllMeberById ===================");
        System.out.println(memberService.selectMember(1L));

    }
}
