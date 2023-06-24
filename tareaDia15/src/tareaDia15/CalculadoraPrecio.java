package tareaDia15;

import java.util.Scanner;

public class CalculadoraPrecio {
	private double precio,descuento,total;
	
	public double getDescuento() {
		return descuento;
	}
	public double getTotal() {
		return total;
	}
	

	public void ingresaDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
		boolean bandera=true;
		do {			
			System.out.println("Ingresa el precio del producto:");
			if(iEntrada.hasNextDouble())
			{
				precio=iEntrada.nextDouble();
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
	}
	
	public void calculaDescuento()
	{
		precio+=precio*.16;
		if(precio>50.00)
		{
			descuento=precio*0.10;
		}
		else
		{
			descuento=precio*0.05;
		}
		total=precio-descuento;		
	}

	

}
