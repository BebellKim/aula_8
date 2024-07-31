package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<> ();
		Scanner ler = new Scanner(System.in);

		double x;
		try {

		System.out.println("Digite uma nota");
		x=ler.nextDouble();
		
		if (x>=6 && x<=10) {
			System.out.println("Você está aprovado");
		}
		else if (x<6 && x>=4) {
			System.out.println("Exame");
		}
		else if (x>10) {
			System.out.println("digitar notas existentes");
		}
		else {
			System.out.println("Reprovado");
		}
		
		}
		
		catch(Exception erro) {
			System.out.println("Usar elementos existentes");
			//System.exit();
		}
		ler.close();
	}

}
