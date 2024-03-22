package atividades;

import java.util.Scanner;

/**
 * 7) Ler dois valores 
 * (considere que não serão lidos valores iguais)
 * e escrevê-los em ordem crescente.
 */

public class Atividade7 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o primero valor: ");
		float valor1 = sc.nextFloat();
		
		System.out.println("Insira o segundo valor: ");
		float valor2 = sc.nextFloat();
		
		if (valor1 == valor2) {
			System.out.println("Insira valores diferentes!");
		} else if (valor1 > valor2){
			System.out.println("Valor 1 é maior: " + valor1 +" e " +  valor2);
		} else {
			System.out.println("Valor 2 é maior: " + valor2 +" e " + valor1);
		}
		
		sc.close();
	}
}
