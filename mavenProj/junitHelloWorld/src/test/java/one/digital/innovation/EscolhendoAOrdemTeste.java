package one.digital.innovation;

import org.junit.jupiter.api.*;

//testando seguindo o @Order
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class EscolhendoAOrdemTeste {
//
//	@Order(4)
//	@Test
//	void validaFluxoA() {
//		Assertions.assertTrue(true);
//	}
//	@Order(3)
//	@Test
//	void validaFluxoB() {
//		Assertions.assertTrue(true);
//	}
//	@Order(2)
//	@Test
//	void validaFluxoC() {
//		Assertions.assertTrue(true);
//	}
//	@Order(1)
//	@Test
//	void validaFluxoD() {
//		Assertions.assertTrue(true);
//	}
//}


//testando por ordem crescente de nome
//@TestMethodOrder(MethodOrderer.MethodName.class)
//public class EscolhendoAOrdemTeste {
//
//	@Test
//	void validaFluxoA() {
//		Assertions.assertTrue(true);
//	}
//	@Test
//	void validaFluxoB() {
//		Assertions.assertTrue(true);
//	}
//	@Test
//	void validaFluxoC() {
//		Assertions.assertTrue(true);
//	}
//	@Test
//	void validaFluxoD() {
//		Assertions.assertTrue(true);
//	}
//}

//testando por ordem crescente do displayName
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

	@DisplayName("A")
	@Test
	void validaFluxoA() {
		Assertions.assertTrue(true);
	}
	@DisplayName("B")
	@Test
	void validaFluxoB() {
		Assertions.assertTrue(true);
	}
	@DisplayName("C")
	@Test
	void validaFluxoC() {
		Assertions.assertTrue(true);
	}
	@DisplayName("D")
	@Test
	void validaFluxoD() {
		Assertions.assertTrue(true);
	}
}