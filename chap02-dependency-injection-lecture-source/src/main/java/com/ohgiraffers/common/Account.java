package com.ohgiraffers.common;

public interface Account {

    //잔액 조회
    String getBalance();
    //입금
    String deposit(double money);
    //출금
    String withDraw(int money);
}
