package br.pucrs.poo;

public class App {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo(3,4,5);

		System.out.println("Circulo 1: "+c1.toString());
		System.out.println("Circulo 2: "+c2.toString());
		
		c1.move(2,3);
		c2.zoom(2);
		
		System.out.println("\nCirculo 1:    "+c1.toString());
		System.out.println("Circulo 2: "+c2.toString());
		
		System.out.println("\nArea do circulo 1: "+c1.area());
		System.out.println("Area do circulo 2: "+c2.area());

		Circulo [] lista = new Circulo [3];
		lista [0] = c1;
		lista [1] = c2;
		lista [2] = new Circulo(5,6,7);

		for (int i=0; i<lista.length; i++){
			System.out.println("C: " + lista[i].toString() + "\n  Area: " + lista[i].area()+"\n");
		}
	}

}
