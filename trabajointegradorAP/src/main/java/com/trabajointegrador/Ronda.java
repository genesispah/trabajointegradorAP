package com.trabajointegrador;

import java.util.List;

/**
 * 
 * @author Génesis Acosta
 *
 */
public class Ronda{

	private int numRonda;
	private List<Partido> partidos;
	
	public Ronda() {
		
	}

	
	
	public Ronda(int numRonda, List<Partido> partidos) {
		super();
		this.numRonda = numRonda;
		this.partidos = partidos;
	}

	
	public int getNumRonda() {
		return numRonda;
	}



	public void setNumRonda(int numRonda) {
		this.numRonda = numRonda;
	}



	public List<Partido> getPartidos() {
		return partidos;
	}



	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}



	public Ronda puntos() {
		while(numRonda <=2) {
			numRonda++;
			return Partido.resultado;
			
		}
		return null;
		
	}
	
}
