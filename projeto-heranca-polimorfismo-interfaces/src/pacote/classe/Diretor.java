package pacote.classe;

public class Diretor extends Pessoa {

	private String registroEducacao;
	private String tempoDirecao;
	private String titula�ao;

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

	public String getTitula�ao() {
		return titula�ao;
	}

	public void setTitula�ao(String titula�ao) {
		this.titula�ao = titula�ao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titula�ao="
				+ titula�ao + "]";
	}

}
