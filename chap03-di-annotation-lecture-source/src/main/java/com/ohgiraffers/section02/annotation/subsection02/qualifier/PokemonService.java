package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
* - 여러 개의 빈 객체 중에서 특정 빈 객체를 이름으로 지정하는 어노테이션이다.
* - @Primary 어노테이션과 @Qualifier 어노테이션이 함꼐 쓰였을 떄, @Qualifier가 우선한다.
* */
@Service("pokemonServiceQualifier")
public class PokemonService {

//    // 1. 필드 주입방식
//    @Qualifier("pokemonServiceQualifier")
//    @Autowired

    private Pokemon pokemon;


@Autowired
public void pokemonService(@Qualifier("squirtle") Pokemon pokemon) {
    this.pokemon = pokemon;
}
        public void pokemonAttack() {
            pokemon.attack();
        }

}
