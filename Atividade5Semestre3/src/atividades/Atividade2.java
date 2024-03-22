package atividades;
import java.util.Scanner;

public class Atividade2 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor negativo ou positivo!");
		int valor = sc.nextInt();
		
		if (valor > 0) {
			System.out.println("Positivo!");
		} else {
			System.out.println("Negativo!");
		}
		
		sc.close();
	}
}
