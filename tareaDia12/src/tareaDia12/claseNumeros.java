package tareaDia12;

import java.util.Scanner; 

public class claseNumeros { 
		
	private void CalculaNumMayor(int[] valores)
	{ 
		
		if (valores[0] == valores[1] || 
			valores[0] == valores[2] || 
			valores[1] == valores[2]) {
            System.out.println("Error: Los números ingresados deben ser diferentes.");
            return;
        }
		
		int i, j, aux;
	        for (i = 0; i < valores.length - 1; i++) {
	            for (j = 0; j < valores.length - i - 1; j++) {                                                              
	                if (valores[j + 1] < valores[j]) {
	                    aux = valores[j + 1];
	                    valores[j + 1] = valores[j];
	                    valores[j] = aux;
	                }
	            }
	        } 

	    System.out.println("El número mayor es: "+ valores[valores.length - 1]);    
	    System.out.println("El número menor es: "+ valores[0]);
	}
	
	public static void main(String[] args) {
		claseNumeros clsNumeros= new claseNumeros();
		Scanner iEntrada=new Scanner(System.in);
		int[] iValores= new int[3];
		 
		System.out.println("Ingrese el primer número:");
		iValores[0]=iEntrada.nextInt();
		System.out.println("Ingrese el segundo número:");
		iValores[1]=iEntrada.nextInt(); 
		System.out.println("Ingrese el tercer número:");
		iValores[2]=iEntrada.nextInt(); 
		
		clsNumeros.CalculaNumMayor(iValores);
		iEntrada.close();	
		 

	}

}
