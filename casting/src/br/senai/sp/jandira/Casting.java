package br.senai.sp.jandira;

public class Casting {

	public static void main(String[] args) {
		byte idadeByte = 18;
		short idadeShort = 5000;

//idadeShort = idadeByte;
		idadeByte = (byte)idadeShort;

		System.out.println(idadeByte);
		

		int valorInt = 100;
		double valorDouble = 59.94;
		
		valorDouble = valorInt;
		System.out.println(valorDouble);

		valorDouble = 59.94;
		valorInt = (int)valorDouble;
		System.out.println(valorInt);

		valorDouble = 1;
		valorDouble = (double)valorInt;
		System.out.println(valorInt);
	}

}
