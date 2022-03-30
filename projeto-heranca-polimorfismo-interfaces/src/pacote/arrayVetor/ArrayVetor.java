package pacote.arrayVetor;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		// Passando valores diretamente.
		
						//   0	  1	   2    3
		double[] valores = {9.5, 8.9, 9.6, 8,2};
		
		String[] val = {"A", "B", "C", "D"};		
			
		for(int i = 0; i < val.length; i ++) {
			String valor = JOptionPane.showInputDialog("O valor na posição: " + i + " eh igual " + val[i]);
			val[i] = valor;
		}
		
		JOptionPane.showMessageDialog(null, val);	
		
	}

}
