package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio3_Condicional {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade atual em anos: ");
		idade = entrada.nextInt();
		
		if(idade >=10 && idade <=14) {
			System.out.println("Categoria Infantil");
		}
		else if (idade >=15 && idade <=17) {
			System.out.println("Categoria Juvenil");
		}
		else if(idade >=18 && idade <=25) {
			System.out.println("Categoria Adulto");
		}
		else {
			System.out.println("Sem Categoria para competir");
		}
		entrada.close();
	}

}
