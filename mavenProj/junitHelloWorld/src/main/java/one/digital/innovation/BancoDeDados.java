package one.digital.innovation;

import java.util.logging.Logger;

public class BancoDeDados {
	private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

	public static void iniciarConexao() {
		LOGGER.info("Iniciou Conexao");
	}

	public static void finalizouConexao() {
		LOGGER.info("Finalizou Conexao");
	}


	public static void inserirDados(Pessoa pessoa){
		LOGGER.info("Inseriu Dados");
	}

	public static void removeDados(Pessoa pessoa){
		LOGGER.info("Remove Dados");
	}
}
