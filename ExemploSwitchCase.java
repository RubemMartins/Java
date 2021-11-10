package br.com.generation.condicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra entre a e d: ");
		String letra = entrada.next();
		
		switch(letra) {
		case "a", "A":
			System.out.println("Anny");
		break;
		case "b", "B":
			System.out.println("Bruno");
		break;
		case "c", "C":
			System.out.println("Camila");
		break;
		case "d", "D":
			System.out.println("Danilo");
		break;
		default:
			System.out.println("Opção Inválida!");
		break;		
		}
		entrada.close();
	}
}
