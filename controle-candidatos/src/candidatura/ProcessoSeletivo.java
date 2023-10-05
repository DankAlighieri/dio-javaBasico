package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for (String candidato: candidatos) {
			entrandoEmContato(candidato);
		}

	}

	static void entrandoEmContato(String candidato){
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
//			precisarao sofrer alteracoes

			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		} while(continuarTentando && tentativasRealizadas < 3);

		if(atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MÁXIMO DE TENTATIVAS ATINGIDO.");
		}
	}

	// metodo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}

	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elementos");
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de n. " + (i+1) + " eh " + candidatos[i]);
		}

		System.out.println("Forma abreviada");

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}

	static void selecaoCandidato() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			System.out.println(candidato + " solicitou este valor de salario " + salarioPretendido);

			if (salarioPretendido <= salarioBase) {
				System.out.println(candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			} else {
				System.out.println(candidato + " nao foi selecionado");
			}
			candidatoAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}


	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;

		if(salarioPretendido < salarioBase) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if (salarioPretendido == salarioBase) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
		}
	}
}
