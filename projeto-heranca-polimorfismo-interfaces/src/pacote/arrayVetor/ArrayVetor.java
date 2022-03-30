package pacote.arrayVetor;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {9.0, 8.2, 8.9, 6.8};
		double[] notas2 = {5.6, 8.4, 6.9, 8.7};
		
		Aluno aluno = new Aluno();		
		aluno.setNome("José");
		aluno.setDataNascimento("12/06/1992");
		
		Disciplina disciplina = new Disciplina();		
		disciplina.setDisciplina("Java");		
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);	
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Linguagem de Programação");
		disciplina2.setNota(notas2);
		
		aluno.getDisciplinas().add(disciplina2);
		
		// Percorrendo array de objetos.
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina eh:" + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota ++) {
					System.out.println("As notas são: " + d.getNota()[posnota]);
				}
			}
		}		
	}
}
