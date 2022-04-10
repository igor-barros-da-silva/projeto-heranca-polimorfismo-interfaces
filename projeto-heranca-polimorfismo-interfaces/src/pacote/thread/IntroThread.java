package pacote.thread;

import javax.swing.JOptionPane;

public class IntroThread {

	public static void main(String[] args) throws InterruptedException {

		/* Thread 1 processando em paralelo do envio de email. */
		/* Transformando a Thread em objeto manipulável. */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		// DIVISÃO DAS THREAD
		
		/* Thread 2 processando em paralelo do envio de nota fiscal. */
		/* Transformando a Thread em objeto manipulável. */
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();

		// Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("FIM DO CÓDIGO DE TESTE DE THREAD!");
		// Fluxo do sistema, por exemplo: cadastro de venda, emissão de nota fiscal.
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário!");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			// Código da rotina.
			// Início do código da rotina executado em paralelo.
			for (int pos = 0; pos < 10; pos++) {

				// Execução desse envio com um tempo de parada, ou com tempo determinado.
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				} // Faz com que o thread atual suspenda a execução por um período especificado.
			} // Fim do código da rotina executado em paralelo.
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			// Código da rotina.
			// Início do código da rotina executado em paralelo.
			for (int pos = 0; pos < 10; pos++) {

				// Execução desse envio com um tempo de parada, ou com tempo determinado.
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				} // Faz com que o thread atual suspenda a execução por um período especificado.
			} // Fim do código da rotina executado em paralelo.
		}
	};

}
