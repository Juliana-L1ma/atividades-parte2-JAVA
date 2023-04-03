package Geometria;
//raio * raio * pi * 2
public class Cilindro extends Figuras3D {
	
	private double base;
	private double altura;
	private double raio;
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

	@Override
	public double calcularVolume() {
		return  (base*altura);
	}

	@Override
	public double calcularArea() {
		return (raio*raio*3.14*2);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
   
}
