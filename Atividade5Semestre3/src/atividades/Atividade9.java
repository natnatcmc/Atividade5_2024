package atividades;

import java.util.Scanner;

/**9) A jornada de trabalho semanal de um funcionário 
 * é de 40 horas. O funcionário que trabalhar mais de 
 * 40 horas receberá hora extra, cujo cálculo é o valor 
 * da hora regular com um acréscimo de 50%. Escreva um 
 * algoritmo que leia o número de horas trabalhadas 
 * em um mês, o salário por hora e escreva o salário total 
 * do funcionário, que deverá ser acrescido das horas 
 * extras, caso tenham sido trabalhadas 
 * (considere que o mês possua 4 semanas exatas).
 */
public class Atividade9 {
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de horas trabalhadas em um mês: ");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.println("Insira seu salário por hora: ");
		int salarioHora = sc.nextInt();
		
		int horasSemanas = 40;
		int semanas = 4 ;
		int horaMes = horasSemanas * semanas;
		
		int horaExtra = Math.max(horasTrabalhadas, horaMes);
		
		double salario = (horasTrabalhadas * salarioHora) + (horaExtra * salarioHora * 1.5);
		
		System.out.println("O seu salário desse mês é: R$" + salario);
		
		sc.close();
		
	}
}
