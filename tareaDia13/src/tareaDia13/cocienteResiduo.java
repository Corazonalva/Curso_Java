package tareaDia13;

import java.util.Scanner;

public class cocienteResiduo {

	private int numero1;
	private int numero2;
	
	public cocienteResiduo(int numero1,int numero2)
	{
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public void imprimeResultado()
	{
 
		System.out.println(String.format("La división entre %d y %d tiene como resultado:",numero1,numero2));
		System.out.println(String.format("un COCIENTE de: %d",numero1/numero2));
		System.out.println(String.format("un RESIDUO de:  %d ",numero1%numero2));
		System.out.println(String.format( "una RESPUESTA REAL de: %f",(float)numero1/(float)numero2 ));
		 
	}
	
	public cocienteResiduo()
	{
		Scanner iEntrada=new Scanner(System.in);
		
		System.out.println("Ingrese el primer número:");
		numero1=iEntrada.nextInt();
		System.out.println("Ingrese el segundo número:");
		numero2=iEntrada.nextInt(); 
		iEntrada.close();	
	}
	
	public static void main(String[] args) {
		 //cocienteResiduo operacion= new cocienteResiduo(17,3);
		 cocienteResiduo operacion= new cocienteResiduo();
		 operacion.imprimeResultado();
	}

}
