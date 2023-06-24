package tareaDia11;

import java.util.Scanner;

public class menuOpciones {

	public static void main(String[] args) {
		Scanner iEntrada=new Scanner(System.in);
		int opcion=0;
		float nfNumero=0.0f;
		float nfBase=0.0f;
		float nfAltura=0.0f;
		
		do {
			System.out.println("-----------------------------------------");
			System.out.println("       Ingresa el número de opción       ");
			System.out.println("-----------------------------------------");
			System.out.println("1.- CONVERSION DE TEMPERATURA (°C a °F)  ");
			System.out.println("2.- AREA DE UN RECTANGULO");
			System.out.println("3.- AREA DE UN CIRCULO");
			System.out.println("-----------------------------------------");
			System.out.println("4.- SALIR...");
			System.out.println("-----------------------------------------");
			opcion=iEntrada.nextInt();
			
			switch (opcion) { 
		    case 1:
		    	   System.out.println("\n\n\n\n\n\n");  
		    	   System.out.println("Ingrese los grados °C a convertir: ");
				   nfNumero=iEntrada.nextFloat(); 
				   System.out.println(nfNumero+" °C es igual a "+(nfNumero*(9.0/5.0)+32)+ " °F");			 	   
		           break;
		     
		    case 2:
      		 	   System.out.println("\n\n\n\n\n\n");
      		 	   System.out.println("Ingrese la BASE del rectangulo: ");
      		 	   nfBase=iEntrada.nextFloat();
      		 	   System.out.println("Ingrese la ALTURA del rectangulo: ");
   		 	       nfAltura=iEntrada.nextFloat();   
      		 	   System.out.println("el AREA del rectangulo es igual a "+(nfBase*nfAltura)+"cm2");
      		 	   break;
		     
		    case 3 :
		    	   System.out.println("\n\n\n\n\n\n");  
		    	   System.out.println("Ingrese el RADIO del circulo: ");
				   nfNumero=iEntrada.nextFloat(); 
				   System.out.println("el AREA del circulo es igual a "+(3.1416*(nfNumero*nfNumero))+ "cm2");			 	   
		           break;
		     
		    case 4 :
		         	iEntrada.close();
		            System.out.println("Programa finalizado... ");
			        break;
			     
		    default:
		    	    System.out.println("\n\n\n\n\n\n");  
		    	    System.out.println("... opción no valida ...");			 	   
		            break;
		  } 
			
		  if(opcion!=4)
		  {
			  iEntrada.nextLine();
			  System.out.println("\n\t\t PRESIONE ENTER PARA CONTINUAR...");
			  iEntrada.nextLine();
		  }
			
			
		} while(opcion!=4);

	}

}
