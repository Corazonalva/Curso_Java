package tareaDia19;

import java.util.Scanner;

public class Calculadora2 {
	private byte operacion;
	private double acumulado;
	
	public Calculadora2()
	{
		setOperacion((byte) 6);
	}
	
	public double getAcumulado() {
		return acumulado;
	}
	public void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
	}
	
	public byte getOperacion() {
		return operacion;
	}

	public void setOperacion(byte operacion) {
		this.operacion = operacion;
	}
	
	public boolean validarNumeros(String valor)
	{ 
		try 
		{
			//acumulado=Double.parseDouble(valor.replaceAll("\\s",""));
			//la expresión regular, \\s equivale a cualquier tipo de carácter "blanco", es decir, espacios, tabuladores y retornos.
			Double tmp=Double.parseDouble(valor);
			RealizaOperacion(tmp);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false; 
		} 
	}
	
	public boolean validarOperacion(String valor)
	{  
			if (valor.matches("[-+*/=]")) 
			{ 
				return true;
			} else
			{ 
				return false;
			}
	}
	
	public void RealizaOperacion(Double valor)
	{
		if(getAcumulado()==0.00) 
		{
			setAcumulado(valor);
		}
		else
		{
			switch (getOperacion())// 1=SUMA,2=RESTA,3=MULTIPLICACION,4=DIVISION,5=INGRESANDO OPERACION,6=INGRESANDO NUMEROS
			{
			case 1:setAcumulado(getAcumulado()+valor);break;
			case 2:setAcumulado(getAcumulado()-valor);break;
			case 3:setAcumulado(getAcumulado()*valor);break;
			case 4:setAcumulado(getAcumulado()/valor);break;
			}			
		}
	}
	
	public void ingresarDatos()
	{
		Scanner iEntrada=new Scanner(System.in);
	 	String keypad=""; 
		boolean bandera=true;
		display(' ');
	 
		do
		{			
			keypad=iEntrada.nextLine();
			keypad=keypad.replaceAll("\\s","");
			if(keypad.compareTo("=")==0  && getOperacion()==6) {return;	}
			
			if(getOperacion()!=5)
			{
				if(validarNumeros(keypad))
				{
					setOperacion((byte) 5);
					display(' ');
				}
				else
				{				
					System.out.println("NUMERO NO VALIDO...");
					System.out.println("PRESIONE ENTER PARA CONTINUAR...");
					iEntrada.nextLine(); 
					display(' ');
				}				
			}
			else
			{ 
				if(validarOperacion(keypad))
				{
					switch (keypad)
					{
					case "+":
						setOperacion((byte) 1);break;
					case "-":
						setOperacion((byte) 2);break;
					case "*":
						setOperacion((byte) 3);break;
					case "/":
						setOperacion((byte) 4);break;
					default:
						bandera=false;break;
					}
					display(keypad.charAt(0));
				}
				else
				{				
					System.out.println("OPERACION NO VALIDA...");
					System.out.println("PRESIONE ENTER PARA CONTINUAR...");
					iEntrada.nextLine(); 
					display(' ');
				}
			}
			
			
		}while(bandera);     
	}
	
	private void display(char charOp)
	{
		String sMensaje="";
		
		switch (getOperacion())// 1=SUMA,2=RESTA,3=MULTIPLICACION,4=DIVISION,5=INGRESANDO OPERACION,6=INGRESANDO NUMEROS
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 6:
			sMensaje="Ingrese un número:\nIngrese = para salir del programa";
			break;
		
		case 5:
			sMensaje="Ingrese una operación + - * /\nIngrese = para salir del programa";
			break;					
		}
		
		System.out.println("");
		System.out.println("|-----------------------------------------|");
		System.out.println("| [ CALCULADORA ]                         |");
		System.out.println("|-----------------------------------------|");
		System.out.println("");
		
		System.out.println("[ "+getAcumulado()+" ] "+charOp);
		System.out.println(sMensaje);
		
	}
	
	

}
