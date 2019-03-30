package co.nicolas.dominio;

import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private String nombreTecnico;	
	private int nroJugadores;
	private ArrayList<Jugador>jugadores = new ArrayList<>();
	
	public Equipo() {
		this.nombreEquipo = nombreEquipo;
		this.nombreTecnico = nombreTecnico;		
		this.jugadores =new ArrayList<>();
	}
	
	public String consultarJugadoresEnPosicion() {
		String listaJugadores = null;
		for (Jugador jugador : jugadores) {
			if (jugador.getPosicion() == "defensa") {
				listaJugadores = jugador.getNombreJugador();
				System.out.println("El jugador en la posicion de "+jugador.getPosicion()+" es: "+listaJugadores);
			}
		}
		return "";
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public String getNombreTecnico() {
		return nombreTecnico;
	}

	public int getNroJugadores() {
		return nroJugadores;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void setNombreTecnico(String nombreTecnico) {
		this.nombreTecnico = nombreTecnico;
	}

	public void setNroJugadores(int nroJugadores) {
		this.nroJugadores = nroJugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
}
