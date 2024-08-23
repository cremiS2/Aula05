package forma;
import forma.Retangulo;
import forma.Triangulo;
import forma.Forma;
public class Main {

	public static void main(String[] args) {
		
		Forma r = new Retangulo(10,10);
		
		Forma t = new Triangulo(10,10);
		
		System.out.println(r.calcularArea());
		
		System.out.println(t.calcularArea());
	}

}
