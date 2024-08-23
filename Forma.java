package forma;

public class Forma {
	protected double base;
	protected int largura;
	protected double altura;
	
	
	public Forma(double base, int largura) {
		this.base = base;
		this.largura = largura;
	}


	public Forma(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return base * largura;
	}


	public String mostrarInfo() {
		return "Forma [base=" + base + ", largura=" + largura + ", altura=" + altura + "]";
	}
	
	
	
	
}
