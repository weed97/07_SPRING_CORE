package com.ohgiraffers.section03.annotationconfig.subsection01;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.section02.javaconfig.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

    ApplicationContext context =
            new AnnotationConfigApplicationContext(ContextConfiguration.class);

    /*
     * getBeanDefinitionNames : 스프링 컨테이너에서 생성된 bean들의 이름을 배열로 반환한다.
     * */
    String[] beanNanmes = context.getBeanDefinitionNames();
        for (String beanName : beanNanmes) {
        System.out.println("beanName: " + beanName);

    }

    MemberDAO memberDAO = (MemberDAO) context.getBean("memberDAO",MemberDAO.class);

        System.out.println(memberDAO.selectMember(1));
        System.out.println(memberDAO.selectMember(2));

        System.out.println(memberDAO.insertMember(new MemberDTO(3,"user03","pass03","tlstkdlaekd")));
        System.out.println(memberDAO.selectMember(3));
    }
}


