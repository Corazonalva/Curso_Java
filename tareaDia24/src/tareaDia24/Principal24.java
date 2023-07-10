package tareaDia24;
 
import java.util.Scanner; 

public class Principal24 {
	private static Scanner keyboard;
	private static CardGame juegoCartas;
	private static int turnoJugador;
	private static int numeroDeJugadores;
	private static int cartasPorJugadores;

	public static void main(String[] args) {
		juegoCartas=new CardGame(); 
		turnoJugador=0;
		numeroDeJugadores=3; 
		cartasPorJugadores=5;
		boolean closeOpcion=false; 

		juegoCartas.iniciarJuego(numeroDeJugadores,cartasPorJugadores);
		keyboard= new Scanner(System.in);
		do { 
			juegoCartas.datosJugador(0);
			juegoCartas.datosJugador(1);
			juegoCartas.datosJugador(2);
			
			juegoCartas.cartaEnJuego(); 
			turnos();
		 	closeOpcion=juegoCartas.finDelJuego();
						
		} while(!closeOpcion);
		keyboard.close(); 

	}
	
	private static void turnos()
	{
		byte tirarOpcion=1;  
		System.out.println("\n\t|-----------------------------------------|"); 
		tirarOpcion=tirar(String.format("%s    TIRAR?",juegoCartas.nombreJugador(turnoJugador)));
		juegoCartas.tiroJugador(turnoJugador,tirarOpcion,keyboard);
		turnoJugador++;
		if(turnoJugador>=numeroDeJugadores) {turnoJugador=0;}
	 	System.out.println("\n\n\n\n\n\n\n");
	 	System.out.println("\n\n\n\n\n\n");
	}
	

	
	private static void imprimeMSInfo(String msg)	
	{
		if(msg.equalsIgnoreCase(""))
		{System.out.println("\t< Dato no valido >");}
		else
		{System.out.println(String.format("\t< %s >",msg));}		
		System.out.println("\t< Presione ENTER para continuar >");
		keyboard.nextLine();
	}
	
	private static byte tirar(String msg)
	{
		
		String opcion="S";
		byte valor=0;
		do {
			System.out.print(String.format("\t    < %s >",msg));
			System.out.print("    < [S/N] >");
		 	System.out.print("\n\t|-----------------------------------------|");
			
			opcion=keyboard.nextLine(); 
			opcion=opcion.replaceAll("\\s*", "");
		    if(opcion.equalsIgnoreCase("S")) {valor=1;}else {
		    	if(opcion.equalsIgnoreCase("N")) {valor=0;}else {
		    		System.out.println("");
		    		imprimeMSInfo("Opción no valida");
			    }		    
		    }		    
		}while(!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")); 
		return valor;
	}
	
}
