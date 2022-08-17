package br.senai.sp.jandira;

public class Circunferencia {

	public static void main(String[] args) {

		// TIPOS DE VARIAVEIS 
		double area, raio;
		final double PI = 3.14;
		//final int IDADE_DO_ALUNO
		raio = 8.0; 
		area =  2 * PI * raio;
		
		System.out.println("a area da circunferencia é: " + area + "cm2");
		System.out.printf("a area da circunferencia é: %scm2", area);
	}
}		 		
