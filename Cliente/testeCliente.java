package projetoCliente;

import java.util.Scanner;

public class testeCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Entre com o numero de clientes desejado para cadastro: ");
		Scanner scan=new Scanner(System.in);
		int numCliente=scan.nextInt();
		int n;
		cliente[] clientes=new cliente[numCliente];
		for ( n = 0; n < numCliente; n++) {
			clientes[n] = new cliente();	
			System.out.print("\n\n");
		}
		System.out.print("Clientes Cadastrados com Sucesso...\n");
			for ( n = 0; n < numCliente; n++) {
				System.out.println(clientes[n].toString());
			}
		}

}
