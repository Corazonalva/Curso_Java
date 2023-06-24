package tareaDia12;

import java.util.Scanner;

public class claseNombreEdad {
	
	private String nombre;
	private int edad;

	private void Saludar()
	{
		System.out.println("Hola "+nombre+" tu edad es de: "+edad+ " años.");
	}
	

	public static void main(String[] args) {
		claseNombreEdad clsPersona= new claseNombreEdad();
		Scanner iEntrada=new Scanner(System.in);
		
		System.out.println("Ingrese un nombre:");
		clsPersona.nombre=iEntrada.nextLine();
		System.out.println("Ingrese una edad:");
		clsPersona.edad=iEntrada.nextInt();
		clsPersona.Saludar();
		iEntrada.close();	

	}

}
