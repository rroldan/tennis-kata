
import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaTest {
	
	
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
		assertEquals("Valor no esperado", puntosJugador0+30, tenis.puntos(0));
	}
	
	
}
