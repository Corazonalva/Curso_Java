package tareaDia16;

import java.util.Scanner;

public class AñoBisiesto {
	private int año;

	public int getAño() {
		return año;
	}
	
	public void ingresaDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
		boolean bandera=true;
		do {			
			System.out.println("Ingresa un año:");
			if(iEntrada.hasNextInt())
			{
				año=iEntrada.nextInt();
				bandera=false;
			}
			else
			{
				System.out.println("AÑO NO VALIDO");	 
				iEntrada.nextLine();
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();
			}
		} while(bandera);
	}
	
	public boolean verificaAño()
	{
		if (año % 4 == 0 && año % 100 != 0)
		{
            return true;
        } else 
        {
        	if(año % 400 == 0)
        	{
        		return true;        		
        	}
        	else
        	{
        		return false;
        	}            
        } 
	}

}
