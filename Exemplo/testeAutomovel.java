package pOO;

public class testeAutomovel {
	public static void main(String[] args) {
	//instanciando um objeto da classe automovel
	
			automovel auto1 = new automovel("Gustavo Sabino", "Honda", "EMO2021", 2021);
			
			auto1.imprimirInfo();
			System.out.println("\n***Transfer�ncia de propriet�rie***");
			auto1.setNomeProprietario("Vinicius Eidi");
			auto1.imprimirInfo();
			
			automovel auto2 = new automovel("Tha�s", "I30", "TOS2104", 2021);
			auto2.imprimirInfo();
			System.out.println("\n***Mudan�a de placa***");
			auto2.setPlaca("EHO2S85");
			auto2.imprimirInfo();
		}

	}
