package tareaDia23;

import java.util.ArrayList;

public class Main {
	static ArrayList<Persona> personas;
	static ArrayList<Persona> resultado;
	static ArrayList<Integer> numeros;

	public static void main(String[] args) {
		ClaseGenerica<Persona> consulta = new ClaseGenerica<Persona>();
		ClaseGenericaNumeros<Integer> sumarNumeros = new ClaseGenericaNumeros<Integer>();
		
		personas = new ArrayList<Persona>();
		resultado = new ArrayList<Persona>();
		numeros = new ArrayList<Integer>();
		
		
		personas.add(new Persona("LUIS",23));
		personas.add(new Persona("JOSE",33));
		personas.add(new Persona("RAUL",13));
		personas.add(new Persona("OSCAR",18));
		personas.add(new Persona("PEDRO",80));
		personas.add(new Persona("MARIA",35));		
		
		resultado=consulta.buscar(personas, p->p.getEdad()>=30);
		
		for(Persona elemento:resultado) {
			System.out.println(elemento.getNombre());
		}
		
		System.out.println("--------------------");
		for(int c=1;c<=20;c++)
		{
			numeros.add(c);
		}
		System.out.println("\nEl promedio de los números es: "+sumarNumeros.sumar(numeros));

	}

}
