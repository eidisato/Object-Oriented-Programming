package projetoCliente;

import java.util.Scanner;

//Class CLIENTE
public class cliente {
//ATRIBUTOS
	private String nome;
	private String email;
	private String cpf;
	private String nascimento;
	private String telefone;
//Construtor
	public cliente() {
		Scanner scan =new Scanner(System.in);
		System.out.print("INSIRA O NOME: ");
		this.nome=scan.nextLine();
		
		System.out.print("INSIRA O CPF (somente numeros): ");
		this.cpf=scan.nextLine();
		
		System.out.print("INSIRA A DATA DE NASCIMENTO (dd/mm/aa): ");
		this.nascimento=scan.nextLine();
		
		System.out.print("INSIRA O E-MAIL: ");
		this.email=scan.nextLine();
		
		System.out.print("INSIRA O TELEFONE (somente numeros): ");
		this.telefone=scan.nextLine();
	}
//Metodo	
	public String toString() {
		return "\nNome: "+ nome+ "\nCPF: "+cpf+ "\nNascimento: "+nascimento+ "\nE-MAIL: "+email+"\nTELEFONE: "+telefone;
		
	}
}
