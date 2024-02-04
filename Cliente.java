package gestionVideoClub;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Alquiler>listaAlquileres;
	
	
	public Cliente() {
	}
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.listaAlquileres = new ArrayList<Alquiler>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alquiler> getListaAlquileres() {
		return listaAlquileres;
	}

	public void setListaAlquileres(ArrayList<Alquiler> listaAlquileres) {
		this.listaAlquileres = listaAlquileres;
	}
	

	public void nuevoAlquiler(Alquiler a) {
		listaAlquileres.add(a);
	}
	
	public void mostrarInforme() {
		double precio = 0;
		double precioTotal = 0;
		int puntos = 0;
		System.out.println("Informe para "+nombre);
		for(Alquiler a : listaAlquileres) {
			//System.out.println(a.getDvd().getTitulo());
			if(a.getDvd().getTipo() == 0) {
				
				precio = 2*a.getTiempo();
				
			}else if(a.getDvd().getTipo() == 1){
				
				precio = 3*a.getTiempo();
		
			}else if(a.getDvd().getTipo() == 2) {
				
				precio = 1.5*a.getTiempo();
				
			}
			System.out.println(a.getDvd().getTitulo()+"   "+precio+" euros");
			puntos++;
			precioTotal += precio;
		}
		System.out.println("IMPORTE TOTAL = "+precioTotal+" euros");
		System.out.println("Dispone de "+puntos+" puntos");
		
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", listaAlquileres=" + listaAlquileres + "]";
	}
	
	
	
}
