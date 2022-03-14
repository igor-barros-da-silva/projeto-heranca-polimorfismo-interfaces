package pacote.classe;

import pacote.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	private String login;
	private String senha;

	// Construtor padrão do Java
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Secretario() {
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 20 * 24;
	}

	@Override
	public boolean autenticar(String login, String senha) { // Evitando a redundância de dados
		this.login = login;
		this.senha = senha;
		// Chamando autenticar(); abaixo.
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}

}
