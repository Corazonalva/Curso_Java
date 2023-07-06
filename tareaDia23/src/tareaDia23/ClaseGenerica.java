package tareaDia23;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ClaseGenerica<T> {
	
	public ArrayList<T> buscar(ArrayList<T>datos, Predicate<T> filtro) {
		ArrayList<T> nuevosDatos= new ArrayList<T>();
		for(T elemento:datos)
		{
			if(filtro.test(elemento))
			{
				nuevosDatos.add(elemento); 
			}
		}
		return nuevosDatos;
	}

}
