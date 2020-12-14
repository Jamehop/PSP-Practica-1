package Practica1Client;

public class Cartera {
	private double cantidadDinero;

	public Cartera(double cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}

	synchronized public void incrementar(double ingresar) {
		cantidadDinero = cantidadDinero + ingresar;
		System.out.println("Se ha ingresado " + (int)ingresar + ", ahora hay: " + (int)cantidadDinero);
	}

	synchronized public void decrementar(double sacar) {
		cantidadDinero = cantidadDinero - sacar;
		System.out.println("Se ha sacado " + (int)sacar + ", ahora hay: " + (int)cantidadDinero);
	}

}
