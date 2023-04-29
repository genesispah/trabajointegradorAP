package com.trabajointegrador;
/**
 * 
 * @author Génesis Acosta
 *
 */
public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum resultadoEnum;
	
public Pronostico() {
	
}

public Partido getPartido() {
	return partido;
}

public void setPartido(Partido partido) {
	this.partido = partido;
}

public Equipo getEquipo() {
	return equipo;
}

public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}

public ResultadoEnum getResultadoEnum() {
	return resultadoEnum;
}

public void setResultadoEnum(ResultadoEnum resultadoEnum) {
	this.resultadoEnum = resultadoEnum;
}


}
