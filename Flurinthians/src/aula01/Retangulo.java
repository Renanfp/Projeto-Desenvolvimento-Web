package aula01;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getBase() * getAltura();
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
