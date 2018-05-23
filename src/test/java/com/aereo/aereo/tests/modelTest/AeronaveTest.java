package com.aereo.aereo.tests.modelTest;

import com.aereo.aereo.model.Aeronave;
import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AeronaveTest {

    private Aeronave aeronave;

    @Before
    public void criaAeronave() {
        this.aeronave = new Aeronave();
    }

    @After
    public void fim() {
        System.out.println("FIM");
    }

    @BeforeClass
    public static void testandoBeforeClass() {
        System.out.println("BEFORE CLASS");
    }

    @AfterClass
    public static void testandoAfterClass() {
        System.out.println("AFTER CLASS");
    }

    @Test
    public void aeronave() {
        /*aeronave.setId(1234);
        aeronave.setNome("BOING 777");
        aeronave.setCapacidadePassageiro(230);
        aeronave.poltronasOcupadas(0);
        aeronave.setPoltronasVagas(230);*/

        //Aeronave aeronave = new Aeronave("BOING 777", 230, 230, 0);

        System.out.println(aeronave.getNome());
    }

}
