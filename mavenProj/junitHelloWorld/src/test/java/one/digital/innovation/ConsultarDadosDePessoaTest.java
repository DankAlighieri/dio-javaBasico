package one.digital.innovation;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosDePessoaTest {

	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
	}


	@BeforeEach
	void insereDadosParaTeste(){
		BancoDeDados.inserirDados(new Pessoa("Joao", LocalDate.now()));
	}

	@AfterEach
	void removeDadosDoTeste(){
		BancoDeDados.removeDados(new Pessoa("Joao", LocalDate.now()));
	}

	@Test
	void validarDadosDeRetorno() {
		assertTrue(true);
	}

	@Test
	void validarDadosDeRetorno2() {
		assertNull(null);
	}

	@AfterAll
	static void finalizouConexao() {
		BancoDeDados.finalizouConexao();
	}

}
