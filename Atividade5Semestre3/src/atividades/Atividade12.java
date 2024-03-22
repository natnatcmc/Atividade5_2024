package atividades;

import java.util.Scanner;

/**
 * 12) Faça um algoritmo para ler: quantidade atual 
 * em estoque, quantidade máxima em estoque e quantidade 
 * mínima em estoque de um produto. 
 * Calcular e escrever a quantidade média 
 * ((quantidademédia = quantidade máxima + quantidade mínima)/2). 
 * Se a quantidade em estoque for maior ou igual 
 * a quantidade média escrever a mensagem 'Não efetuar compra', 
 * senão escrever a mensagem 'Efetuar compra'.
 */
public class Atividade12 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade atual de estoque: ");
		int quantidadeEstoque = sc.nextInt();
		
		System.out.println("Insira a quantidade máxima: ");
		int quantidadeMaxEstoque = sc.nextInt();
		
		System.out.println("Insira a quantidade mínima: ");
		int quantidadeMinEstoque = sc.nextInt();
		
		int quantidadeMedia = ((quantidadeMaxEstoque + quantidadeMinEstoque)/2);
		
		if (quantidadeEstoque >= quantidadeMedia){
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
		
		sc.close();
	}
}
