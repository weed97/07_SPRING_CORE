package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper=true)
public class Bread extends Product{

    private LocalDate bakedData; // 생산시간

//    @Override
//    public String toString() {
//        return "Bread{" +
//                    super.toString()+
//                "bakedData=" + bakedData +
//                '}';
//    }

    // 부모클래스까지 초기화 하는 생성자
    public Bread(String name, int price, LocalDate bakedData) {
        super(name, price);  // 부모클래스의 생성자
        this.bakedData = bakedData;
    }


}
