package herancaAnimal;

import java.util.Scanner;

public class testeanimal {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int op;
		
		cachorro au=new cachorro("Canis lupus familiaris", "Rex",7,"Carnívoro", "Boiadeiro-bernês");
		cavalo pocoto=new cavalo("Equus caballus", "Potrancoso", 1,"Herbívoro", "Puro Sangue Ingles");
		preguica lerdo=new preguica("Folivora", "Preguis", 3,"Herbívoro", "Preguiça-de-coleira");
		
		do {
			System.out.println("\n -----------------------------");	
			System.out.printf("\n 1) CACHORRO");	
			System.out.printf("\n 2) CAVALO");
			System.out.printf("\n 3) BICHO-PREGUIÇA");
			System.out.printf("\n Opção: "); 
			System.out.println("\n -----------------------------");
			op = scan.nextInt();

				
			switch (op) {
			
			case 1: au.print();	
			System.out.print("\n -----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 2) Exibir ação");
			System.out.print("\n Opção: "); 
			op = scan.nextInt();
			while (op >=1 || op <= 2) {	
				if (op == 1) { 
					au.som(); 
					break;
					} if (op == 2) { 
						au.correr(); 
						break; 
						}
			}
			break;
			
			case 2: pocoto.print();	
			System.out.print("\n -----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 2) Exibir ação");
			System.out.print("\n Opção: "); 
			op = scan.nextInt();
			while (op >=1 || op <= 2) {	
				if (op == 1) { 
					pocoto.som(); 
					break; 
					} 
				if (op == 2) { 
					pocoto.correr(); 
					break; 
					}
			}
			break;
			
			case 3: lerdo.print();	
			System.out.print("\n -----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 2) Exibir ação");
			System.out.print("\n Opção: "); 
			op = scan.nextInt();
			while (op >=1 || op <= 2) {	
				if (op == 1) { 
					lerdo.som(); 
					break; 
					} 
				if (op == 2) { 
					lerdo.subir(); 
					break; 
					}
			}
			break;
			
			default: System.out.println("\n OPÇÃO INVALIDA"); break;
				}
			} while (op != 0);
		}
	}