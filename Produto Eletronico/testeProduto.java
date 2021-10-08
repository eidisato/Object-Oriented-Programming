package projetoProduto;

public class testeProduto {
	public static void main(String[] args) {
		
		produto produto1 =new produto("Ferro de solda","Tramontina", "Equipamento para soldar componentes eletrônicos", 29);
		produto produto2 =new produto("Estanho/Solda","Cobix", "Solda em tubo, 22 gramas, fio 1mm", 10);
		produto produto3 =new produto("Relé Programável","WEG", "Um compacto e versátil CLP-Controlador Lógico Programável", 1400);
		
		produto1.imprimirInfo();		
		produto2.imprimirInfo();
		produto3.imprimirInfo();
	}
}
