package co.nicolas.main;

import java.util.ArrayList;

import co.nicolas.dominio.Equipo;

public class Main {

	public static void main(String[] args) {
		
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
		rionegro.setNombreEquipo("NACIONAL");
		rionegro.setNombreTecnico("EVER HUGO ALMEIDA");
		rionegro.setNroJugadores(16);
		equipos.add(rionegro);
	}
}
