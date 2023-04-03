package Geometria;
//base * altura / 2
public class Triangulo extends Figuras2D {

	private double base;
	private double altura;
	
	public double calcularArea() {
		return (base*altura);
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
