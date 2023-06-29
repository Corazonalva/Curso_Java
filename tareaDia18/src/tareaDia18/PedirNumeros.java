package tareaDia18;

import java.util.Scanner;

public class PedirNumeros {
	private int numero;
	
	public PedirNumeros()
	{
		numero=0;
		Scanner iEntrada=new Scanner(System.in);  
		while(numero>-5){			
			System.out.println("Ingresa un número entero: \n[número mayor a -5 para terminar]");
			if(iEntrada.hasNextInt())
			{
				numero=iEntrada.nextInt();
			}
			else
			{
				System.out.println("NUMERO NO VALIDO");	 
				iEntrada.nextLine();
				System.out.println("PRESIONE ENTER PARA CONTINUAR..."); 
				iEntrada.nextLine();
			}
		}
	}
}
