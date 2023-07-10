package tareaDia24;
 
public class Card {
	private String palo;
	private int valor;

	public Card(String palo, int valor) { 
		this.palo = palo;
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "["+valor+" de "+palo+"]";
	}
	
	
}
