package com.ohgiraffers.practice02.avaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("member")
    public  MemberDTO writerGenerator() {
        return new MemberDTO(1L, "봄이올까요");
    }
    @Bean("board")
    public BoardDTO boardGenerator() {
        BoardDTO board = new BoardDTO();

        board.setId(1L);
        board.setTitle("의존성 주입 연습,");
        board.setContent("게시글의 작성자 객체를 주입 받아볼게요!,");
        board.setWriter(writerGenerator());

        return board;
    }
}
