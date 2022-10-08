package problema;

import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		class Problema {
					public static void main(String[] args) {
					// TODO Auto-generated method stub

						class Aceleracion {
					 
					      public static void main( String[] args ) {
					      double tiempo, aceleracion, velocidad = 0;
					      double VI = 299792.458;
					      double VF = 0.331;
					      Scanner s = new Scanner( System.in );
					      System.out.println( "Introduce el tiempo : ");
					      tiempo = s.nextInt();
					      aceleracion = VF - VI / tiempo;
					      System.out.println( "La aceleracion es" + aceleracion );
					      
					      		      
					   }
					 
					}
					
						class DistanciaRecorrida {
							 
						      public static void main( String[] args ) {
						      double tiempo, velocidad, DistanciaRecorrida = 0;
						      double VI = 299792.458;
						      double valor= 1.5;
						      double VI1 = 299792.458;
						      double VF = 0.331;
						      Scanner s = new Scanner( System.in );
						      System.out.println( "Introduce el tiempo: ");
						      tiempo = s.nextInt();
						      System.out.println( "Introduce la velocidad: ");
						      velocidad = s.nextInt();
						      DistanciaRecorrida = valor(VI1+VF)*tiempo;
						      System.out.println( "La aceleracion es" + DistanciaRecorrida );
						     	      
						      
						   }
						      

							private static double valor(double d) {
								// TODO Auto-generated method stub
								return 0;
							}
						 
						}
				}

			}


		}


	}


