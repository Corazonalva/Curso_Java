package tareaDia17;

public class Main {

	public static void main(String[] args) {
		System.out.println("******** Tabla del 7 ********");
		for(int c=1;c<=10;c++){System.out.println(String.format("7 X %d = %d",c,c*7));}
		
		System.out.println("\n\n******** Números pares del 1 al 30 ********");
		for(int c=1;c<=30;c++){if((c%2)==0) {System.out.print(c+",");}}
			
		System.out.println("\n\n******** Suma de los primeros 100 números naturales ********");
		int suma=0;
		for(int c=1;c<=100;c++){suma+=c;}System.out.println(suma);
			

	}

}
