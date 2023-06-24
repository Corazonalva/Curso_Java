package tareaDia15;

import java.util.Scanner;

public class ConversionMonedas {
	private byte monedaLocal;
	private byte monedaDestino;
	private double cantidadMonedasInicio;
	private double cantidadMonedasFinal;
	private String[] strmonedas= {"SOLES","PESOS MEXICANO","DOLARES","QUETZALES"};
	
	public byte getMonedaLocal() {
		return monedaLocal;
	}
	public byte getMonedaDestino() {
		return monedaDestino;
	}
	public double getCantidadMonedasInicio() {
		return cantidadMonedasInicio;
	}
	
	
	public void seleccionaMoneda()
	{
		Scanner iEntrada=new Scanner(System.in);
		boolean bandera=true;
		do {			
			System.out.println("Ingresa la cantidad a convertir:");
			if(iEntrada.hasNextDouble())
			{
				cantidadMonedasInicio=iEntrada.nextDouble();
				bandera=false;
			}
			else
			{
				System.out.println("CANTIDAD NO VALIDA");	 
				iEntrada.nextLine();
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();
			}
		} while(bandera);
		
		monedaLocal=0;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("  Ingresa la opción de la moneda local   ");
			System.out.println("-----------------------------------------");
			System.out.println("1.- SOLES  ");
			System.out.println("2.- PESOS MEXICANOS");
			System.out.println("3.- DOLARES");
			System.out.println("4.- QUETZALES");
			System.out.println("-----------------------------------------"); 
			if(iEntrada.hasNextByte()){monedaLocal=iEntrada.nextByte();}else {monedaLocal=5;}
			
			if(monedaLocal>=5) 
			{
				System.out.println("OPCION NO VALIDA");	 
				iEntrada.nextLine();
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();
			}			
		} while(monedaLocal>=5);
		
		monedaDestino=0;
		do {
			System.out.println("-----------------------------------------");
			System.out.println("  Ingresa la opción de la moneda Destino   ");
			System.out.println("-----------------------------------------");
			System.out.println("1.- SOLES  ");
			System.out.println("2.- PESOS MEXICANOS");
			System.out.println("3.- DOLARES");
			System.out.println("4.- QUETZALES");
			System.out.println("-----------------------------------------"); 
			if(iEntrada.hasNextByte()){monedaDestino=iEntrada.nextByte();}else {monedaDestino=5;}
			
			if(monedaDestino>=5) 
			{
				System.out.println("OPCION NO VALIDA");	 
				iEntrada.nextLine();
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();
			}			
		} while(monedaDestino>=5);
		
	}
	
	public double convertirMoneda()
	{
		switch (monedaLocal)
		{
		  case 1:// soles a:
			  switch (monedaDestino)
			  {
			    case 2: // pesos mex.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*4.73;
					  break;
			    case 3: // dolares.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*0.28;
					  break;
			    case 4: // quetzales.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*2.16;
					  break;
			    default: // misma moneda local-destino.
			    	  cantidadMonedasFinal=cantidadMonedasInicio;
					  break;
			  } 
			  break;
			  
		  case 2:// pesos mex a:
			  switch (monedaDestino)
			  {
			    case 1: // soles.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*0.21;
					  break;
			    case 3: // dolares.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*0.058;
					  break;
			    case 4: // quetzales.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*0.46;
					  break;
			    default: // misma moneda local-destino.
			    	  cantidadMonedasFinal=cantidadMonedasInicio;
					  break;
			  } 
			  break;
			  
		  case 3:// dolares a:
			  switch (monedaDestino)
			  {
			    case 1: // soles.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*3.63;
					  break;
			    case 2: // pesos mex.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*17.16;
					  break;
			    case 4: // quetzales.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*7.84;
					  break;
			    default: // misma moneda local-destino.
			    	  cantidadMonedasFinal=cantidadMonedasInicio;
					  break;
			  } 
			  break;
			  
		  case 4:// quetzales a:
			  switch (monedaDestino)
			  {
			    case 1: // soles.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*0.46;
					  break;
			    case 2: // pesos mex.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*2.19;
					  break;
			    case 3: // dolares.
			    	  cantidadMonedasFinal=cantidadMonedasInicio*0.13;
					  break;
			    default: // misma moneda local-destino.
			    	  cantidadMonedasFinal=cantidadMonedasInicio;
					  break;
			  } 
			  break;
		
		}
		
		return cantidadMonedasFinal;
	}
	
	public String tipoMoneda(byte tipo)
	{		
		return strmonedas[tipo-1];
	}

}
