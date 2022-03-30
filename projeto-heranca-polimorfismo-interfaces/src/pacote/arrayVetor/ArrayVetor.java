package pacote.arrayVetor;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();		
		aluno.setNome("José");
		aluno.setDataNascimento("12/06/1992");
		
		Disciplina disciplina = new Disciplina();		
		disciplina.setDisciplina("Java");
		
		double[] notas = {9.0, 8.2, 8.9, 7.8};
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
	}

}
