package pacote.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	/* Método construtor que executa o que estiver dentro no momento da abertura ou execução. */
	public TelaTimeThread() {
		// TODO Auto-generated constructor stub
		// Primeira parte da tela.
		setTitle("Tela de Time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		// Sempre será o último comando.
		setVisible(true); /* Torna a tela visível para o usuário. */
	}

}
