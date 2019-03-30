package co.nicolas.main;

import java.util.ArrayList;
import java.util.function.Consumer;

import co.nicolas.dominio.Equipo;
import co.nicolas.dominio.Jugador;
import co.nicolas.dominio.Torneo;
import jdk.nashorn.internal.runtime.ListAdapter;

public class Main {

	public static void main(String[] args) {
		
		Equipo equipo = new Equipo();
		Torneo torneo = new Torneo();		
		
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		
		Equipo nacional = new Equipo();
		nacional.setNombreEquipo("NACIONAL");
		nacional.setNombreTecnico("PAULO AUTUORI");
		nacional.setNroJugadores(16);
		equipos.add(nacional);
		
		Equipo envigado = new Equipo();
		envigado.setNombreEquipo("ENVIGADO");
		envigado.setNombreTecnico("ISMAEL RESCALVO");
		envigado.setNroJugadores(16);
		equipos.add(envigado);
		
		Equipo medellin = new Equipo();
		medellin.setNombreEquipo("MEDELLIN");
		medellin.setNombreTecnico("OCTAVIO ZAMBRANO");
		medellin.setNroJugadores(16);
		equipos.add(medellin);
		
		Equipo rionegro = new Equipo();
		rionegro.setNombreEquipo("RIONEGRO");
		rionegro.setNombreTecnico("EVER HUGO ALMEIDA");
		rionegro.setNroJugadores(16);
		equipos.add(rionegro);
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		
		Jugador jugadorNacional = new Jugador();
		jugadorNacional.setNombreJugador("CARLOS");
		jugadorNacional.setEdad(32);
		jugadorNacional.setNroCamiseta(10);
		jugadorNacional.setPosicion("defensa");
		jugadores.add(jugadorNacional);
		
		Jugador jugadorMedellin = new Jugador();
		jugadorMedellin.setNombreJugador("DANIEL");
		jugadorMedellin.setEdad(29);
		jugadorMedellin.setNroCamiseta(17);
		jugadorMedellin.setPosicion("defensa");
		jugadores.add(jugadorMedellin);
		
		Jugador jugadorEnvigado = new Jugador();
		jugadorEnvigado.setNombreJugador("CAMILO");
		jugadorEnvigado.setEdad(27);
		jugadorEnvigado.setNroCamiseta(6);
		jugadorEnvigado.setPosicion("defensa");
		jugadores.add(jugadorEnvigado);
		
		Jugador jugadorRionegro = new Jugador();
		jugadorRionegro.setNombreJugador("ROBINSON");
		jugadorRionegro.setEdad(33);
		jugadorRionegro.setNroCamiseta(32);
		jugadorRionegro.setPosicion("defensa");
		jugadores.add(jugadorRionegro);
		
		equipo.setJugadores(jugadores);
		torneo.setEquipos(equipos);
		
		System.out.println(equipo.consultarJugadoresEnPosicion());
		System.out.println(torneo.verEquiposDeTorneo());
	}
}
