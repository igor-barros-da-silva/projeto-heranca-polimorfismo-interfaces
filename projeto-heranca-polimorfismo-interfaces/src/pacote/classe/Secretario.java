package pacote.classe;

import pacote.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	private String login;
	private String senha;

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
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
