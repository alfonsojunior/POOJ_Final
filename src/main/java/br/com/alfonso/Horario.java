package br.com.alfonso;

import java.time.LocalTime;
import java.util.ArrayList;

public class Horario {

	private LocalTime hora = LocalTime.MIN;
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	
	public Horario() {
		this.partidas = new ArrayList<Partida>();
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public ArrayList<Partida> getPartidas() {
		return this.partidas;
	}
	
	public void adicionarPartida(Partida partida) {
		this.partidas.add(partida);
	}
	
	public void removerPartida(Partida partida) {
		for (Partida part : this.partidas) {
			if (part.getID().equals(partida.getID()) && part.getVitorioso() != 'C' && part.getVitorioso() != 'V') {
				this.partidas.remove(part);
			}
		}
	}

}
