package tareaDia14;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
//		
//		
		//
	 	
	 	
	 	Scanner iEntrada=new Scanner(System.in);
		int opcion=0; 
		
		do {
			System.out.println("-----------------------------------------");
			System.out.println("       Ingresa el número de opción       ");
			System.out.println("-----------------------------------------");
			System.out.println("1.- CALCULADORA BASICA  ");
			System.out.println("2.- AREA DE UN CIRCULO");
			System.out.println("3.- PROMEDIO DE NUMEROS");
			System.out.println("-----------------------------------------");
			System.out.println("4.- SALIR...");
			System.out.println("-----------------------------------------");
			if(iEntrada.hasNextInt()){opcion=iEntrada.nextInt();}else {opcion=5;}
			
			switch (opcion) { 
		    case 1:
		    	   calculadora clsCalculadora=new calculadora();
		    	   clsCalculadora.ingresarDatos(); 
		           break;
		     
		    case 2:
		    	   circulo clsCirculo= new circulo(); 
      		 	   break;
		     
		    case 3 :
		    	   promedioNumeros clsPromedios= new promedioNumeros(); 
		           break;
		     
		    case 4 :
		         	System.out.println("******Fin del programa******");	
			        break;
			     
		    default:
		    	    System.out.println("OPCION NO VALIDA");	 
		            break;
		  }
			
			if(opcion!=4)
			{
				iEntrada.nextLine();
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();
			}
			
		} while(opcion!=4);
     	iEntrada.close();
	}

}
