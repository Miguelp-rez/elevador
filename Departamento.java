public class Departamento{
	private int numPersonas; //Numero de personas por departamento
	
	public Departamento(){//Constructor de Departamento
		numPersonas = (int) (Math.random() * 4 ) + 1; //Llenamos el departamento aleatoriamente de 1 a 4 personas
	}

	public int getNumPersonas(){ //Regreamos el numero de peronas que viven en el departamento
		return this.numPersonas;
	}
}