package co.nicolas.dominio;

import java.util.ArrayList;

public class Torneo {
	private int nroFechas;
	private String nombreDelTorneo;
	private ArrayList<Equipo> equipos;
	
	public Torneo(String nombreDelTorneo, int nroFechas) {		
		this.nombreDelTorneo = nombreDelTorneo;
		this.nroFechas = nroFechas;
		equipos = new ArrayList<>();
	}

	public int getNroFechas() {
		return nroFechas;
	}

	public void setNroFechas(int nroFechas) {
		this.nroFechas = nroFechas;
	}

	public String getNombreDelTorneo() {
		return nombreDelTorneo;
	}

	public void setNombreDelTorneo(String nombreDelTorneo) {
		this.nombreDelTorneo = nombreDelTorneo;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
}
