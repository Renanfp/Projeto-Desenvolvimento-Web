package aula01;

public class Piramide extends FiguraEspacial {

	public Piramide(int largura, int altura, int comprimento) {
		super(largura, altura, comprimento);
	}

	@Override
	public double volume() {
		return  getLargura() * getComprimento() * getAltura() * 1/3;
	}

}
