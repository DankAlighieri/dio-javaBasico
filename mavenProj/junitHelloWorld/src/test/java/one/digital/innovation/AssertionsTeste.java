package one.digital.innovation;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

// importacao estatica dos metodos para diminuir verbosidade
import static org.junit.jupiter.api.Assertions.*;



public class AssertionsTeste {

	@Test
	void validarLancamentos() {

		int[] primeiroLancamento = {10, 20, 30, 40, 50};
		int[] segundoLancamento ={10, 5, 2, 3, 10};

		assertNotEquals(primeiroLancamento, segundoLancamento);
	}

	@Test

	void validarSeObjetoEstaNulo(){
		Pessoa pessoa = null;
		assertNull(pessoa);

		Pessoa luciano = new Pessoa("Luciano", LocalDate.now());
		assertNotNull(luciano);
	}

	void validarSeNumerosSaoIguais() {
		double valor = 5.0;
		double outroValor = 5.0;

		assertEquals(valor, outroValor);
	}
}
