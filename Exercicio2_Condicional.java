package br.com.generation.condicional;

import java.util.Scanner;

public class Exercicio2_Condicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c ;
		
		System.out.println("Digite o primeiro número: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		c = entrada.nextInt();
		
		if(a > b && b > c) {
			System.out.println("A ordem decrescente dos números é : "+a+" , "+b+" , "+c);
		}
		if(a > c && c > b) {
				System.out.println("A ordem decrescente dos números é : "+a+" , "+c+" , "+b);
			}
		if (c > a && a > b) {
				System.out.println("A ordem decrescente dos números é : "+c+" , "+a+" , "+b);
			}
		if(b > c && c > a) {
				System.out.println("A ordem decrescente dos números é : "+b+" , "+c+" , "+a);
				}
		if( c > b && b > a) {
				System.out.println("A ordem decrescente dos números é : "+c+" , "+b+" , "+a);
			}
		if(b > a && a > c) {
			System.out.println("A ordem decrescente dos números é : "+b+" , "+a+" , "+c);
		}
		if(a==b && a==c) {
			System.out.println("A ordem decrescente dos números é : "+a+" , "+b+" , "+c);
		}
			entrada.close();
		}
	}