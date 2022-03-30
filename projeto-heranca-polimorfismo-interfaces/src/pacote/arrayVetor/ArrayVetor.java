package pacote.arrayVetor;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		String pos = JOptionPane.showInputDialog("Quantas posições o array deve ter?");
		
		// Convertendo inteiro para string.
		double[] notas = new double[Integer.parseInt(pos)];	
		
		// Percorrendo o array de notas.
		for(int i = 0; i < notas.length; i ++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição: " + i);
			notas[i] = Double.parseDouble(valor);
		}		
		
		// Array é muito limitado.
		// Descobrindo o tamanho da  array com length.
		for(int i = 0; i < notas.length; i++) {
			//System.out.println("Nota na posição: " + i + " = " + notas[i]);
			System.out.println("Nota: " + (i + 1) + " = " + notas[i]);
		}
	}

}
