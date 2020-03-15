package aula01;

public class Triangulo extends Poligono {

	public Triangulo(int base, int altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.area()/ 2;
	}

}
