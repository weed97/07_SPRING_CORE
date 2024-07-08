package com.ohgiraffers.common;

import lombok.*;

import javax.annotation.processing.Generated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private String name;  // 상품명
    private int price; // 상품가격

}
