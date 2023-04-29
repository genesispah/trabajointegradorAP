package com.trabajointegrador;

public class Jugadores {
	private String nombre;
	private int puntaje;
	
	public Jugadores() {
	
	}

	public Jugadores(String nombre, int puntaje) {
		super();
		this.nombre = nombre;
		this.puntaje = puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	

}
