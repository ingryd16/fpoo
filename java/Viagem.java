public class Viagem {
    public static void main(String args[]) {

		double distancias = 600.0;
		double km = 15.0; //desempenho do carro (15 km por litro)
		double gasolina = 6.0;

		//calcular custo da viagem
		double resultado = distancia / km * gasolina; 

		System.out.printf("Seu gasto com combustivel para Ribeirao Preto foi de: R$%s" , resultado);
    }

}