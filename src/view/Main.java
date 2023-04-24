package view;

import controller.MenorController;

public class Main {

	public static void main(String[] args) {
		
		MenorController control = new MenorController();
		
		int tamanho = (int) (Math.random() * 5 ) + 1;
		int vt [] =  new int [tamanho];
		
		System.out.println("O tamanho do vetor: " + tamanho);
		System.out.print("Vetor: ");
		
		for(int i = 0; i < tamanho; i++) {
			int valor = (int) (Math.random() * 10 ) + 1;
			vt[i] = valor;
			System.out.print(vt[i] + "  ");
		}
		
		System.out.println("");
		
		int ultvalor = vt[tamanho - 1];
		
		int resultado = control.MenorValor(vt, tamanho, ultvalor);
		System.out.println("Menor valor: " + resultado);
	}

}
