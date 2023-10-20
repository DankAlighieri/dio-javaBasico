package one.digital.innovation;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

/**
 * Unit test for simple Pessoa.
 */
public class PessoaTest extends TestCase {

    @Test
    void deveValidarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(3, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhIdadeMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Julia", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
    }
}
