package atividades;
import java.util.Scanner;


public class Atividade3 {
	/**
	 * 3) As maçãs custam R$ 1,30 cada se forem 
	 * compradas menos de uma dúzia, e R$ 1,00
	 * se foremcompradas pelo menos 12. 
	 * Escreva um programa que leia o número
	 * de maçãs compradas, calcule e escreva
	 * o custo total da compra.
	 */
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de maças desejadas: " );
		float quantidadeDeMacas = sc.nextFloat();
		
		if (quantidadeDeMacas < 12) {
		System.out.println("Total: " + quantidadeDeMacas * 1.30);
	} else if (quantidadeDeMacas > 12) {
		System.out.println("Total: " + quantidadeDeMacas * 1);
	}
	
	sc.close();
	}}
