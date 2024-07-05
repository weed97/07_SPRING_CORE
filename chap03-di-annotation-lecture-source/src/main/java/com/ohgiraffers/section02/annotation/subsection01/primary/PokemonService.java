package com.ohgiraffers.section02.annotation.subsection01.primary;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pokemonServicePrimary")
public class PokemonService {

    private Pokemon poketmon;
    @Autowired

    public PokemonService(Pokemon poketmon) {
        this.poketmon = poketmon;
    }

    public void pokemonAttack() {

        poketmon.attack();
    }
}
