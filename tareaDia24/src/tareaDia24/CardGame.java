package tareaDia24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set; 

public class CardGame {
	private Set<Card> mazoCartas;
	private List<Card> tmpMazoCartas;
	private String[] tipoCard;
    private List<Jugadores> jugadores;
	private int numeroJugadores;
	private int cartasPorJugadores;
	private Card cartaEnJuego;
	
	public CardGame() 
	{
		mazoCartas = new HashSet<>(); 
		jugadores= new ArrayList<Jugadores>();				
		tipoCard=new String[]{"Bastos","Espadas","Copas","Oros","XD"}; 
		llenarMazo();
	}
	
	public void llenarMazo()
	{		
		for(int c=1;c<=12;c++) {mazoCartas.add(new Card(tipoCard[0],c));}// llenamos las 12 cartas de bastos
		mazoCartas.add(new Card("XD",10));                              // agrego un booster 
		for(int c=1;c<=12;c++) {mazoCartas.add(new Card(tipoCard[1],c));}// llenamos las 12 cartas de espadas
		mazoCartas.add(new Card("XD",15));                              // agrego un booster  
		for(int c=1;c<=12;c++) {mazoCartas.add(new Card(tipoCard[2],c));}// llenamos las 12 cartas de copas
		mazoCartas.add(new Card("XD",20));                              // agrego un booster  
		for(int c=1;c<=12;c++) {mazoCartas.add(new Card(tipoCard[3],c));}// llenamos las 12 cartas de oros 
		mazoCartas.add(new Card("XD",25));                              // agrego un booster  
	}
	
	public void iniciarJuego(int numeroJugadores,int cartasPorJugadores)
	{ 
		this.numeroJugadores=numeroJugadores;
		this.cartasPorJugadores=cartasPorJugadores;
		repartirCartas();
	}

	public void repartirCartas() {
		tmpMazoCartas = new ArrayList<>(mazoCartas);
		Collections.shuffle(tmpMazoCartas); 
		
		for(int c=0;c<numeroJugadores;c++)
		{
			jugadores.add(new Jugadores("JUGADOR "+(c+1),0));
			for(int d=1;d<=cartasPorJugadores;d++)
			{
				if(d%2==0)
				{
					jugadores.get(c).setCarta(tmpMazoCartas.get(0),true);
					jugadores.get(c).setPuntuacion(tmpMazoCartas.get(0).getValor());
					tmpMazoCartas.remove(0);
				}
				else
				{
					jugadores.get(c).setCarta(tmpMazoCartas.get(tmpMazoCartas.size()-1),true);
					jugadores.get(c).setPuntuacion(tmpMazoCartas.get(tmpMazoCartas.size()-1).getValor());
					tmpMazoCartas.remove(tmpMazoCartas.size()-1);
				}
			}
		}
	}
	
	
	public void cartaEnJuego()
	{
		if(tmpMazoCartas.size()>0)
		{
			cartaEnJuego=tmpMazoCartas.get(0);
			tmpMazoCartas.remove(0);					
		} 
		System.out.println("\n\n\t|-----------------------------------------|");
		System.out.println("\t|          [ CARTA EN JUEGO ]             |");
		System.out.println("                                           ");
		System.out.println(String.format("\t              [  %s  ]",cartaEnJuego.getPalo()));
		System.out.println("                                           "); 
		System.out.println("\t|-----------------------------------------|");			
	
	}
	
	public void tiroJugador(int njugador,byte tirar,Scanner keyboard){ 
		
		boolean bandera=true;		
		if(tmpMazoCartas.size()<=0)
		{
			bandera=false;
			tirar=1;
		}
		
		if(tirar==1)
		{
			for(Card carta:jugadores.get(njugador).getCartas())
			{
				if(cartaEnJuego.getPalo()==carta.getPalo())
				{
					jugadores.get(njugador).setPuntuacion(-carta.getValor());
					jugadores.get(njugador).setCarta(carta, false);
					bandera=false;
					break;
				}
			}


			if(bandera)
			{
				Card cartaMazo= new Card("",0);
				List<Card> masCartas= new ArrayList<Card>();
				byte top=1;
				for(int c=0;c<=tmpMazoCartas.size();c++)
				{ 
					if(top==1)
					{
					   // System.out.println(tmpMazoCartas.toString());
						cartaMazo=tmpMazoCartas.get(0);
						//System.out.println("\t< Carta actual 0>\n< "+cartaMazo+" >");
						tmpMazoCartas.remove(0);
						top=0;
						//System.out.println(tmpMazoCartas.toString());
					}
					else
					{
						//System.out.println(tmpMazoCartas.toString());
						cartaMazo=tmpMazoCartas.get(tmpMazoCartas.size()-1);
						//System.out.println("\t< Carta actual n-1>\n< "+cartaMazo+" >");
						tmpMazoCartas.remove(tmpMazoCartas.size()-1);
						top=1;
						//System.out.println(tmpMazoCartas.toString());
					}
					
					if(cartaEnJuego.getPalo()==cartaMazo.getPalo())
					{
						jugadores.get(njugador).setPuntuacion(-cartaMazo.getValor());
						break;
					}
					
					//System.out.println("\t< Carta agregada al jugador >\n< "+cartaMazo+" >");
					masCartas.add(cartaMazo);
					jugadores.get(njugador).setCarta(cartaMazo,true);
					jugadores.get(njugador).setPuntuacion(cartaMazo.getValor());					
					c=0; 
				}  
				
				System.out.println("\n\tCarta obtenidas:");
				System.out.println("\n\t< Sumaran puntos: > "+masCartas); 
				System.out.println("\n\t< Restara puntos: > "+cartaMazo);
				System.out.println("\n\t< Presione ENTER para continuar >"); 
				keyboard.nextLine();
				
			} 

		}
		else
		{
			jugadores.get(njugador).setCarta(tmpMazoCartas.get(0),true);
			jugadores.get(njugador).setPuntuacion(tmpMazoCartas.get(0).getValor());
			tmpMazoCartas.remove(0);
		}		
	}
	
	public boolean finDelJuego()
	{
		boolean bandera=false;
		if(tmpMazoCartas.size()<=0)
		{
			System.out.println("\n\t < Fin del juego.... >< Sin cartas para repartir..."); 
			ganador();
			bandera=true;
		}
		else
		{
			bandera=verificaJugadores();
		}
		return bandera;
	}
	
	public void ganador()
	{
		int jugadorSinCartas=-1;
		for(int c=0;c<numeroJugadores;c++)
		{
			datosJugador(c);
			if(jugadores.get(c).getCartas().size()==0)
			{
				jugadorSinCartas=c;
			}
		}
		
		if(jugadorSinCartas>=0) {
			System.out.println("<"+jugadores.get(jugadorSinCartas).getNombre()+"> ha ganado por quedarse sin cartas...");			
		}
		else{
			Jugadores jugadorGanador=jugadores.stream()
					.min(Comparator.comparingInt(Jugadores::getPuntuacion))
					.get();
			System.out.println("<"+jugadorGanador.getNombre()+"> ha ganado con la menor puntuación...");			
		}
		
	}
	
	public boolean verificaJugadores()
	{
		int jugadorSinCartas=-1;
		for(int c=0;c<numeroJugadores;c++)
		{			
			if(jugadores.get(c).getCartas().size()==0)
			{
				jugadorSinCartas=c;
			}
		}
		
		if(jugadorSinCartas>=0) {
			System.out.println("\n\t < Fin del juego.... >");
			for(int c=0;c<numeroJugadores;c++) {datosJugador(c);}
			System.out.println("<"+jugadores.get(jugadorSinCartas).getNombre()+"> ha ganado por quedarse sin cartas...");
			return true;
		}
		else{
			Jugadores jugadorGanador=jugadores.stream()
					.min(Comparator.comparingInt(Jugadores::getPuntuacion))
					.get();

			if(jugadorGanador.getPuntuacion()==0)
			{	
				System.out.println("\n\t < Fin del juego.... >");
				for(int c=0;c<numeroJugadores;c++) {datosJugador(c);}
				System.out.println("<"+jugadorGanador.getNombre()+"> ha ganado con la menor puntuación...");
				return true;
			}
		}
		return false;
	}
	
// --------------  sección impresiones de datos en pantalla  -----------------------------
	
	public void puntuacion()
	{
		System.out.println(String.format("| PUNTUACION    J1[%d]   J2[%d]   J3[%d]  |",
				                  jugadores.get(0).getPuntuacion(),jugadores.get(1).getPuntuacion(),
				                  jugadores.get(2).getPuntuacion()));
	}
	
	public void datosJugador(int njugador) {
		System.out.println(String.format("%s:  PUNTOS[ %d ]",jugadores.get(njugador).getNombre(),jugadores.get(njugador).getPuntuacion()));
		System.out.println(String.format("%s:\n",jugadores.get(njugador).getCartas()));
	}	
	
	public String nombreJugador(int njugador) {
		return jugadores.get(njugador).getNombre();
	}	
	
	@Override
	public String toString() {
		return tmpMazoCartas+"";
	}
 
	
}
