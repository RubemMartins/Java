package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio2_Condicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c ;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		c = entrada.nextInt();
		
		if(a > b && b > c) {
			System.out.println("A ordem decrescente dos n�meros � : "+a+" , "+b+" , "+c);
		}
		if(a > c && c > b) {
				System.out.println("A ordem decrescente dos n�meros � : "+a+" , "+c+" , "+b);
			}
		if (c > a && a > b) {
				System.out.println("A ordem decrescente dos n�meros � : "+c+" , "+a+" , "+b);
			}
		if(b > c && c > a) {
				System.out.println("A ordem decrescente dos n�meros � : "+b+" , "+c+" , "+a);
				}
		if( c > b && b > a) {
				System.out.println("A ordem decrescente dos n�meros � : "+c+" , "+b+" , "+a);
			}
		if(b > a && a > c) {
			System.out.println("A ordem decrescente dos n�meros � : "+b+" , "+a+" , "+c);
		}
		if(a==b && a==c) {
			System.out.println("A ordem decrescente dos n�meros � : "+a+" , "+b+" , "+c);
		}
			entrada.close();
		}
	}