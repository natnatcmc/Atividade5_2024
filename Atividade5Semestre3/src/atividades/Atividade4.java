package atividades;

import java.util.Scanner;

/**
 * 4) Ler as notas da 1a. e 2a.
 * avaliações de um aluno. Calcular a média 
 * aritmética simples e escrever uma mensagem
 * que diga se o aluno foi ou não aprovado
 * (considerar que nota igual ou maior que 6 o aluno é aprovado).
 * Escrever também a média calculada.
 */

public class Atividade4 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a nota da primeira avaliação do aluno: ");
		float nota1a = sc.nextFloat();
		System.out.println("Informe a nota da segunda avaliação do aluno: ");		
		float nota2a = sc.nextFloat();
		
		float nota = nota1a + nota2a * 10 / 180;
		
		if (nota<6) {
		System.out.println("Reprovado, sua nota é:  " + nota);
		} else {
			System.out.println("Aprovado, sua nota é: " + nota);
		}
		
		sc.close();
	}
}
