package pacote.principal;

import pacote.classe.Aluno;
import pacote.classe.Diretor;
import pacote.classe.Secretario;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno(); 
		aluno.setNome("Igor");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("5asd4561d32a13");
		
		Secretario secretario= new Secretario();
		secretario.setExperiencia("Administração");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario.getExperiencia());
	}

}
