package pacote.classe;

import java.util.ArrayList;
import java.util.List;

import pacote.constante.StatusAluno;

// Classe Aluno/Objeto nome que representa o Aluno.
public class Aluno extends Pessoa {

	/*
	 * Esses s�o os atributos do Aluno, representa as caracter�sticas do mundo real.
	 */
	// Por padr�o os atributos s�o privados.
	/*
	 * Private � para manter o controle de acesso a vari�veis, evitando que o
	 * programador chame a vari�vel de forma errada, alterando o valor dela causando
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

	// M�todo construtor - Cria os dados na mem�ria, sendo padr�o do Java.
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomePadrao) {
		super.nome = nomePadrao; // n�o sendo necess�rio pelo uso do "extends".
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	/* M�todos GETTERS E SETTERS do objeto. */
	// SET � para adicionar ou receber dados dos atributos.
	// GET � para obter o valores dos atributos.

	// M�todo SET que recebe dado.
	public void setNome(String nome /* nome = param�tro */) {
		this.nome = nome; // this = operador do Java
	}

	// M�todo GET que busca o dado.
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// M�todo que retorna a m�dia da nota.
	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNota();
		}
		return somaNotas / disciplinas.size();
	}

	// M�todo que retorna a aprova��o ou reprova��o.
	public boolean getAlunoAprovado() {
		// Aproveitando o c�digo.
		double media = this.getMediaNota();
		if (media >= 60) {
			return true;
		} else
			return false;
	}

	// M�todo que retorna se o aluno est� em recupera��o.
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

	// Testando @Override - identifica m�todo sobreescrito.
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

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
}
