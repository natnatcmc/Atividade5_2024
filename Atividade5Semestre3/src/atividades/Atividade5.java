package atividades;

import java.util.Scanner;
/**
 * 5) Ler o ano atual e o ano de nascimento
 *  de uma pessoa. Escrever uma mensagem que diga
 *  se ela poderá ou não votar este ano
 *  (não é necessário considerar o mês em que a pessoa nasceu).
 */
public class Atividade5 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Infome o ano atual: ");
		int anoAtual = sc.nextInt();
		
		System.out.println("Infome o ano de seu nascimento: ");
		int anoNascimento = sc.nextInt();
		
		int resultado = anoAtual - anoNascimento ;
		
		if (resultado < 16){
			System.out.println("Você não poderá votar no ano de " + anoAtual);
		} else {
			System.out.println("Você pode votar no ano de " + anoAtual);
		}
		
		sc.close();
	}
}
