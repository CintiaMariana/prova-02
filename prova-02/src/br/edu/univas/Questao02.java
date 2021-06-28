package br.edu.univas;

import java.util.Scanner;

public class Questao02 {
	public static void main (String[] args) {
		Scanner leitura = new Scanner (System.in);
		double saldo = 0;
		int opcao;
		
		do {
			System.out.println("Por favor, digite: ");
			System.out.println("1 - Receita");
			System.out.println("2 - Despesa");
			System.out.println("0 - Finalizar");
			opcao = leitura.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o valor da receita:");
				double receita = leitura.nextDouble();
				saldo = saldo + receita;
			} else if (opcao == 2) {
				System.out.println("Digite o valor da despesa:");
				double despesa = leitura.nextDouble();
				saldo = saldo - despesa;
			} 
				
	} while (opcao != 0);
		
		System.out.println("O saldo final é: " + saldo);
		
		leitura.close();

}
}