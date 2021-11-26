package array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMain {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		int numNotas;
		
		System.out.printf("Quantas notas você possui?: \n");
		numNotas = valor.nextInt();
		
		int notas [] = new int[numNotas];
		
		int notaTotal = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a sua nota:");
			notas[i] = valor.nextInt();
			
		}
		
//		System.out.println(Arrays.toString(notas));	
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("Sua média é:" + media + "!");
		


	}

}
