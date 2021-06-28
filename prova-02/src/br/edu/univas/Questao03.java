package br.edu.univas;

import java.util.Scanner;

public class Questao03 {
	public static void main (String[]args) {
		Scanner leitura = new Scanner (System.in);
		int contadorAprovados = 0;
		int contadorRecuperacao = 0;
		int contadorDependencia = 0;
		int [] notas = new int [50];
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Por favor, digite a nota: ");
			notas[i] = leitura.nextInt();
			
			if (notas[i] >= 60) {
				contadorAprovados++;
			} else if (notas[i] >= 30 && notas[i] < 60) {
				contadorRecuperacao++;
			} else if (notas[i] < 30) {
				contadorDependencia++;
			}
			
		}
		
		int porcentagemAprovados = (contadorAprovados * 100)/50 ;
		int porcentagemRecuperacao = (contadorRecuperacao * 100)/50;
		int porcentagemDependencia = (contadorDependencia * 100)/50;
		
		System.out.println(porcentagemAprovados + "% Aprovados - Quantidade de alunos aprovados: " + contadorAprovados);
		System.out.println(porcentagemRecuperacao + "% em Recuperação - Quantidade de alunos em recuperação: " + contadorRecuperacao);
		System.out.println(porcentagemDependencia + "% em Dependencia - Quantidade de alunos em dependência: " + contadorDependencia);
		
		leitura.close();
	}

}
