package br.senai.sp.jandira;

import java.util.Scanner;

public class DesvioCondicional {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		
		int idade; {
		
		System.out.println("QUAL SUA IDADE? ");
		idade = leitor.nextInt();
		}
		
		 
		if (idade >=18) {
			System.out.println("BEM-VINDO A FESTA! ");
		}
		
			
		if (idade <=18) {
			System.out.println("ENTRADA PROIBIDA ");
		}	
		
				
	}

}
