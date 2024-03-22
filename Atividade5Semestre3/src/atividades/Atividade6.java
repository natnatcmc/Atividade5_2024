package atividades;

import java.util.Scanner;

/**
 * 6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
 */

public class Atividade6 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primero valor: ");
		float valor1 = sc.nextFloat();
		
		System.out.println("Insira o segundo valor: ");
		float valor2 = sc.nextFloat();
		
		if (valor1 == valor2) {
			System.out.println("Valores iguais, insira valores diferentes ");
		} else if (valor1 > valor2){
			System.out.println("Valor 1 é maior ");
		} else {
			System.out.println("Valor 2 é maior ");
		}
		
		sc.close();
	}
}
