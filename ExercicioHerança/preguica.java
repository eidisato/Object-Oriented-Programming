package herancaAnimal;

public class preguica extends animal {
	private String tipo;

	public preguica( String cientifico,String nome,int idade, String alimento,String tipo) {
		super(cientifico, nome, idade,  alimento);		
		this.tipo=tipo;		
	}
	
	public void print() {
		System.out.print("BICHO-PREGUI�A");
		System.out.print("\n Nome Cientifico: "+getCientifico());
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Alimenta��o: "+getAlimento());
		System.out.print("\n Ra�a: "+tipo);
	}
	public void som() {
		System.out.print("\n O Bicho-Pregui�a come�a a emitir um som:   ");
		int i;
		for (i = 3; i >= 1; i--) {
			System.out.print("\n "+i);
			try { Thread.sleep (1000); } catch (InterruptedException ex) {}
			}
		System.out.print("\n AAAAAAHHHHhhhhhhhhzzzzzZZZZZZZ!!!");
	}
	public void subir() {
		System.out.print("\n O Bicho-Pregui�a lentamente subiu a �rvore!!");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
