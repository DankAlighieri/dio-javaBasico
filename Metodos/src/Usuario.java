public class Usuario {
	public static void main(String[] args) throws Exception {

		SmartTv smartTv = new SmartTv();

		smartTv.diminuirVolume(5);
		System.out.println("Volume: " + smartTv.volume);
		smartTv.aumentarVolume(5);
		System.out.println("Volume: " + smartTv.volume);

		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal: " + smartTv.canal);


		smartTv.ligar();
		System.out.println("TV Ligada? " + smartTv.ligada);

		smartTv.desligar();
		System.out.println("TV Ligada? " + smartTv.ligada);
	}
}
