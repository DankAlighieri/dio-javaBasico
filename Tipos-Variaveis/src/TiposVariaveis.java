public class TiposVariaveis {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 2107033; // if it starts with 0, then it will probably need to be a String, instead of int
		long cpf = 98765432109L; // longs ends of "L". If it starts with 0, then it will probably need to be a String, instead of int
		float pi = 3.14F; // float has to ends of "f" or "F" to declare it as float
		double salario = 1275.33;
	}

	public static void fazerTipagem() {
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal; // needs to cast numeroNormal to short in order for it to compatible.
	}

	public static void fazerConstante() {
		String NUMERO = "whatever";
		NUMERO = "hello";

		// in this case, the uppercase
		double PI = 3.14;
		PI = 4;
	}
}
