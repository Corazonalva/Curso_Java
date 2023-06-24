package tareaDia15;

import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		 ConversionMonedas clsconvMonedas= new ConversionMonedas();
		 clsconvMonedas.seleccionaMoneda();
		 System.out.println("****************");
		 System.out.println(clsconvMonedas.getCantidadMonedasInicio()+" "+
		                    clsconvMonedas.tipoMoneda(clsconvMonedas.getMonedaLocal())+
				            "\nequivalen a \n"+clsconvMonedas.convertirMoneda()+           
				            " "+clsconvMonedas.tipoMoneda(clsconvMonedas.getMonedaDestino()));
		 
		 System.out.println("****************");
		 System.out.println("****************");
		 CalculadoraPrecio calc=new CalculadoraPrecio();
		 calc.ingresaDatos();
		 calc.calculaDescuento();
		 System.out.println("el producto tiene un descuento de: "+calc.getDescuento());
		 System.out.println("\ncon un precio final de: "+calc.getTotal());
		 
	}

}
