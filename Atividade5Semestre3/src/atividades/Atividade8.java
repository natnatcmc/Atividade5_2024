package atividades;

import java.util.Scanner;

/**
 * 8) Ler a hora de início e a hora de fim
 *  de um jogo de Xadrez (considere apenas 
 *  horas inteiras, sem os minutos) e calcule 
 *  a duração do jogo em horas, sabendo-se que o 
 *  tempo máximo de duração do jogo é de 24 horas 
 *  e que o jogo pode iniciar em um dia e terminar 
 *  no dia seguinte.
 */

public class Atividade8 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o início do jogo de Xadrez: ");
		int inicioHora = sc.nextInt();
		System.out.println("Informe o fim do jogo de Xadrez:");
		int fimHora = sc.nextInt();
		
		int duracaoJogo = inicioHora + fimHora;
		int duracaoAmais = duracaoJogo - 24;
		
		if (duracaoJogo > 24){
			System.out.println("O jogo durou " + "um dia e mais " + duracaoAmais + "hrs");
		} else{
			System.out.println("O jogo durou " + duracaoJogo);
			
		}
		sc.close();
	}

}
