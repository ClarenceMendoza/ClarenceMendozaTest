package problema;

import java.util.Scanner;

public class Aceleracion {

		 
	      public static void main( String[] args ) {
	      double tiempo, aceleracion = 0;
	      double VI = 29.97;
	      double VF = 0.331;
	      Scanner t = new Scanner( System.in );
		  System.out.println( "Introduce el tiempo : ");
		  tiempo = t.nextInt();		
	      aceleracion = VF - VI / tiempo;
	      System.out.printf( "El valor de la aceleracion es: %.2f km/s", aceleracion );
	      
	   
	      		      
	   }
	 
	}
