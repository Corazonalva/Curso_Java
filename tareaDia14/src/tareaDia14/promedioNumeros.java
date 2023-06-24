package tareaDia14;

import java.util.Scanner;

public class promedioNumeros {
	private byte cantidadNumeros;
	private Double acumulado; 

	public promedioNumeros()
	{ 
		acumulado=0.00;
		ingresarDatos();
	}

	public void ingresarDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
		String keypad="";
		byte pos=0;
		boolean bandera=true;

		do
		{			
			System.out.println("Promedio [ "+calculaPromedio()+ " ] de "+cantidadNumeros+" número(s)" );
			System.out.println("Ingrese un número:\nIngrese = para terminar el programa");
			keypad=iEntrada.nextLine();
			keypad=keypad.replaceAll("\\s","");
			
			if(keypad.compareTo("=")==0) { return;	}

			if(validarNumeros(keypad,pos))
			{
				cantidadNumeros++;
			}
			else
			{				
				System.out.println("NUMERO NO VALIDO...");
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();  
			}				


		}while(bandera);
//		iEntrada.close();
//		System.out.println("******Fin del programa******");	 
	}

	public boolean validarNumeros(String valor,byte pos)
	{ 
		try 
		{
			acumulado=acumulado+Double.parseDouble(valor);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false; 
		} 
	}
	
	public double calculaPromedio()
	{
		if(cantidadNumeros>0)
		{
			return acumulado/cantidadNumeros;
		}
		else
		{
			return 0.00;
		}
	}
}
