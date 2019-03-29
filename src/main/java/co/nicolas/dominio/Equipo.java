package co.nicolas.dominio;

import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private String nombreTecnico;	
	private int nroJugadores;
	private ArrayList<Jugador> jugador;
	
	public Equipo() {		
		this.nombreEquipo = nombreEquipo;
		this.nombreTecnico = nombreTecnico;		
		jugador =new ArrayList<>();
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getTecnico() {
		return nombreTecnico;
	}

	public void setNombreTecnico(String tecnico) {
		this.nombreTecnico = tecnico;
	}

	public int getNroJugadores() {
		return nroJugadores;
	}

	public void setNroJugadores(int nroJugadores) {
		this.nroJugadores = nroJugadores;
	}

	public ArrayList<Jugador> getJugador() {
		return jugador;
	}

	public void setJugador(ArrayList<Jugador> jugador) {
		this.jugador = jugador;
	}

}
