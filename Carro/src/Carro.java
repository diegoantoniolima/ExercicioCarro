
public class Carro {

	// constante para definir a cor
	public static final String BRANCO = "branco";
	public static final String VERMELHO = "vermelho";
	public static final String PRETA = "preta";

	// obrigatórios
	private Integer qtdePneus;
	private Integer qtdeCalotas;
	private Integer qtdeParafusosPneus;
	private Integer numeroChassi;
	private String cor;

	// Não obrigatórios
	private Integer qtdePassageiros = 0;
	private Integer anoFabricacao = 0;
	private String combustivel;

	public Carro(Integer qtdePneus, Integer numeroChassi, String cor) {
		
		
		//DUVIDA
		/*
		  aqui surgiu uma dúvida. Como eu estou setando dentro do setQtdePneus as
		  calotas e os parafusos como devo fazer para os dois não ficarem nulos?
		 */
		setQtdePneus(qtdePneus);
		
	

		this.numeroChassi = numeroChassi;
		this.cor = cor;
	}

	public void imprimeValores() {
		System.out.println("Quantidade Pneus = " + getQtdePneus());
		System.out.println("Quantidade Calotas = " + getQtdeCalotas());
		System.out.println("Quantidade Parafusos = " + getQtdeParafusosPneus());
		System.out.println("N° Chassi = " + getNumeroChassi());
		System.out.println("Cor = " + getCor());
		System.out.println("Qtde Passageiros = " + getQtdePassageiros());
		System.out.println("Ano de fabricação = " + getAnoFabricacao());
		System.out.println("Combustível = " + getCombustivel());
	}

	public Integer getQtdePneus() {
		return qtdePneus + 1;
	}

	public void setQtdePneus(Integer qtdePneus) {
		this.qtdePneus = qtdePneus;
		setQtdeCalotas(qtdePneus);
		setQtdeParafusosPneus(qtdePneus * 4);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getQtdeCalotas() {
		return qtdeCalotas;
	}

	public void setQtdeCalotas(Integer qtdeCalotas) {
		this.qtdeCalotas = qtdeCalotas;
	}

	public Integer getQtdeParafusosPneus() {
		return qtdeParafusosPneus;
	}

	public void setQtdeParafusosPneus(Integer qtdeParafusosPneus) {
		this.qtdeParafusosPneus = qtdeParafusosPneus;
	}

	public Integer getQtdePassageiros() {
		return qtdePassageiros;
	}

	public void setQtdePassageiros(Integer qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}

	public Integer getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(Integer numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
}
