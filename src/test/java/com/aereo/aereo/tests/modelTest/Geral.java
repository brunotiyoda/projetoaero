/**
 * Classe que principal que faz uma simulação geral
 * */
package com.aereo.aereo.tests.modelTest;

import com.aereo.aereo.model.Aeronave;
import com.aereo.aereo.model.Passageiro;
import com.aereo.aereo.model.Voo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Geral {

    private Passageiro bruno;
    private Passageiro fabio;
    private Passageiro marcia;
    private Passageiro patrick;
    private Voo voo;
    private Aeronave aeronave;


    @Before
    public void criaObjetos() {
        this.bruno = new Passageiro();
        this.fabio = new Passageiro();
        this.marcia = new Passageiro();
        this.patrick = new Passageiro();

        this.voo = new Voo();

        this.aeronave = new Aeronave();
    }

    @Test
    public void voo4609() {
        bruno.setId(2406);
        bruno.setNome("Bruno Yudi Tiyoda");
        bruno.setDocumento("03655597177");
        bruno.setEmail("bruno_tiyoda@hotmail.com");
        bruno.setTelefone("+5562996793516");

        aeronave.setNome("Boing 777");
        aeronave.setCapacidadePassageiro(230);
        aeronave.setPoltronasVagas(230);
        aeronave.setId(159753);

        voo.setId(4609);
        voo.setCidadeDePartida("Goiânia");
        voo.setCidadeDeDestino("São Paulo");
        voo.setNumeroVoo(4609);
        voo.setAeronave(aeronave);

        bruno.setVoo(voo);

        List<Passageiro> quantidadePassageiros = new ArrayList<>();

        quantidadePassageiros.add(bruno);

        voo.setQuantidadePassageirosNoVoo(quantidadePassageiros);

        aeronave.setPoltronasVagas(aeronave.getPoltronasVagas() - quantidadePassageiros.size());

        System.out.println("numero voo...................: " + voo.getNumeroVoo());
        System.out.println("quantidade passageiros no voo: " + voo.getQuantidadePassageirosNoVoo().size());
        System.out.println("nome aeronave................: " + voo.getAeronave().getNome());
        System.out.println("capacidade para passageiros..: " + voo.getAeronave().getCapacidadePassageiro());
        System.out.println("poltronas vagas..............: " + voo.getAeronave().getPoltronasVagas());
        System.out.println("origem.......................: " + voo.getCidadeDePartida());
        System.out.println("destino......................: " + voo.getCidadeDeDestino());


    }


}
