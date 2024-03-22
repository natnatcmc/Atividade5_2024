package atividades;

import java.util.Scanner;

/**10) 11) Faça um algoritmo para ler: número da conta do cliente, 
 * saldo, débito e crédito. Após, calcular e escrever o saldo atual 
 * (saldo atual = saldo - débito + crédito). Também testar se saldo atual 
 * for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão 
 * escrever a mensagem 'Saldo Negativo'.
 */
public class Atividade11 {

	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo! Insira o número da conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Bem-vindo! Insira o saldo: ");
		int saldo = sc.nextInt();
		
		System.out.println("Bem-vindo! Insira o debito: ");
		int debito = sc.nextInt();
		
		System.out.println("Bem-vindo! Insira o crédito: ");
		int credito = sc.nextInt();
		
		if (saldo >=0) {
			System.out.println("O saldo da conta " + conta + " é positivo: " + saldo + ", seu débito é: " + debito + ", seu credito é: " + credito);
		} else {
			System.out.println("O saldo da conta " + conta + " é negativo: " + saldo + ", seu débito é: " + debito + ", seu credito é: " + credito );
		}
		
		sc.close();
	}
}
