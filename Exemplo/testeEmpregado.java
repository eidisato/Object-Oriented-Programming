package pOO;

public class testeEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		empregado[] lista = new empregado[3];
		
		lista[0] = new empregado("Maiury Sousa", 12000);
		lista[1] = new empregado("Juliana Macedo", 13000);
		lista[2] = new empregado("Gabriel Mendes", 3500);
		
		for(empregado roda:lista) {
			roda.imprimir();
		}
		System.out.println("\n***************************************");
		for(empregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}