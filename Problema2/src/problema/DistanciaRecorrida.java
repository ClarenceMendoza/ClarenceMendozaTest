package problema;
import java.util.Scanner;

public class DistanciaRecorrida {

		          public static void main( String[] args ) {
			      double tiempo,  distancia = 0;
			      double VI = 29.979;
			      double VF = 0.331;
			      
			      
			     				  
				  double  x1=0;
				  Scanner v1 = new Scanner( System.in );
				  System.out.println( "Introduce la distancia X1 : ");
				  x1 = v1.nextInt();
				  
				  double x2 = 0;
				  Scanner v2 = new Scanner( System.in );
				  System.out.println( "Introduce la distancia X2 : ");
				  tiempo = v2.nextInt();
				  
				  int y2 = 0;
				  Scanner v3 = new Scanner( System.in );
				  System.out.println( "Introduce la distancia Y1 : ");
				  tiempo = v3.nextInt();
				  
				  int y1 = 0;
				  Scanner v4 = new Scanner( System.in );
				  System.out.println( "Introduce el tiempo : Y2 ");
				  tiempo = v4.nextInt();
				  
				  distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
			      System.out.printf( "La distancia recorrida es de : %.2f km" , distancia);
		      
	     	      
	   
	           
	   }
	      }   

	      
