package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDAO;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers");

        MemberController memberController =context.getBean("memberController",MemberController.class);

        System.out.println(memberController.selectMember());



//
//        for (MemberDAO member : members) {
//            System.out.println(member);
//        }









    }
}
