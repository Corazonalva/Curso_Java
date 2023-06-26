package tareaDia16;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		NumeroPosNeg clsnumero=new NumeroPosNeg();
				
		Scanner iEntrada=new Scanner(System.in);
		int opcion=0; 		
		do {
			System.out.println("\n\n");
			System.out.println("---------------------------------------------");
			System.out.println("         Ingresa el número de opción         ");
			System.out.println("---------------------------------------------");
			System.out.println("1.- VERIFICAR NUMERO POSITIVO/NEGATIVO/CERO  ");
			System.out.println("2.- VERIFICAR NUMERO PAR/IMPAR Y/O PRIMO     ");
			System.out.println("3.- VERIFICAR AÑO BISIESTO                   ");
			System.out.println("---------------------------------------------");
			System.out.println("4.- SALIR...");
			System.out.println("---------------------------------------------");
			if(iEntrada.hasNextInt()){opcion=iEntrada.nextInt();}else {opcion=5;}
			
			switch (opcion) { 
		    case 1:
		    	   clsnumero.ingresaDatos();
				   System.out.println("El número "+clsnumero.getNumero()+" es "+clsnumero.positivoNegativoCero());
		           break;
		     
		    case 2:
		    	   clsnumero.ingresaDatos();
		    	   System.out.println("El número "+clsnumero.getNumero()+" es "+clsnumero.parImpar());
		   		   System.out.println("El número "+clsnumero.getNumero()+" es "+clsnumero.primoNoprimo());
		           break;
		     
		    case 3 :
		    	   AñoBisiesto clsaño= new AñoBisiesto();
		    	   clsaño.ingresaDatos();
		    	   if(clsaño.verificaAño())
		    	   {
		    		   System.out.println("El año "+clsaño.getAño()+" es un año bisiesto...");			
		    	   }
		    	   else
		    	   {
		    		   System.out.println("El año "+clsaño.getAño()+" no es un año bisiesto...");
		    	   }
		           break;
		     
		    case 4 :
		         	System.out.println("******Fin del programa******");	
			        break;
			     
		    default:
		    	    System.out.println("OPCION NO VALIDA");	 
		            break;
		  }
			
			if(opcion>=5)
			{
				iEntrada.nextLine();
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();
			}
			
		} while(opcion!=4);
     	iEntrada.close();
	}

}
