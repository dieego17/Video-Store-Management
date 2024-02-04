package gestionVideoClub;

public class App {

	public static void main(String[] args) {
		
		//Creo mi cliente
		Cliente c1=new Cliente("Juan López Sánchez");
		
		//Creo los 3 DVD
		DVD casablanca = new DVD("Casablanca",DVD.NORMAL);
		DVD indy = new DVD("Indiana Jones XIII",DVD.NOVEDAD);
		DVD shrek = new DVD("Shrek",DVD.INFANTIL);
		DVD cars = new DVD("Cars", DVD.INFANTIL);
		
		
		Alquiler a1 = new Alquiler(casablanca, 2);
		Alquiler a2 = new Alquiler(indy, 4);
		Alquiler a3 = new Alquiler(shrek, 8);
		Alquiler a4 = new Alquiler(cars, 1);
		
		c1.nuevoAlquiler(a1);
		c1.nuevoAlquiler(a2);
		c1.nuevoAlquiler(a3);
		c1.nuevoAlquiler(a4);
		
		c1.mostrarInforme();

	}

}
