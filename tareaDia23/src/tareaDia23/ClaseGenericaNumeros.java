package tareaDia23;

import java.util.ArrayList;

public class ClaseGenericaNumeros <T> {
	
	public <T extends Number> double sumar(ArrayList<T> datos)
	{
		double resultado=0;
		resultado=datos.stream()
                       .mapToDouble(Number::doubleValue)
                       .sum();
		resultado/=datos.size();
		return resultado;
	}

}
