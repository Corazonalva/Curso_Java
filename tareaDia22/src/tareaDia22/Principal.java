package tareaDia22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	private static Scanner keyboard; 
	private static String palabra; 
	
	private static ArrayList<String> listaPalabras; 
	
	public static void main(String[] args) {
		  listaPalabras= new ArrayList<String>(); 
		  byte opcion=0;
		  byte closeOpcion=5; 

		  
		  keyboard= new Scanner(System.in);
		  do {
			  System.out.println("|-----------------------------------------|");
			  System.out.println("|       Ingresa el número de opción       |");
			  System.out.println("|-----------------------------------------|");
			  System.out.println("|1.- AGREGAR UNA PALABRA                  |");
			  System.out.println("|2.- IMPRIME LISTA DE PALABRAS            |");
			  System.out.println("|3.- ELIMINAR PALABRAS DUPLICADAS         |");
			  System.out.println("|-----------------------------------------|");
			  System.out.println("|4.- INGRESAR 5 NUMEROS ENTEROS           |");			  
			  System.out.println("|-----------------------------------------|");
			  System.out.println("|5.- SALIR...                             |");
			  System.out.println("|-----------------------------------------|");
			  if(keyboard.hasNextByte()){opcion=keyboard.nextByte();}else {opcion=(byte) (closeOpcion+1);}

			  switch (opcion) { 
			  case 1:
				  agregarPalabra();
				  break;
			  case 2: 
				  imprimeLista();
				  break;
			  case 3: 
				  borrarDuplicados();
				  break; 
			  case 4: 
				  ingresarNumeros();
				  break;
			  case 5 : 
				  System.out.println("\t<<< Fin del programa >>>");	
				  break;

			  default: 
				  System.out.println("Opción no valida");
				  System.out.println("< Presione ENTER para continuar >");
				  keyboard.nextLine();
				  break;
			  } 
		  } while(opcion!=closeOpcion);
		  keyboard.close();
	}
	
	
	public static void agregarPalabra()
	{
		System.out.println("|-----------------------------------------|");
		System.out.println("| [ AGREGAR PALABRA ]                     |");
		System.out.println("|-----------------------------------------|");
		System.out.println("");
		keyboard.nextLine();

		System.out.print("Ingrese una palabra: ");
		palabra=keyboard.nextLine();
		
		listaPalabras.add(palabra.toUpperCase());
		palabra=""; 
	}
		
	public static void imprimeLista()
	{
		System.out.println("");
		System.out.println("|-----------------------------------------|");
		System.out.println("| [ LISTA DE PALABRAS ]                   |");
		System.out.println("|-----------------------------------------|");
		System.out.println("");
		keyboard.nextLine();
		
		System.out.println(listaPalabras+"\n");

		System.out.println("< Presione ENTER para continuar >");
		keyboard.nextLine();		
	}
	
	private static void borrarDuplicados()
	{
	 	ArrayList<String> listaAux=new ArrayList<String>();
		for(String palabra:listaPalabras)
		{
			if(!listaAux.contains(palabra))				
			{
				listaAux.add(palabra);
			}
		}
		listaPalabras=listaAux;
		imprimeLista();
	}
 
	public static void ingresarNumeros()
	{
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		
		System.out.println("|-----------------------------------------|");
		System.out.println("| [ INGRESAR 5 NUMEROS ENTEROS            |");
		System.out.println("|-----------------------------------------|");
		System.out.println("");
		keyboard.nextLine();

		for(int c=0;c<5;c++)
		{
			System.out.print("Ingrese un número: ");
		    numeros.add(keyboard.nextInt());
		}
		
		numeros.sort((a, b) -> b - a);
		System.out.println("");
		System.out.println(numeros);
		keyboard.nextLine();
		System.out.println("< Presione ENTER para continuar >");
		keyboard.nextLine();
	}
	
}
