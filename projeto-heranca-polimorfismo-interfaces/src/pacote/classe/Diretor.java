package pacote.classe;

public class Diretor extends Pessoa {

	private String registroEducacao;
	private String tempoDirecao;
	private String titulaçao;

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public String getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulaçao() {
		return titulaçao;
	}

	public void setTitulaçao(String titulaçao) {
		this.titulaçao = titulaçao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulaçao="
				+ titulaçao + "]";
	}

}
