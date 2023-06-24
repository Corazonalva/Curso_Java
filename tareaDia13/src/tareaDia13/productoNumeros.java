package tareaDia13;

import java.util.Scanner;

public class productoNumeros {
	
	private int[] numeros= new int[3];
	private short posNum=0;
	
	private boolean validarNumero(String valor)
	{
	    try
	    {
	         numeros[posNum]=Integer.parseInt(valor);
	         return true;
	    }
	    catch (NumberFormatException ex) 
	    {
	         numeros[posNum]=0;
	         return false;
	    }
	}
	
	private void IngresarDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
		String sMensaje=""; 
		
		do
		{
			switch (posNum)
			{
			case 0:
				sMensaje="primer";
				break;
			
			case 1:
				sMensaje="segundo";
				break;
			case 2:
				sMensaje="tercer";
				break;				
			}
			
			System.out.println("Ingrese el "+ sMensaje +" número entero:");
			if(validarNumero(iEntrada.nextLine()))
			{
				posNum++;
			}
			else
			{
				System.out.println("\n\n\n\n\n\n"); 
				System.out.println("INGRESE SOLO NUMEROS ENTEROS...");
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();
				System.out.println("\n\n\n\n\n\n"); 
			}
			
			
			
		}while(posNum<numeros.length);
		
		iEntrada.close();
		System.out.println("\n\n\n\n\n\n"); 
		System.out.println("El producto de los números enteros "+
		                    numeros[0]+","+numeros[1]+","+numeros[2]+
                            " es igual a "+(numeros[0]*numeros[1]*numeros[2]));
	}
	
	public static void main(String[] args) {
        
        productoNumeros pdNumeros= new productoNumeros();
		pdNumeros.IngresarDatos();
	}

}
