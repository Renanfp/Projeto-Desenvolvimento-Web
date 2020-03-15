package aula01;

public abstract class Poligono extends Plana {
	
	private int base;
	private int altura;
	
	public Poligono(int base, int altura) {	
		setBase(base);
		setAltura(altura);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getBase() * getAltura();
	}

}
