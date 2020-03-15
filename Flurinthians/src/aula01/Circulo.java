package aula01;

public class Circulo extends Plana {
	
	private int raio;
	
	public Circulo(int raio) {	
		setRaio(raio);
	}
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow((Math.PI * raio), 2);
	}

}
