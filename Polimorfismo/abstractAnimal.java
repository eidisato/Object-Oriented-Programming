package polimorfismoAnimal;

public abstract class abstractAnimal {
//Atributos
	private String nome;
	private int idade;
	private String raca;
	private String alimento;
	
//Construtor:
	public abstractAnimal (String nome, int idade, String raca, String alimento) {
		this.nome=nome;
		this.idade=idade;
		this.raca=raca;
		this.alimento=alimento;
	}
	
//abstract
	abstract public void som(String som);
	abstract public void correr(String correr);
	
	abstract public void print();
//METODO: GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
}
