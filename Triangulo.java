package forma;

public class Triangulo extends Forma {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double calcularArea() {
		return (base * altura)/2;
	
}
}
