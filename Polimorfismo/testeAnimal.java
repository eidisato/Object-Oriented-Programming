package polimorfismoAnimal;

import java.util.Scanner;

public class testeAnimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int op;
		
		cachorro c1= new cachorro("Rex ",3, " Dobermann ", " Carnivoro ", " Sim ");
		cavalo c2= new cavalo("Potrancoso ",10, " Cavalo �rabe ", " Herb�voro ", " Grande ");
		preguica p1= new preguica(" Soneca ",1, " Sem ra�a, apenas Especie ", " Herb�voro ", " Pregui�a-de-coleira ");
		abstractAnimal a1 =null;
		
		
		do {
			System.out.printf("\n 1) CACHORRO");	
			System.out.printf("\n 2) CAVALO");
			System.out.printf("\n 3) BICHO-PREGUI�A");
			System.out.printf("\n Op��o: "); 
			op = leia.nextInt();
			switch (op) {
			
			case 1:
				
				a1 = c1; 
				c1.print();	
				System.out.print("\n -----------------------------");
				System.out.print("\n 1) Som");
				System.out.print("\n 2) A��o");
				System.out.print("\n Op��o: "); op = leia.nextInt();
				
				if (op == 1) { 
				System.out.print("\n QUAL O SOM DO CACHORRO? ");
				String som = leia.next(); c1.som(som);	
					 }
				if (op == 2) { System.out.print("\n QUAL A ATITUDE DO CACHORRO?"); 
				String correr = leia.next(); c1.correr(correr);	
					 }
			break;
			
			case 2:
			a1 = c2;
			c2.print();
			System.out.print("\n -----------------------------");	
			System.out.print("\n 1) SOM");
			System.out.print("\n 2) A��O");
			System.out.print("\n Op��o: "); op = leia.nextInt();
			while (op >=1 || op <= 2) {	
				if (op == 1) { System.out.print("\n QUAL O SOM DO CAVALO?");
				String som = leia.next(); c2.som(som);	
					break; } 
				if (op == 2) { System.out.print("\n QUAL A ATITUDE DO CAVALO? ");
				String correr = leia.next(); c2.correr(correr);	
					break; }
			}
			break;
			
			case 3: 
			a1 = p1;
			p1.print();
			System.out.print("\n -----------------------------");	
			System.out.print("\n 1) SOM");
			System.out.print("\n 2) A��O");
			System.out.print("\n Op��o: "); op = leia.nextInt();
			while (op >=1 || op <= 2) {	// Exibe M�todos
				if (op == 1) { System.out.print("\n QUAL O SOM DO BICHO-PREGUI�A? ");
				String som = leia.next(); p1.som(som);
					break; }
				if (op == 2) { p1.subir(); break; }
			}
			break;
			
			default: System.out.println("\n OP��O INVALIDA"); break;
				}
			
		}while(op!=0);
	}
}