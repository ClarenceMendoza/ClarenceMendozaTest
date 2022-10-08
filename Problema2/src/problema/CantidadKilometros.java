package problema;

import java.util.Scanner;

public class CantidadKilometros {


    public static void main( String[] args ) {
    	
    	
    double distancia,tiempo = 0;
    double V = 29.979; // velocidad en km/s
    Scanner t = new Scanner( System.in );
	System.out.println( "Introduce el tiempo : ");
	tiempo = t.nextInt();		
	distancia = V/tiempo;
    System.out.printf( "Cantidad de Kilometros recorridos es: %.2f km", distancia );
    
 
    		      
 }

}