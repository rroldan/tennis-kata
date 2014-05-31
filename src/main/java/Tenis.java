
public class Tenis {
	
	public static int TANTEO_0 = 0;
	public static int TANTEO_15 = 15;
	public static int TANTEO_30 = 30;
	public static int TANTEO_40 = 40;
	public static int TANTEO_GANA = 50;
	
	int[] indice = {0,0};
	int[] puntuacion = {TANTEO_0, TANTEO_15, TANTEO_30, TANTEO_40, TANTEO_GANA};
	boolean finalizaJuego = false;
	int ganador;
	
	public int puntos(int i) {
		return puntuacion[indice[i]];
	}

	public void sumaPuntos(int i) {
		indice[i] += 1;
		if(puntuacion[indice[i]] == TANTEO_GANA){
			finalizaJuego = true;
			ganador = i;
		}
		
		
	}

}
