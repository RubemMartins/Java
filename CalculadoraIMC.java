package br.com.generation.condicional;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double imc;
		double pesoQuilogramas = 0.0;
		double alturaMetros = 0.0;
		
		System.out.println("Digite o peso atual: ");
		pesoQuilogramas = entrada.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		alturaMetros = entrada.nextDouble();
		
		imc = pesoQuilogramas / (alturaMetros*alturaMetros);
		
		System.out.println("\nValores do IMC");
		
		System.out.println("Abaixo do Peso: Menos que 18,5.");
		System.out.println("Normal: Entre 25,0 e 29,9.");
		System.out.println("Sobrepeso: 25,0 e 29,9.");
		System.out.println("Obeso Acima de 30,0.");
		System.out.println("\n Seu IMC �: " + imc);
		
		if(imc < 18.5) {
			System.out.println("Voc� est� abaixo do peso! Favor comer bastante!");
		}
		if (imc > 18.5 && imc < 24.9) {
			System.out.println("Voce est� com o peso normal! Continue assim...");
		}
		if(imc > 25.0 && imc < 29.9) {
			System.out.println("Voc� est� com sobrepeso! " + 
								"Favor entrar na Academia e comer coisas saud�veis");
		}
		if(imc > 30.0) {
			System.out.println("Voc� est� obeso! Favor buscar recomenda��es m�dicas !");
			
		}
		entrada.close();
	}

}
