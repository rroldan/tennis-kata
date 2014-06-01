package org.katas.tennis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.katas.tennis.Tenis;

public class TenisTest {
	
	

	@Test
	public void gana15PuntosJugador1(){
		Tenis tenis = new Tenis();
		int puntosJugador0 = tenis.puntos(0);
		tenis.sumaPuntos(0);
		assertEquals("Valor no esperado",puntosJugador0+Tenis.TANTEO_15, tenis.puntos(0));
	}

	
	@Test
	public void gana30PuntosJugador1(){
		Tenis tenis = new Tenis();
		int puntosJugador0 = tenis.puntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		assertEquals("Valor no esperado", puntosJugador0+Tenis.TANTEO_30, tenis.puntos(0));
	}
	
	
	@Test
	public void terminaJuegoGanaJugador1(){
		Tenis tenis = new Tenis();
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		assertEquals(0,tenis.ganadorJuego());	
	}
	
	@Test
	public void terminaJuegoGanaJugador2(){
		Tenis tenis = new Tenis();
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		assertEquals(1,tenis.ganadorJuego());
	}
	
	@Test
	public void finalizadoJuego(){
		Tenis tenis = new Tenis();
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		assertTrue(tenis.finalizadoJuego());
	}
	
	@Test
	public void NoIguales(){
		Tenis tenis = new Tenis();
		assertFalse(tenis.iguales());
	}
	
	@Test
	public void iguales(){
		Tenis tenis = new Tenis();
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		assertTrue(tenis.iguales());
	}
	
	@Test
	public void TratarVentajaJugador1(){
		Tenis tenis = new Tenis();
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(0);
		assertTrue(tenis.ventaja(0));
		
	}
	
	@Test
	public void TratarVentajaJugador1YGana(){
		Tenis tenis = new Tenis();
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(1);
		tenis.sumaPuntos(0);
		tenis.sumaPuntos(0);
		assertTrue(tenis.finalizadoJuego());
		
	}
	
	
	
	
	
}
