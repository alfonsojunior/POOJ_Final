package br.com.alfonso;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PartidaTest {

	@Test
	public void testPartida() {
		Partida partida = new Partida();
		Assert.assertEquals("Partida inválida", partida.toString());
	}

	@Test
	public void testIniciarPartida() {
		Partida partida = new Partida();
		partida.iniciarPartida();
		Assert.assertEquals('X', partida.getVitorioso());
		Assert.assertEquals("Partida inválida", partida.toString());
		Time time = new Time();
		time.setSigla("TS1");
		time.setNome("Teste1");
		partida.setCasa(time);
		time = new Time();
		time.setSigla("TS2");
		time.setNome("Teste2");
		partida.setVisitante(time);
		partida.iniciarPartida();
		Assert.assertEquals('X', partida.getVitorioso());
		Assert.assertEquals("Teste1 X Teste2\r\n0 X 0\r\nPartida em andamento", partida.toString());
	}

	@Test
	public void testAdicionarPontosCasa() {
		Partida partida = new Partida();
		Time time = new Time();
		time.setSigla("TS1");
		time.setNome("Teste1");
		partida.setCasa(time);
		time = new Time();
		time.setSigla("TS2");
		time.setNome("Teste2");
		partida.setVisitante(time);
		Assert.assertEquals("Teste1 X Teste2\r\n0 X 0\r\nPartida não iniciada", partida.toString());
		partida.adicionarPontosCasa(1);
		Assert.assertEquals("Teste1 X Teste2\r\n0 X 0\r\nPartida não iniciada", partida.toString());
		partida.iniciarPartida();
		partida.adicionarPontosCasa(1);
		Assert.assertEquals("Teste1 X Teste2\r\n1 X 0\r\nPartida em andamento", partida.toString());
	}

	@Test
	public void testGetPontosCasa() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdicionarPontosVisitante() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPontosVisitante() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCasa() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCasa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVisitante() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVisitante() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalizarPartida() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVitorioso() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetID() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
