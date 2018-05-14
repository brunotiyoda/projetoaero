package com.aereo.aereo.tests.modelTest;

import com.aereo.aereo.model.Passageiro;
import org.junit.Before;
import org.junit.Test;

public class PassageiroTest {

    private Passageiro passageiro;

    @Before
    public void criaPassageiro() {
        this.passageiro = new Passageiro();
    }

    @Test
    public void insertNomePassageiro() {
        passageiro.setNome("YODA");
        System.out.println(passageiro.getNome());
    }


}
