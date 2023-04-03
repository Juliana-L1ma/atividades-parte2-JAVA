package ReinoAnimal;

public class Teste {

	public static void main(String[] args) {
		
		Aguia ser1 = new Aguia();
		ser1.setNome("Águia");
		
		Arraia ser2 = new Arraia();
		ser2.setNome("Arraia");
		
		Ema ser3 = new Ema();
		ser3.setNome("Ema");
		
		Humanos ser4 = new Humanos ();
		ser4.setNome("Humano");
		
		Morcego ser5 = new Morcego();
		ser5.setNome("Morcego");
		
		Pinguin ser6 = new Pinguin();
		ser6.setNome("Pinguin");
		
		Traira ser7 = new Traira();
		ser7.setNome("Traíra");
		
		Tubarao ser8 = new Tubarao();
		ser8.setNome("Tubarão");
		
		Vaca ser9 = new Vaca();
		ser9.setNome("Vaca");
		
		ReinoAnimal [] reino = new ReinoAnimal [9];
		
		reino [0] = ser1;
		reino [1] = ser2;
		reino [2] = ser3;
		reino [3] = ser4;
		reino [4] = ser5;
		reino [5] = ser6;
		reino [6] = ser7;
		reino [7] = ser8;
		reino [8] = ser9;

		for(ReinoAnimal ser: reino) {
			System.out.println("------------------------------");
			
			if(ser instanceof Mamifero) {
				//doncast
				Mamifero man = (Mamifero) ser;
				System.out.print("Mamífero: ");
				System.out.println(ser.getNome());
				System.out.println("Alimentação: " + man.alimentacao());
			}
			
			if(ser instanceof Aves) {
				//doncast
				Aves ave = (Aves) ser;
				System.out.print("Aves: ");
				System.out.println(ser.getNome());
				System.out.println("Locomoção: " + ave.locomocao());
			}
			
			if(ser instanceof Peixes) {
				//doncast
				Peixes peixe = (Peixes) ser;
				System.out.print("Peixes: ");
				System.out.println(ser.getNome());
				System.out.println("Grupo: " + peixe.grupo());
			}
		}
		
	}

}
