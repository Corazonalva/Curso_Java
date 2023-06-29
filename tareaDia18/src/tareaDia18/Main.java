package tareaDia18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		Scanner iEntrada=new Scanner(System.in);  

		
		// pedir número hasta ingresa un número mayor a -5
		System.out.println("******** PROGRAMA 1 ********\n");
		PedirNumeros clsPedirNumeros= new PedirNumeros();
		System.out.println("\n");
		
		System.out.println("******** PROGRAMA 2 ********\n");
		System.out.println("Ingresa un número, para calcular\nla suma de sus digitos:");
		numero=iEntrada.nextInt();
		sumaDigitos clssumaDigitos=new sumaDigitos();
		System.out.println("La suma de los digitos es:"+clssumaDigitos.suma(numero)); 		
		System.out.println("\n");
		
		System.out.println("******** PROGRAMA 3 ********\n");
		System.out.println("Ingresa un número, para calcular\nsu factorial:");
		numero=iEntrada.nextInt();		
		Factorial clsfactorial= new Factorial(numero);
		clsfactorial.calculaFactorial();
		System.out.println("\n");
		
		 

	}

}
