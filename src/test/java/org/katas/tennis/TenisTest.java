package org.katas.tennis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.katas.tennis.Tenis;

public class TenisTest {
	
	
	public Tenis tenis = new Tenis();
	@Test
	public void gana15PuntosJugador1(){
		int puntosJugador0 = tenis.puntos(0);
		tenis.sumaPuntos(0);
		assertEquals("Valor no esperado",puntosJugador0+Tenis.TANTEO_15, tenis.puntos(0));
	}

	
	@Test
	public void gana30PuntosJugador1(){
		int puntosJugador0 = tenis.puntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		assertEquals("Valor no esperado", puntosJugador0+Tenis.TANTEO_30, tenis.puntos(0));
	}
	
	
	@Test
	public void terminaJuegoGanaJugador1(){
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		assertEquals(0,tenis.ganadorJuego());	
	}
	
	@Test
	public void terminaJuegoGanaJugador2(){
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		assertEquals(1,tenis.ganadorJuego());
	}
	
	@Test
	public void finalizadoJuego(){
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		assertTrue(tenis.finalizadoJuego());
	}
	
	
}
