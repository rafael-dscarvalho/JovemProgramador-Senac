package Aula08lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08
{
	
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		
		

		
		
		int NUM_ELEMENTOS = 6;  
 		int num_vetor[] = new int[NUM_ELEMENTOS];
 		
 		
 		
 		for(int i=0; i < NUM_ELEMENTOS; i++) {
 			System.out.print("Digite o valor " +i+ ": ");
 			System.out.println("");
 			num_vetor[i] = sc.nextInt();
 		}
 		
 	
 		for(int i= NUM_ELEMENTOS; i >= 1; i--) {
 			System.out.print("Valor na posi��o  " +i+ ": " + num_vetor[i]);
 			System.out.println("");
 		}
		
	
		
		

}
}
