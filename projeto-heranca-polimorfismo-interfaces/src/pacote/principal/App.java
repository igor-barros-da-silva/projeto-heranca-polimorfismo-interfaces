package pacote.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;
import pacote.classe.Secretario;
import pacote.constante.StatusAluno;
import pacote.interfaces.PermitirAcesso;

public class App {

	// Main é um método auto executável em Java.
	public static void main(String[] args) {

		// Simples validação de permissão de acesso
		String login = JOptionPane.showInputDialog("Informe o login?");
		String senha = JOptionPane.showInputDialog("Informe o senha?");
		
		// Outra forma de trabalhar com interface e construtores
		PermitirAcesso permitirAcesso = new Secretario(login, senha);

		// Classe de interface, conseguimos ser mais específico dentro código.
		PermitirAcesso secretario = new Secretario();
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		if (permitirAcesso.autenticar()) {

			// Hashmap - Forma de carregar dados e recuperar por meio de valor.
			// K = Chave, V = Valor
			// é uma lista que dentro dela temos uma chave que identifica uma sequêni de
			// valores.
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			// Iniciando os valores.
			maps.putIfAbsent(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.putIfAbsent(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.putIfAbsent(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (int quantidade = 1; quantidade <= 3; quantidade++) {

				// Entrada de dados com o teclado.
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + "?");
				String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");

				// Objeto está na memória, new = cria um novo objeto.
				// Método construtor.
				Aluno aluno = new Aluno();

				// Nome dinâmico através da entrada de dados com teclado.
				// Convertendo integer para string.
				aluno.setNome(nome);
				aluno.setIdade(Integer.valueOf(idade));

				// Criando a lista dinâmica das disciplinas do aluno.
				for (int posicao = 1; posicao <= 1; posicao++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina " + posicao + "?");
					String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina " + posicao + "?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno.getDisciplinas().add(disciplina);
				}

				// Removendo disciplinas da lista do aluno.
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (escolha == 0) {
					// Opção Sim é 0
					int continuarRemover = 0;
					int posicaoLista = 0;
					// Remover disciplinas em repetição.
					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4?");
						aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicaoLista);
						posicaoLista++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
				}
				alunos.add(aluno);
			}

			// Separando em listas.
			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);

				} else if (aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("-----------------------------------------------");

			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome: " + aluno.getNome() + "Lista de alunos aprovados: "
						+ aluno.getAlunoAprovado1() + "Média: " + aluno.getMediaNota());
			}

			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno.getNome() + "Lista de alunos em recuperação: "
						+ aluno.getAlunoAprovado1() + "Média: " + aluno.getMediaNota());
			}

			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome() + "Lista de alunos reprovados: "
						+ aluno.getAlunoAprovado1() + "Média: " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado! ");
		}
	}
}
