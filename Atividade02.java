package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		 ArrayList<Integer> numeros= new ArrayList<> ();
		 
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite o valor 0 para sair ");
			System.out.println("   ");
			
			int i=1, soma=0;
			while (i!=0) {
				
			System.out.println(" informe o número a ser somado:  ");
			i= ler.nextInt();
			numeros.add(i);
				}
			
			for(int n:numeros) {
				soma=soma+n;
				
				
			}
		System.out.println("Lista é: "+numeros);
		System.out.println("A soma é: "+soma);
		
			
	}

}
