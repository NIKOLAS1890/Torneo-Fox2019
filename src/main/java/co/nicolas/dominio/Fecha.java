package co.nicolas.dominio;

public class Fecha {
	private String mes;
	private int dia;
	private int año;
	
	public Fecha(String mes, int dia, int año) {
		this.mes = mes;
		this.dia = dia;
		this.año = año;
	}

	public String getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public int getAño() {
		return año;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setAño(int año) {
		this.año = año;
	}
}
