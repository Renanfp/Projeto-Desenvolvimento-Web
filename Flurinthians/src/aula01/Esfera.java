package aula01;

public class Esfera extends Espacial {
	
	private int raio;
	
	public Esfera(int raio) {
		setRaio(raio);
	}
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	@Override
	public double volume() { 
		return 4/3 * Math.pow(Math.PI * getRaio(),3);
	}

}
