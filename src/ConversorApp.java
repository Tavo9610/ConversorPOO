import java.util.Scanner;

public class ConversorApp {
	public static void main (String [] args) {
		
		Scanner entrada1 = new Scanner (System.in);
		int opcion;
		
	do {
		
		System.out.println("Bienvenido al conversor de Unidades de Gustavo");
		System.out.println("==============================================\n");
		System.out.println("Que unidad deseas convertir?\n" + 
							"\n1. Kilometros por Hora a Millas por hora.\n"+ 
							"2. Millas por hora a Kilometros por hora.\n"  +
							"3. Kilometros por hora a Metros por segundo\n" +
							"4. Metros por segundo a Kilometros por hora\n" +
							"5. Salir del Programa.");
		
		opcion = entrada1.nextInt();
		
		if (opcion == 1) {
		System.out.println("\nHa seleccionado convertir de Metros por segundo (M/S) a Kilometros por hora (KMH)");
		System.out.print("Introduzca cantidad de Metros por segundo: " );
		float var1 = entrada1.nextFloat();
		float resultado = Conversor.convertirmsaKms(var1);
		System.out.println(var1 + " Metros por segundo (M/S) equivalen a : "+ resultado + " Kilometros por hora (KM/H)"); 
		}
		
		else if(opcion == 2) {
		System.out.print("\nHa seleccionado convertir de Kilometros por hora (KH/H) a Metros por segundo (M/S)");
		System.out.print("Introduzca la cantidad de Kilometros por hora: ");
		float var2  = entrada1.nextFloat();
		float resultado2  = Conversor.convertirKmAms(var2);
		System.out.println(var2 + " Kilometros por hora (KM/H) equivalen a : "+ resultado2 + " Metros por segundo (M/S)");
		}
		
		else if(opcion == 3) {
		System.out.println("\nHa seleccionado convertir de Kilometros por hora (KM/H) a Millas por hora (MPH)");
		System.out.print("Introduzca la cantidad de Kilometros por hora");
		float var3 = entrada1.nextFloat();
		float resultado3 = Conversor.convertirKmaMI(var3);
		System.out.println(var3 + " Kilometros por hora (KM/H) equivalen a : "+ resultado3 + " Millas por hora (MPH)");
		}
		
		else if(opcion == 4) {
		System.out.println("\nHa seleccionado convertir de Millas por hora (MPH) a Kilometros por hora (KM/H)");
		System.out.print("Introduzca la cantidad de Millas por hora");
		float var4 = entrada1.nextFloat();
		float resultado4 = Conversor.convertirMiaKM(var4);
		System.out.println(var4 + " Millas por hora (MPH) equivalen a : "+ resultado4 + " Kilometros por hora (KM/H)");
		}
		
		else if(opcion == 5) {
			System.out.println("\nHa elegido salir del programa, Hasta luego!");
		}
		
		else {
			System.out.println("\nHa ingresado un dato invalido, ingrese una opcion del menu\n");
		};
		
	} while(opcion > 5);
		
	
	entrada1.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
