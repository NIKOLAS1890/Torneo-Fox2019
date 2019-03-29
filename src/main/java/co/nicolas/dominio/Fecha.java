package co.nicolas.dominio;

public class Fecha {
	private String mes;
	private int dia;
	private int a�o;
	
	public Fecha(String mes, int dia, int a�o) {
		this.mes = mes;
		this.dia = dia;
		this.a�o = a�o;
	}

	public String getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public int getA�o() {
		return a�o;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
}
