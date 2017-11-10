package br.com.alfonso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

	private LocalDate data = LocalDate.MIN;
	private ArrayList<Horario> horarios = new ArrayList<Horario>();
	
	public Agenda() {
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public ArrayList<Horario> getHorarios() {
		return this.horarios;
	}
	
	public void adicionarHorario(Horario partida) {
		this.horarios.add(partida);
	}
	
	public void removerHorario(Horario horario) {
		for (Iterator<Horario> it = this.horarios.iterator(); it.hasNext(); ) {
			Horario part = it.next();
			if (part.getID().equals(horario.getID())) {
				it.remove();
			}
		}
	}
	
	public String getID() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYYMMdd");
		return data.format(dtf);
	}
	
}
