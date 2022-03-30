package pacote.arrayVetor;

public class ArrayVetor {

	public static void main(String[] args) {
		
		// Array sempre deve ter a quantidade de posições definida.
		double[] notas = new double[4];
		// Atribuir valor na posição do array.
		notas[0] = 9.8;
		notas[1] = 7.3;
		notas[2] = 9.3;
		notas[3] = 7.8;
		
		
		//System.out.println(notas[3]);
		/*
		System.out.println("Nota 1 : " + notas[0]);
		System.out.println("Nota 2 : " + notas[1]);
		System.out.println("Nota 3 : " + notas[2]);
		System.out.println("Nota 4 : " + notas[3]);
		*/
		
		for(int i = 0; i < 4; i++) {
			//System.out.println("Nota na posição: " + i + " = " + notas[i]);
			System.out.println("Nota: " + (i + 1) + " = " + notas[i]);
		}
	}

}
