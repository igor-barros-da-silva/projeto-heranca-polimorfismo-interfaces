package pacote.thread;

import javax.swing.JOptionPane;

public class IntroThread {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo. */
		new Thread() {
			/*
			 * Método run onde ficam os procedimentos que você deseja executar
			 * paralelamente.
			 */
			public void run() {
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
			};

		}.start(); /*
					 * Iniciando o processamento paralelo, e liberando o programa para executar
					 * qualquer outra thread.
					 */

		// Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("FIM DO CÓDIGO DE TESTE DE THREAD!");
		// Fluxo do sistema, por exemplo: cadastro de venda, emissão de nota fiscal.
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário!");
	}

}
