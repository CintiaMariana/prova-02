package br.edu.univas;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[]args) {
		Scanner leitura = new Scanner (System.in);
		
		int normal = 0;
			
		for (int i=0; i<100; i++) {
			System.out.println("Por favor, digite seu peso:");
			double peso = leitura.nextDouble();
			System.out.println("Por favor, digite sua altura:");
			double altura = leitura.nextDouble();
			
			double imc = peso / (Math.pow(altura, 2));
			
			if (imc >= 18.5 && imc <= 24.9) {
				normal++;
			} else {
				continue;
			}
		}
		
		double porcentagem = (normal * 100) / 100;
		
		System.out.println(porcentagem + "% pessoas estão dentro da faixa considerada normal.");
		
		leitura.close();
		
	}

}
