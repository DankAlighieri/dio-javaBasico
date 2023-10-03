public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;

//	alterar volume
	public void aumentarVolume(int vezes) {
		for (int i = 0; i < vezes; i++) {
			volume++;
		}
	}
	public void diminuirVolume(int vezes) {
		for (int i = 0; i < vezes; i++) {
			volume--;
		}
	}
// liga desliga
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
// mudar canal
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	public void aumentarCanal() {
		canal ++;
	}
	public void diminuirCanal() {
		canal --;
	}
}
