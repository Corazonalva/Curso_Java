package tareaDia19;

public class MenuEat {
	private String[] menu;
	
	public String[] getMenu() {
		return menu;
	}

	public MenuEat()
	{
		menu=new String[]{"SOPA","TACOS","ARROZ","MOLE","TORTA"};
	}
	
	public String imprimeOpcion(int opcion)
	{
		return menu[opcion];
	}	
}
