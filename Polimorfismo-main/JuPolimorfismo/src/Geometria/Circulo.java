package Geometria;

public class Circulo extends Figuras2D {

	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return (raio*raio*3.14);
	}
}
