package br.com.alfonso;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TemporadaTest {

	@Test
	public void testTemporada() {
		Temporada temporada = new Temporada();
		Assert.assertEquals("[]\r\n", temporada.toString());
		Assert.assertEquals("[]", temporada.getTimes().toString());
		
		temporada.setID("2017-2018");
		Assert.assertEquals("[2017-2018]\r\n", temporada.toString());
	}
	
	@Test
	public void testRemoverTimesTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoverTimesString() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoverAgendasAgenda() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoverAgendasLocalDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testReagendarPartidaPartidaLocalDateLocalTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testReagendarPartidaLocalDatePartidaLocalDateLocalTime() {
		fail("Not yet implemented");
	}

	@Test
	public void testListarPartidas() {
		fail("Not yet implemented");
	}

}
