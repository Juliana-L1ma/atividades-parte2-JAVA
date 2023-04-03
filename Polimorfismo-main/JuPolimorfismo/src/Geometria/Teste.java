package Geometria;

import ReinoAnimal.Aves;
import ReinoAnimal.Mamifero;
import ReinoAnimal.Peixes;
import ReinoAnimal.ReinoAnimal;

public class Teste {

	public static void main(String[] args) {
		Circulo fig1 = new Circulo();
		fig1.setNome("Circulo");
		fig1.setRaio(5);
		
		Quadrado fig2 = new Quadrado();
		fig2.setNome("Quadrado");
		fig2.setLado(4);
		
		Triangulo fig3 = new Triangulo();
		fig3.setNome("Triangulo");
		fig3.setAltura(5);
		fig3.setBase(3);
		
		Cubo fig4 = new Cubo();
		fig4.setNome("Cubo");
		fig4.setAresta(8);
		
		Cilindro fig5 = new Cilindro();
		fig5.setNome("Cilindro");
		fig5.setAltura(8);
		fig5.setBase(4);
		fig5.setRaio(3);
		
		FigurasGeometricas [] figuras = new FigurasGeometricas [5];
		
		figuras [0] = fig1;
		figuras [1] = fig2;
		figuras [2] = fig3;
		figuras [3] = fig4;
		figuras [4] = fig5;
		
		for(FigurasGeometricas tipo: figuras) {
			System.out.println("------------------------------");
			
			if(tipo instanceof Figuras2D) {
				//doncast
				Figuras2D figu = (Figuras2D) tipo;
				System.out.println("Figura Geométrica: " + tipo.getNome());
				System.out.println("Cálculo da área: " + figu.calcularArea());
			}
			
			if(tipo instanceof Figuras3D) {
				//doncast
				Figuras3D figur = (Figuras3D) tipo;
				System.out.println("Figura Geométrica: " + tipo.getNome());
				System.out.println("Cálculo do volume: " + figur.calcularVolume());
				System.out.println("Cálculo da área: " + figur.calcularArea());
			}
			
		}

	}

}
