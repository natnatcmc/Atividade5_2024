package atividades;

import java.util.Scanner;

/**10) Ler o salário fixo e o valor das vendas
 *  efetuadas pelo vendedor de uma empresa. 
 *  Sabendo-se que ele recebe uma comissão de 3% 
 *  sobre o total das vendas até R$ 1.500,00 mais 
 *  5% sobre o que ultrapassar este valor, calcular 
 *  e escrever o seu salário total.
 */

public class Atividade10 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe seu salário fixo do vendedor: ");
		double salariofixo = sc.nextDouble();
		
		System.out.println("Informe o valor de vendas do vendedor: ");
		double valorVendas = sc.nextDouble();
		
		double limiteComissao = 1500.00; 
		
		double comissao = 0.03 * Math.min(valorVendas, limiteComissao);
		
		if (valorVendas > limiteComissao) {
		comissao += 0.05 * (valorVendas - limiteComissao);
		}
		double salarioTotal = salariofixo + comissao;
		System.out.println("Seu salário total é: " + salarioTotal);
		
		sc.close();
	}
}
