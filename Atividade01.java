package Aula_08;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		
		 ArrayList<Integer> numeros= new ArrayList<> ();
		 
		Scanner ler = new Scanner(System.in);
		
			int soma = 0, numero=0;
			
			for (int i=0; i<5; i++) {
				System.out.println(" informe o número: ");
				numero= ler.nextInt();
				soma = (soma+numero);
						
				}
			 
			 System.out.println("O resultado da soma é: "+ soma);
			

	}

}