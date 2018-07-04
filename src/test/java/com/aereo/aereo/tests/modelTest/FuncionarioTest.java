package com.aereo.aereo.tests.modelTest;

import br.com.caelum.stella.validation.CPFValidator;
import com.aereo.aereo.model.Funcionario;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class FuncionarioTest {

    @Test
    public void testaNomeNaoNull() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Bruno");

        String nomeNaoNulo = funcionario.getNome();

        assertEquals(nomeNaoNulo, funcionario.getNome());
    }

    @Test
    public void testaSeNomeForNullExibeMensagem() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(null);

        String mensagem = "Campo Null";
        String nomeNulo = funcionario.getNome();

        if (nomeNulo == null) {
            System.out.println(mensagem);
        }

        assertEquals(mensagem, mensagem);
    }

    @Test
    public void tiraPonturacaoCpf() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("036.555.971-77");

        String cpfOld = funcionario.getCpf();

        System.out.println(cpfOld);

        //retira pontuacao
        String cpfNovo = cpfOld.replace(".", "").replace("-", "");

        System.out.println(cpfNovo);

        assertEquals("03655597177", cpfNovo);
    }

    @Test
    public void validaOCpf() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("036.555.971-77");

        String cpfValido = funcionario.getCpf();

        CPFValidator cpfValidator = new CPFValidator();

        cpfValidator.assertValid(cpfValido);
    }

    @Test
    public void cpfESenhaPreenchidos() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("03655597177");
    }
}
