package com.trabajointegrador;
/**
 * 
 * @author Génesis Acosta
 *
 */

public class Partido{
public static Ronda resultado;
private Equipo equipo1;
private Equipo equipo2;
private int golesEquipo1;
private int golesEquipo2;

public Partido() {
	
}

public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
	this.equipo1 = equipo1;
	this.equipo2 = equipo2;
	this.golesEquipo1 = golesEquipo1;
	this.golesEquipo2 = golesEquipo2;
}


public Partido(Ronda resultado, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
	super();
	this.resultado = resultado;
	this.equipo1 = equipo1;
	this.equipo2 = equipo2;
	this.golesEquipo1 = golesEquipo1;
	this.golesEquipo2 = golesEquipo2;
}

public Partido(String string, String string2, int i, int j) {
	
}

public Equipo getEquipo1() {
	return equipo1;
}

public void setEquipo1(Equipo equipo1) {
	this.equipo1 = equipo1;
}

public Equipo getEquipo2() {
	return equipo2;
}

public void setEquipo2(Equipo equipo2) {
	this.equipo2 = equipo2;
}

public int getGolesEquipo1() {
	return golesEquipo1;
}

public void setGolesEquipo1(int golesEquipo1) {
	this.golesEquipo1 = golesEquipo1;
}

public int getGolesEquipo2() {
	return golesEquipo2;
}

public void setGolesEquipo2(int golesEquipo2) {
	this.golesEquipo2 = golesEquipo2;
}


public static Ronda getResultado() {
	return resultado;
}

public void setResultado(Ronda resultado) {
	this.resultado = resultado;
}

public ResultadoEnum resultado() {
	ResultadoEnum resultado;
	if(golesEquipo1 > golesEquipo2) {
		resultado=ResultadoEnum.GANADOR;
	}else if(golesEquipo1 == golesEquipo2) {
		resultado = ResultadoEnum.EMPATE;
	} else resultado = ResultadoEnum.PERDEDOR;
	return resultado;
	
}
}
