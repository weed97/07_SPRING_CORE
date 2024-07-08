package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MemberDAO {

    private final Map<Long, MemberDTO> memberMap;

    public MemberDAO(Map<Long, MemberDTO> memberMap) {
        this.memberMap = memberMap;
        memberMap.put(1L, new MemberDTO(1L, "홍길동"));
        memberMap.put(2L, new MemberDTO(2L, "유관순"));
    }

    //모든 회원 조회

    public Map<Long, MemberDTO> selectMembers() {

        return memberMap;
    }

    // id로 특정 회원 조회
    public MemberDTO selectMember(Long id) {
        MemberDTO returnMember = memberMap.get(id);

        if (returnMember == null)
            throw new RuntimeException("해당 id의 회원이 없습니다. ");

        return returnMember;

    }
}
