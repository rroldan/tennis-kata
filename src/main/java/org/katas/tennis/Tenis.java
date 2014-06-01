package org.katas.tennis;

public class Tenis {
	
	public static int JUGADOR1 = 0;
	public static int JUGADOR2 = 1;
	
	public static int TANTEO_0 = 0;
	public static int TANTEO_15 = 15;
	public static int TANTEO_30 = 30;
	public static int TANTEO_40 = 40;
	public static int TANTEO_GANA = 50;
	
	public static int POSICION_TANTEO_40 = 3;
	
	boolean[] ventaja = {false,false};
	int[] indice = {0,0};
	int[] puntuacion = {TANTEO_0, TANTEO_15, TANTEO_30, TANTEO_40, TANTEO_GANA};
	boolean finalizaJuego = false;
	boolean iguales = false;
	int ganador=-1;
	
	
	
	public int puntos(int i) {
		return puntuacion[indice[i]];
	}

	public void sumaPuntos(int i) {
		if (!tratarVentaja(i)){
			indice[i] += 1;
			tratarIguales();
			if(puntuacion[indice[i]] == TANTEO_GANA){
				finalizaJuego = true;
				ganador = i;
			}	
		}
	}

	private boolean tratarVentaja(int i) {
		boolean trataVentaja = false;
		if(ventaja[i]) {
			return trataVentaja;
		}
		
		if (ventaja[0] || ventaja[1]){
			ventaja[0] = false;
			ventaja[1] = false;
			trataVentaja = true;
			return trataVentaja;
			
		}
		
		if(iguales()){
			trataVentaja = true;
			iguales = false;
			ventaja[i] = true;	
		} 	
		
		return trataVentaja;
		
	}

	private void tratarIguales() {
		if((puntuacion[indice[JUGADOR1]] == TANTEO_40) && (puntuacion[indice[JUGADOR2]] == TANTEO_40)){
			iguales = true;
		}	
	}

	public int ganadorJuego() {
		return ganador;
	}

	public boolean finalizadoJuego(){
		return finalizaJuego;
	}

	public boolean iguales() {	
		return iguales;
	}
	
	public boolean ventaja(int i){
		return ventaja[i];
	}

}
