
public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro(4, 223556545, Carro.BRANCO);
		carro.setQtdePassageiros(5);
		carro.setAnoFabricacao(2012);
		carro.setCombustivel("GASOLINA");
		
		carro.imprimeValores();
	}
}
