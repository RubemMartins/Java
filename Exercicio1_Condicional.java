package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio1_Condicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, maior ;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
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
			System.out.println("O maior dos 3 n�meros �: "+maior);
			
			entrada.close();
		}
	}
