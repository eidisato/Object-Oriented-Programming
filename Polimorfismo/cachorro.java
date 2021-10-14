package polimorfismoAnimal;

public class cachorro extends abstractAnimal{
	
	private String castrado;
	
	public cachorro (String nome, int idade,String raca, String alimento, String castrado) {
		super (nome, idade, raca, alimento);
		this.castrado = castrado;
	}
	
	@Override
		public void print() {
		System.out.print("CACHORRO!!!");
		System.out.print("Nome: "+getNome());
		System.out.print(" //Idade: "+getIdade());
		System.out.print(" //Raça: "+getRaca());
		System.out.print(" //Alimento: "+getAlimento());
		System.out.print(" //Castrado? "+castrado);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\n O cachorro começou a LATIR!!\n "+som+"\n");
	}
	
	@Override
	public void correr(String correr) {
		System.out.print("\n O cachorro fez uma atitude: "+correr+"\n");
	}

	public String getCastrado() {
		return castrado;
	}

	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}
	
}
	


