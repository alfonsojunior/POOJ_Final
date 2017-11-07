package br.com.alfonso;

public class Partida {
	
	private Time casa = null;
	private int pontosCasa = 0;
	private Time visitante = null;
	private int pontosVisitante = 0;
	private boolean fim = true;
	private char vitorioso = 'X';
	
	public Partida() {
		
		setCasa(null);
		pontosCasa = 0;
		setVisitante(null);
		pontosVisitante = 0;
		fim = true;
		
	}
	
	public void iniciarPartida() {
		if (this.casa != null && this.visitante != null)
			this.fim = false;
	}
	
	public void adicionarPontosCasa(int pontos) {
		if (!this.fim) {
			if (pontos > 0 && pontos <= 3) {
				this.pontosCasa += pontos;
			}
		}
	}
	
	public int getPontosCasa() {
		return this.pontosCasa;
	}
	
	public void adicionarPontosVisitante(int pontos) {
		if (!this.fim) {
			if (pontos > 0 && pontos <= 3) {
				this.pontosVisitante += pontos;
			}
		}
	}
	
	public int getPontosVisitante() {
		return this.pontosVisitante;
	}

	public Time getCasa() {
		return casa;
	}

	public void setCasa(Time casa) {
		if (!casa.toString().equals(this.visitante.toString())) {
			this.casa = casa;
		}
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		if (!visitante.toString().equals(this.casa.toString())) {
			this.visitante = visitante;
		}
	}
	
	public void finalizarPartida() {
		if (this.pontosCasa != this.pontosVisitante) {
			this.fim = true;
			if (this.pontosCasa > this.pontosVisitante) {
				this.vitorioso = 'C';
			} else {
				this.vitorioso = 'V';
			}
		}
	}
	
	public char getVitorioso() {
		return this.vitorioso;
	}
	
}
