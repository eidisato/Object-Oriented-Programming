package polimorfismoAnimal;

public class cavalo extends abstractAnimal{
private String porte;
	
	public cavalo (String nome, int idade,String raca, String alimento, String porte) {
		super (nome, idade, raca, alimento);
		this.porte = porte;
	}
	
	@Override
		public void print() {
		System.out.print("CAVALO!!!");
		System.out.print("Nome: "+getNome());
		System.out.print(" \\Idade: "+getIdade()+" anos");
		System.out.print(" \\Raça: "+getRaca());
		System.out.print(" \\Alimento: "+getAlimento());
		System.out.print(" \\Porte:  "+porte);
	}
	
	@Override
	public void som(String som) {
		System.out.print("\n O Cavalo começou a Relinchar!!!\n "+som+"\n");
	}
	
	@Override
	public void correr(String correr) {
		System.out.print("\n O cavalo fez uma atitude: "+correr+"\n");
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

}
