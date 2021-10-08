package projetoProduto;

import java.text.NumberFormat;

public class produto {
//atributos
	private String nomeProduto;
	private double valorProduto;
	private String marcaProduto;
	private String info;
	
//construtor
	public produto (String nomeProduto, String marcaProduto, String info, double valorProduto) {
		this.info=info;
		this.marcaProduto=marcaProduto;
		this.nomeProduto=nomeProduto;
		this.valorProduto=valorProduto;	
	}
	// Declaração dos demais métodos da classe;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String preco() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumIntegerDigits(2);
		String valor = nf.format(valorProduto);
		return valor;
	}
	public void imprimirInfo() {
		System.out.println("\nProduto:" + nomeProduto + " // Marca:" + 
				marcaProduto + " // Informações:"+ info + " // PREÇO:"+this.preco());
			}

}
