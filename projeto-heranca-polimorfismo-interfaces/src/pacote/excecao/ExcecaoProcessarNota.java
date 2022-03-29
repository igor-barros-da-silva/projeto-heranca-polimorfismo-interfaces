package pacote.excecao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		// TODO Auto-generated constructor stub
		super("Erro ao processar notas!" + erro);
	}
	
}
