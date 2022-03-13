package pacote.principal;

import pacote.classe.Aluno;
import pacote.classe.Diretor;
import pacote.classe.Pessoa;
import pacote.classe.Secretario;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// impedindo que ela possa ser instânciada.
		// Pessoa pessoa = new Pessoa();
		
		Aluno aluno = new Aluno(); 
		aluno.setNome("Igor");
		aluno.setIdade(19);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("5asd4561d32a13");
		diretor.setIdade(20);
		
		Secretario secretario= new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(17);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario.getExperiencia());
		
		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		
		System.out.println(diretor.salario());
		System.out.println(secretario.salario());
	}

}
