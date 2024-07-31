package Aula_08;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a=0, b=0;
		try {
		
		System.out.print("Digite o primeiro valor: ");
		a= ler.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		b= ler.nextInt();
		
		System.out.println("Resultados");
		System.out.println("Soma: "+(a+b));
		System.out.println("Sub: "+(a-b));
		System.out.println("Mult: "+(a*b));
		System.out.println("Divisão inteira: "+(a%b));
		System.out.println("Divisão exata: "+((double)a/b));
		
		}
		catch(Exception erro) {
		System.out.println("Informe um valor do tipo inteiro");
		//System.exit();
		}
		ler.close();
	}

}
