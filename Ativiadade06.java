package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ativiadade06 {

	public static void main(String[] args) {


		ArrayList<String> nomes = new ArrayList<> ();
		Scanner ler = new Scanner(System.in);

		try {

			nomes.add("Alice");
			nomes.add("Bob");
			nomes.add("Charlie");
			System.out.println("Nome: " + nomes.get(1));
		}
		catch(Exception erro) {
			System.out.println("Usar elementos existentes");
			//System.exit();
		}


	}
}