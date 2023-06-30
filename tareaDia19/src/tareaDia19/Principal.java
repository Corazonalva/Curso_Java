package tareaDia19;

import java.util.Scanner; 
 
public class Principal {
	private static Scanner keyboard;
	private static int numero;

	public static void main(String[] args) {
		  byte opcion=0;
		  byte closeOpcion=4; 
		  
		  keyboard= new Scanner(System.in);
		  do {
			  System.out.println("|-----------------------------------------|");
			  System.out.println("|       Ingresa el número de opción       |");
			  System.out.println("|-----------------------------------------|");
			  System.out.println("|1.- CONVERTIR NUMERO A DIA DE LA SEMANA  |");
			  System.out.println("|2.- CALCULADORA                          |");
			  System.out.println("|3.- MENU 5 COMIDAS                       |");
			  System.out.println("|-----------------------------------------|");
			  System.out.println("|4.- SALIR...                             |");
			  System.out.println("|-----------------------------------------|");
			  if(keyboard.hasNextByte()){opcion=keyboard.nextByte();}else {opcion=(byte) (closeOpcion+1);}

			  switch (opcion) { 
			  case 1:
				  diaDelaSemana();
				  break;

			  case 2: 
				  Calculadora2 clsCalculadora=new Calculadora2();
		    	  clsCalculadora.ingresarDatos();  
				  break; 
			  case 3: 
				  menuComida(); 
				  break;
			  case 4 : 
				  System.out.println("\t<<< Fin del programa >>>");	
				  break;

			  default: 
				  imprimeMSG("Opción no valida");
				  break;
			  } 
		  } while(opcion!=closeOpcion);
		  keyboard.close();

	}
	
	private static void imprimeMSG(String msg)	
	{
		System.out.println(String.format("\t< %s >",msg));keyboard.nextLine();		
		System.out.println("\t< Presione ENTER para continuar >");
		keyboard.nextLine();
	}
	
	private static void diaDelaSemana()
	{		
		System.out.println("");
		System.out.println("|-----------------------------------------|");
		System.out.println("| [ CONVERTIR NUMERO A DIA DE LA SEMANA ] |");
		System.out.println("|-----------------------------------------|");
		System.out.println("");
		keyboard.nextLine();

		System.out.print("Ingrese un número [1-7]: "); 		
		numero=keyboard.nextInt();
		DiaSemana clsdiaSemana= new DiaSemana();
		imprimeMSG(clsdiaSemana.imprimeDia(numero));
	}
	
	private static void menuComida()
	{		
		

		MenuEat clsmenu= new MenuEat();
		byte opcion=0;
		byte closeOpcion=6; 		  
		keyboard= new Scanner(System.in);
		do {
			System.out.println("");
			System.out.println("|-----------------------------------------|");
			System.out.println("| [ MENU DE 5 COMIDAS ]                   |");
			System.out.println("|-----------------------------------------|");
			System.out.println("");
			
			System.out.println("|-----------------------------------------|");
			System.out.println("|       Ingresa el número de opción       |");
			System.out.println("|-----------------------------------------|");
			System.out.println(String.format("|1.- %s                                 |", clsmenu.getMenu()[0]));
			System.out.println(String.format("|2.- %s                                |", clsmenu.getMenu()[1]));
			System.out.println(String.format("|3.- %s                                |", clsmenu.getMenu()[2]));
			System.out.println(String.format("|4.- %s                                 |", clsmenu.getMenu()[3]));
			System.out.println(String.format("|5.- %s                                |", clsmenu.getMenu()[4]));
			System.out.println("|-----------------------------------------|");
			System.out.println("|6.- SALIR...                             |");
			System.out.println("|-----------------------------------------|");
			if(keyboard.hasNextByte()){opcion=keyboard.nextByte();}else {opcion=(byte) (closeOpcion+1);}

			switch (opcion) { 
			case 1:
				imprimeMSG(clsmenu.getMenu()[0]);
				break;

			case 2: 
				imprimeMSG(clsmenu.getMenu()[1]); 
				break; 
			case 3: 
				imprimeMSG(clsmenu.getMenu()[2]); 
				break;
			case 4 : 
				imprimeMSG(clsmenu.getMenu()[3]);
				break;
			case 5 : 
				imprimeMSG(clsmenu.getMenu()[4]);
				break;
			case 6 : 
				break;
				
			default: 
				imprimeMSG("Opción no valida");
				break;
			} 
		} while(opcion!=closeOpcion); 
	}

}
