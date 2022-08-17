public class Imc {
    public static void main(String args[]) {

		int peso = 50;
		double altura = 1.57;

		double imc = peso / (altura * altura);

		System.out.printf("Meu IMC: %s", imc);
    }

}