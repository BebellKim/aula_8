package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		 ArrayList<Integer> numeros= new ArrayList<> ();
		 
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite o valor 0 para sair ");
			System.out.println("   ");
			
			int i=1;
			while (i!=0) {
				
			System.out.println(" informe os números:  ");
			i= ler.nextInt();
			numeros.add(i);
				}
			
			for(int n:numeros) {
				if (n %2 ==0 ) {
					System.out.println(n);
					}
			}
		System.out.println("Lista é: "+numeros);	
		
		
		

	}

}
