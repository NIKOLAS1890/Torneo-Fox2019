package co.nicolas.dominio;

import java.util.ArrayList;

public class Partido {
	private String fecha;
	private int golesEnContra;
	private int golesAFavor;
	private String tiempo;
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	
	public Partido(String fecha, int golesEnContra, String tiempo, ArrayList<Equipo> equipos) {
		this.fecha = fecha;
		this.golesEnContra = golesEnContra;
		this.tiempo = tiempo;
		this.equipos = equipos;
	}
	public String getFecha() {
		return fecha;
	}
	public int getGolesEnContra() {
		return golesEnContra;
	}
	public String getTiempo() {
		return tiempo;
	}
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setGolesEnContra(int golesEnContra) {
		this.golesEnContra = golesEnContra;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
}
