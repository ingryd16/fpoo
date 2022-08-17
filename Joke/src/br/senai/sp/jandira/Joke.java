package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Joke {

	public static void main(String[] args) {
		
		// criar variaveis
		int escolha, movMaq;
		Scanner leitor = new Scanner(System.in);
		Random sorteio = new Random();
		
		// criar tela do usuario
		System.out.println("********** J O K E N P O *********");
		System.out.println();
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("___________________");
		System.out.println("Qual sua escolha?"); 
		
		// determinar escolha do usuario
		escolha = leitor.nextInt();
		leitor.close();
		
		// determinar escolha do pc
		movMaq = sorteio.nextInt(1,4);
		
		// exibir escolha do usuario
		if (escolha < 1 || escolha > 3) {
			System.out.println("VOCÊ ESCOLHEU UMA OPÇÃO INEXISTENTE. TENTE NOVAMENTE!");
		}
		if (escolha == 1) {
			System.out.println("VOCÊ ESCOLHEU PEDRA");
		}
		if (escolha == 2) {
			System.out.println("VOCÊ ESCOLHEU PAPEL");
		}
		if (escolha == 3) {
			System.out.println("VOCÊ ESCOLHEU TESOURA");
		}
		
		// exibir escolha do pc
		if (movMaq == 1) {
			System.out.println("PC ESCOLHEU PEDRA");
		}
		if (movMaq == 2) {
			System.out.println("PC ESCOLHEU PAPEL");
		}
		if (movMaq == 3) {
			System.out.println("PC ESCOLHEU TESOURA");
		}
		
		System.out.println("___________________");

		
		//condicionando
		if (escolha == 1) {
			if (movMaq == 1) {
				System.out.print("\n********EMPATE********");
			}
			if (movMaq == 2) {
				System.out.print("\n********A MÁQUINA VENCEU********");
			}
			if (movMaq == 3) {
				System.out.print("\n********VOCÊ VENCEU********");
			}
		}
		
		if (escolha == 2) {
			if (movMaq == 1) {
				System.out.print("\n********VOCÊ VENCEU********");
			}
			if (movMaq == 2) {
				System.out.print("\n********EMPATE********");
			}
			if (movMaq == 3) {
				System.out.print("\n********A MAQUINA VENCEU********");
			}
		}
		
		if (escolha == 3) {
			if (movMaq == 1) {
				System.out.print("\n********A MAQUINA VENCEU********");
			}
			if (movMaq == 2) {
				System.out.print("\n********VOCÊ VENCEU********");
			}
			if (movMaq == 3) {
				System.out.print("\n********EMPATE********");
			}
		}
		
	
		

	}

}
