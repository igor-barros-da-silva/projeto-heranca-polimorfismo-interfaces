package pacote.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;
import pacote.classe.Secretario;
import pacote.classesauxiliares.FuncaoAutorizacao;
import pacote.constante.StatusAluno;

public class App {

	// Main � um m�todo auto execut�vel em Java.
	public static void main(String[] args) {
		
	// Tratamento do erro.
		try {
	
		// Simples valida��o de permiss�o de acesso
		String login = JOptionPane.showInputDialog("Informe o login?");
		String senha = JOptionPane.showInputDialog("Informe o senha?");
	
		// Bloquear e Autorizar somente quem realmente tem o contrato 100% leg�timo.
		if (new FuncaoAutorizacao(new Secretario(login, senha)).autorizar()) {
	
			// Gerando erro
			List<Aluno> alunos = null;
	
			// Hashmap - Forma de carregar dados e recuperar por meio de valor.
			// K = Chave, V = Valor
			// � uma lista que dentro dela temos uma chave que identifica uma sequ�ni de
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
	
				// Objeto est� na mem�ria, new = cria um novo objeto.
				// M�todo construtor.
				Aluno aluno = new Aluno();
	
				// Nome din�mico atrav�s da entrada de dados com teclado.
				// Convertendo integer para string.
				aluno.setNome(nome);
				aluno.setIdade(Integer.valueOf(idade));
	
				// Criando a lista din�mica das disciplinas do aluno.
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
					// Op��o Sim � 0
					int continuarRemover = 0;
					int posicaoLista = 0;
					// Remover disciplinas em repeti��o.
					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4?");
						aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicaoLista);
						posicaoLista++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}
				}
				
				// Variável nula.
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
						+ aluno.getAlunoAprovado1() + "M�dia: " + aluno.getMediaNota());
			}
	
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome: " + aluno.getNome() + "Lista de alunos em recupera��o: "
						+ aluno.getAlunoAprovado1() + "M�dia: " + aluno.getMediaNota());
			}
	
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome: " + aluno.getNome() + "Lista de alunos reprovados: "
						+ aluno.getAlunoAprovado1() + "M�dia: " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado! ");
		}
	}
		catch (Exception e) {
			// É OBRIGATÓRIO DEBUGAR E ENCONTRAR O ERRO
			// Imprime erro na console.
			e.printStackTrace();
			// Mensagem do erro.
			JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());			
			
			// Toda informações de erro em Array.
			for(int i = 0; i < e.getStackTrace().length; i++) {
				System.out.println("Erro de classe:" + e.getStackTrace()[i].getClassName());
				System.out.println("Erro de método:" + e.getStackTrace()[i].getMethodName());
				System.out.println("Erro de linha1:" + e.getStackTrace()[i].getLineNumber());
			}
		}
	}
}
