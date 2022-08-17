package br.senai.sp.jandira;

public class TestOrAnd {

	public static void main(String[] args) {
		
		// teste com or
		boolean testOr;
		
		testOr = 1 > 3 || 3 > 1;
		System.out.printf ("1 > 3 ou 3 > 1? %s \n", testOr);
		
		// teste com and
		testOr = 1 > 3 && 3 > 1;
		System.out.printf ("1 > 3 e 3 > 1? %s \n", testOr);
		
		// teste com and e or
		testOr = 1 > 3 && 3 > 1 || 3 == 3;
		System.out.printf ("1 > 3 e 3 > 1 ou 3 igual a 3? %s", testOr);
	}

}
