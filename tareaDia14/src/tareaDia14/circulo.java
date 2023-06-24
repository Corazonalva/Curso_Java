package tareaDia14;

import java.util.Scanner;

public class circulo {
	private double radio;
	private double area;
	 
	public double getArea() {
		return area;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public circulo()
	{
		ingresarDatos();
	}
	
	public void ingresarDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
	 	String keypad="";
	 	boolean bandera=true;
		
		do
		{			
			System.out.println("Ingrese el RADIO del circulo: ");
			keypad=iEntrada.nextLine();
			keypad=keypad.replaceAll("\\s",""); 			
			
			if(validarNumeros(keypad))
			{
				System.out.println("el AREA del circulo es igual a "+(3.1416*getRadio()*getRadio())+ "cm2"); 
				bandera=false;
			}
			else
			{				
				System.out.println("NUMERO NO VALIDO...");
				System.out.println("PRESIONE ENTER PARA CONTINUAR...");
				iEntrada.nextLine();  
			}				
					
			
		}while(bandera); 
	}
	
	public boolean validarNumeros(String valor)
	{ 
		try 
		{
			setRadio(Double.parseDouble(valor));
			return true;
		}
		catch(NumberFormatException e)
		{
			return false; 
		} 
	}

}
