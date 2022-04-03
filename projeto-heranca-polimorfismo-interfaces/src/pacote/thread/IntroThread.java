package pacote.thread;

public class IntroThread {

	public static void main(String[] args) throws InterruptedException {

		for (int pos = 0; pos < 10; pos++) {
			// Execução desse envio com um tempo de parada, ou com tempo determinado.
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
			Thread.sleep(1000); // Faz com que o thread atual suspenda a execução por um período especificado.
		}
		System.out.println("FIM DO CÓDIGO DE TESTE DE THREAD!");
	}

}
