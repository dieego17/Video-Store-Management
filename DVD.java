package gestionVideoClub;

public class DVD {

	private String titulo;
	private int tipo;
	
	public static final int INFANTIL=2;
	public static final int NORMAL=0;
	public static final int NOVEDAD=1;
	
	
	public DVD() {
	}



	public DVD(String titulo, int tipo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
	}

	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public static int getInfantil() {
		return INFANTIL;
	}

	public static int getNormal() {
		return NORMAL;
	}

	public static int getNovedad() {
		return NOVEDAD;
	}



	@Override
	public String toString() {
		return "DVD [titulo=" + titulo + ", tipo=" + tipo + "]";
	}
	
	
	
}
