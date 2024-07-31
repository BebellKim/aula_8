package Aula_08;

import java.util.Scanner;

public class atividade09 {

	public static void main(String[] args) {


		Scanner ler = new Scanner (System. in) ;
		try {

		System.out.println("Escolha um número entre 1 a 3: ");
		int numero = ler.nextInt ();

		switch (numero) {

		case 1:
			System.out.println("O número escolhido foi: 1.") ;
			break;

		case 2:
			System.out.println("O número escolhido foi: 2.");
			break;

		case 3:
			System.out.println("O número escolhido foi: 3.");
			break;

		}
		}
		catch(Exception erro) {
			System.out.println("O elemento escolhido é inválido! Digite um número entre 1 a 3.");
			//System.exit();
		}
		ler.close() ;

	}

}
