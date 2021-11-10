package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio1_Condicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, maior ;
		
		System.out.println("Digite o primeiro número: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = entrada.nextInt();
		
		if(a > b) {
			if(a > c) {
				maior = a;
			}
			else {
				maior = c;
			}
		}
			else {
				if(b > c) {
					maior = b;
				}
				else {
					maior = c;
				}
			}
			System.out.println("O maior dos 3 números é: "+maior);
			
			entrada.close();
		}
	}
