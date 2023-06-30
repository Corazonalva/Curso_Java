package tareaDia19;

public class DiaSemana { 
	
	public String imprimeDia(int dia)
	{
		String msg="";
		switch(dia)
		{
		  case 1:
			  msg="LUNES";break;
		  case 2:
			  msg="MARTES";break;
		  case 3:
			  msg="MIERCOLES";break;
		  case 4:
			  msg="JUEVES";break;
		  case 5:
			  msg="VIERNES";break;
		  case 6:
			  msg="SABADO";break;
		  case 7:
			  msg="DOMINGO";break;
		  default:
			  msg="DIA NO VALIDO";break;
		
		}
		return msg;
	}

}
