package polimorfismoAnimal;

public class preguica extends abstractAnimal{
	private String especie;
	
	public preguica (String nome, int idade,String raca, String alimento, String especie) {
		super (nome, idade, raca, alimento);
		this.especie = especie;
	}
	
	@Override
		public void print() {
		System.out.print("BICHO-PREGUI�A!!!");
		System.out.print("Nome: "+getNome());
		System.out.print(" \\Idade: "+getIdade());
		System.out.print(" \\Ra�a: "+getRaca());
		System.out.print(" \\Alimento: "+getAlimento());
		System.out.print(" \\Especie:  "+especie);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\n O Bicho-pregui�a fez um barulho estranho :O : "+som+"\n");
	}
	
	public void subir() {
		System.out.print("\n A pregui�a subiu a �rvore!! \n\n");
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
}
