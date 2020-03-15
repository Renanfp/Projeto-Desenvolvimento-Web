package aula01;

public class Losango extends Poligono {

	public Losango(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getBase() * getAltura();
	}

}
