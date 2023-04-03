package Geometria;
public class Cubo extends Figuras3D {

	private double aresta;
	
	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public double calcularVolume() {
		return Math.pow (this.aresta, 3);
	}

	@Override
	public double calcularArea() {
		return ( Math.pow (this.aresta,2 ) *6);
	}
}
