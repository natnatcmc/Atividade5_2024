package atividades;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque um valor");
		int idade = sc.nextInt();
		
		if (idade > 10 ) {
			System.out.println("É maior que dez!");
		} else if (idade < 10){
			System.out.println("É menor que dez!");
		}  else {
			System.out.println("Você tem dez anos!");
		} 
	
		
		sc.close();
	}
}
