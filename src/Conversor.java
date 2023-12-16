import java.util.Scanner;

public class Conversor {
	
	Scanner entry1 = new Scanner (System.in);
	/*
	 * Atributos de la Clase Calculadora 
	 * Parte de los miembros estaticos de la clase 
	 */
	
	private static Float resultado;
	
	/*
	 * Metodos estaticos y publicos de la Clase Calculadora
	 * Parte de los miembros estaticos de la clase 
	 */
	
	public static Float convertirmsaKms(float ms) {
		final float km = 3.6f;
		resultado = ms * km;
		return resultado;
	};
	
	public static Float convertirKmAms(float kmh) { 
		final float ms = 0.28f;
		resultado = kmh * ms;
		return resultado;
	};
	
	public static Float convertirKmaMI (float kmAmi) {
		final float mph = 0.62f;
		resultado = kmAmi * mph;
		return resultado;	
	};
	
	public static Float convertirMiaKM (float miAkm) {
		final float kmh = 1.61f;
		resultado = miAkm * kmh;
		return resultado;
	}
	
	
	
	
}
