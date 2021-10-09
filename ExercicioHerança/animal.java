package herancaAnimal;

public class animal {
	
	//atributos
	private String nome;
	private int idade;
	private String cientifico;
	private String alimento;
	//construtor
	public animal (String cientifico,String nome,int idade, String alimento) {
		super();
		this.nome=nome;
		this.idade=idade;
		this.cientifico=cientifico;
		this.alimento=alimento;
	}

	//METODOS:GET AND SET
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
	public String getCientifico() {
		return cientifico;
	}
	public void setCientifico(String cientifico) {
		this.cientifico = cientifico;
	}
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
}