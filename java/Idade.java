import java.util.Scanner;

public class Idade {
    public static void main(String args[]) {

    Scanner s = new Scanner(System.in);

    System.out.print("Qual o seu nome?");

    String nome = s.next();

		int idade = 16;
		int diasDoAno = 365;

		int diasVividos = idade * diasDoAno;

		System.out.printf("%s, voc\u00ea viveu o total de %s dias", nome, diasVividos);
    }

}