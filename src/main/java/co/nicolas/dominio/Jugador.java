package co.nicolas.dominio;

public class Jugador {
	private String nombreJugador;
	private int edad;
	private int nroCamiseta;
	private String posicion;
	
	public Jugador() {
		this.nombreJugador = nombreJugador;
		this.edad = edad;
		this.posicion = posicion;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNroCamiseta() {
		return nroCamiseta;
	}

	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}
