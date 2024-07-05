package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
@Configuration
public class ContextConfiguration {

    @Bean("member")
    public MemberDTO getMember() {
        System.out.println("geetMember 호출함...");
        return new MemberDTO(1,"user01","pass01","홍길동");
    }

}
