package pOO;
import java.text.NumberFormat;
public class empregado {

	//Declaração dos atributos da classe;
	
		private String nome;
		private double salario;
		
		//declaração do método especial Construtor;
		
		public empregado(String n, double s) {
			this.setNome(n);
			this.setSalario(s);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		public void aumentarSalario(double percentual) {
			salario *= 1 + percentual/100;
		}
		
		public String formatarMoeda() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumIntegerDigits(2);
			String formatoMoeda = nf.format(salario);
			return formatoMoeda;
		}
		
		public void imprimir() {
			System.out.println("\n"+nome+"\t\t\t"+"Salário: "+this.formatarMoeda());
		}


	}
