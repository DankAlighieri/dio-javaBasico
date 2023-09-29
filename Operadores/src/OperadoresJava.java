public class OperadoresJava {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if (condicao1 && condicao2) {
			System.out.println("Both are true.");
		} else if (condicao1 || condicao2) {
			System.out.println("One is true.");
		}

		System.out.println("The end.");
	}
}
