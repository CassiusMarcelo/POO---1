package br.pucrs.poo;

public class Circulo {
	private Ponto centro;
	private double raio;
	
	
	public Circulo() {
		this(0,0,1);
	}
	
	public Circulo(double x, double y, double r) {
		/*centroX = x;
		centroY =y;*/
		centro = new Ponto(x,y);
		raio = r;
	}

	public double getCentroX() {
		return centro.getcX();
	}

	public double getCentroY() {
		return centro.getcY();
	}

	public double getRaio() {
		return raio;
	}

	public void move(double newX, double newY) {
		/*centroX = newX;
		centroY = newY;
		*/
		centro = new Ponto(newX,newY); // quando não houver set, realizar a alteração desta forma.
	}
	
	public void zoom(double fator) {
		raio *= fator;
	}
	
	public double area() {
		return Math.PI * Math.pow(raio,2);
	}


    public boolean intersects (Circulo outro){
	    return true;
    }


    public String toString(){
		return String.format("(%.2f,%.2f) raio: %.2f", getCentroX(), getCentroY(), raio);
	}
}
