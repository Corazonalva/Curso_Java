package tareaDia24;

import java.util.ArrayList;
import java.util.List;

public class Jugadores {
	private String nombre;
	private List<Card> cartas;
	private int puntuacion;
	
	public List<Card> getCartas() {
		return cartas;
	}
	public void setCarta(Card carta,boolean agregar) {
		if(agregar) {this.cartas.add(carta);}
		else {this.cartas.remove(carta);}
		
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion =this.puntuacion + puntuacion;
		if(this.puntuacion<0)
		{
			this.puntuacion=0;
		}
	}
	public String getNombre() {
		return nombre;
	}
	
	public Jugadores(String nombre,int puntuacion) { 
		this.cartas= new ArrayList<Card>();
		this.nombre = nombre; 
		this.puntuacion = puntuacion;
	}


}
