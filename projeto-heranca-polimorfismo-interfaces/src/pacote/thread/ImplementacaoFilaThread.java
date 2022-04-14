package pacote.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Iterator iteracao = pilha_fila.iterator();

		synchronized (iteracao) { // Bloquear o acesso a esta lista por outros processos.

			while (iteracao.hasNext()) { // Enquanto conter dados na lista irá processar.

				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // Pega o objeto atual.

				// Processar 10 mil notas fiscais.
				// Gerar uma lista enorme de PDF.
				// Gerar um envio em massa de email.

				System.out.println("--------------------------");

				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());

				iteracao.remove();

				try {
					Thread.sleep(100); // Dar um tempo para descarga de memória.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		try {
			Thread.sleep(1000); // Processou toda a lista e da um tempo para limpeza de memória.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
