package Aula_08;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		double v1 = 0, v2 = 0, v3 = 0;
		try {
		
		System.out.println("Informe o valor 1: ");
		v1 = ler.nextDouble();
		
		System.out.println("Informe o valor 2: ");
		v2 = ler.nextDouble();
		
		System.out.println("Informe o valor 3: ");
		v3 = ler.nextDouble();
		
		if(v1 == v2 && v1 == v3)
			System.out.println("Todos são iguais");
		
		else if(v1 > v2 && v1 > v3)
			System.out.println("O valor 1 é maior "+ v1);
		
		
		else if(v2 > v1 && v2 > v3)
			System.out.println("O valor 2 é maior "+ v2);
		
		else if(v3 > v2 && v3 > v1)
			System.out.println("O valor 3 é maior "+ v3);
		
		}
		
		catch(Exception erro) {
			System.out.println("Digitar elementos numéricos inteiros");
			//System.exit();
		}
		
		ler.close();
	}
	

}
