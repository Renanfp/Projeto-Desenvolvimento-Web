package aula01;

public class Cilindro extends Espacial {
	
	private int raio;
	private int altura;
	
	public Cilindro(int raio, int altura) {
		
		setRaio(raio);
		setAltura(altura);
	}
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double volume() {
		return (Math.pow(Math.PI * getRaio(),3)) * getAltura();
	}
	
}
