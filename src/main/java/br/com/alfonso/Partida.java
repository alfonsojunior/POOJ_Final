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
		this.pontosCasa = 0;
		setVisitante(null);
		this.pontosVisitante = 0;
		this.fim = true;
		this.vitorioso = 'X';
		
	}
	
	public void iniciarPartida() {
		if (this.casa != null && this.visitante != null)
		{
			this.fim = false;
			this.vitorioso = 'I';
		}
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
		if (casa != null) {
			if (this.visitante != null) {
				if (!casa.toString().equals(this.visitante.toString())) {
					this.casa = casa;
				}
			} else {
				this.casa = casa;
			}
		} else {
			this.casa = null;
		}
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		if (visitante != null) {
			if (this.casa != null) {
				if (!visitante.toString().equals(this.casa.toString())) {
					this.visitante = visitante;
				}
			} else {
				this.visitante = visitante;
			}
		} else {
			this.visitante = null;
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
	
	public String getID() {
		return this.casa.getNome().trim() + "X" + this.visitante.getNome().trim();
	}
	
	@Override
	public String toString() {
		if (this.casa == null || this.visitante == null) {
			return "Partida inválida";
		} else {
			return this.casa.getNome() + " X " + this.visitante.getNome() + "\r\n" 
					+ this.pontosCasa + " X " + this.pontosVisitante + "\r\n"
					+ (this.fim && this.vitorioso != 'X' ? "Partida finalizada" : 
						this.fim && this.vitorioso == 'X'? "Partida não iniciada" : "Partida em andamento");
		}
	}
	
}
