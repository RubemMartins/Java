package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio4_Condicional {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um numero qualquer: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0 ) {
			System.out.println("O n�mero "+numero+" � par e sua raiz quadrada �: "+Math.sqrt(numero));
		}
		else  {
			System.out.println("O n�mero "+numero+" � �mpar e seu quadrado �: "+ Math.pow(numero,2.0));
		}

		entrada.close();
	}

}