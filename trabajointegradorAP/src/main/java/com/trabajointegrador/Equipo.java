package com.trabajointegrador;
/**
 * 
 * @author Génesis Acosta
 *
 */

public class Equipo {
	private String nombreEquipo;
	private String descripcion;
	
	public Equipo() {
	
	}

	public Equipo(String nombre, String descripcion) {
		this.nombreEquipo = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombreEquipo;
	}

	public void setNombre(String nombre) {
		this.nombreEquipo = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
