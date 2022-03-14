package pacote.classesauxiliares;

import pacote.interfaces.PermitirAcesso;

// Realmente e somente receber alguém que tem o contrato da interface de permitirAcesso()
// e chamar o autenticar().
public class FuncaoAutorizacao {

	private PermitirAcesso permitirAcesso;

	public boolean autorizar() {
		return permitirAcesso.autenticar();

	}

	public FuncaoAutorizacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
