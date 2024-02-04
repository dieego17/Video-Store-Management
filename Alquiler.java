package gestionVideoClub;

public class Alquiler {

	private DVD dvd;
	private int tiempo;
	
	
	public Alquiler() {
	}

	public Alquiler(DVD dvd, int tiempo) {
		this.dvd = dvd;
		this.tiempo = tiempo;
	}

	public DVD getDvd() {
		return dvd;
	}

	public int getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "Alquiler [dvd=" + dvd + ", tiempo=" + tiempo + "]";
	}
	
	
}
