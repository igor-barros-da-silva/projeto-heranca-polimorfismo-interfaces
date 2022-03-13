package pacote.classe;

import java.util.ArrayList;
import java.util.List;

import pacote.constante.StatusAluno;

// Classe Aluno/Objeto nome que representa o Aluno.
public class Aluno extends Pessoa {

	/*
	 * Esses são os atributos do Aluno, representa as características do mundo real.
	 */
	// Por padrão os atributos são privados.
	/*
	 * Private é para manter o controle de acesso a variáveis, evitando que o
	 * programador chame a variável de forma errada, alterando o valor dela causando
	 * erro no sistema.
	 */
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	// Método construtor - Cria os dados na memória, sendo padrão do Java.
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomePadrao) {
		super.nome = nomePadrao; // não sendo necessário pelo uso do "extends".
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/* Métodos GETTERS E SETTERS do objeto. */
	// SET é para adicionar ou receber dados dos atributos.
	// GET é para obter o valores dos atributos.

	// Método SET que recebe dado.
	public void setNome(String nome /* nome = paramêtro */) {
		this.nome = nome; // this = operador do Java
	}

	// Método GET que busca o dado.
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Método que retorna a média da nota.
	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	// Método que retorna a aprovação ou reprovação.
	public boolean getAlunoAprovado() {
		// Aproveitando o código.
		double media = this.getMediaNota();
		if (media >= 60) {
			return true;
		} else
			return false;
	}

	// Método que retorna se o aluno está em recuperação.
	public String getAlunoAprovado1() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 60) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 60) {
			return StatusAluno.APROVADO;
		} else
			return StatusAluno.REPROVADO;
	}

	/* ====================================================================== */

	// Equals e Hashcode - Diferenciar e comparar objetos.
	// Subscrita - Diferenciar pelo nome o objeto Java.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", disciplinas=" + disciplinas + "]";
	}

	// Testando @Override - identifica método sobreescrito.
	// Repare o construtor "super.".
	@Override
	public Boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		// return super.pessoaMaiorIdade();
		return idade >= 21;
	}

	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Pessoa maior de idade! " : "Pessoa menor de idade!";
	}
}
