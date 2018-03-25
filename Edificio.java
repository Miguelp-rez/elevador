public class Edificio{
	private Departamento [][] pisos = new Departamento [6][4]; //Los pisos del edificio

	public Edificio(){
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				pisos[i][j] = new Departamento();	
			} 
		}
	}

	public void imprimeEdificio(){
		System.out.println("\tD1\tD2\tD3\tD4\n__________________________________");
		for (int i = 0; i < 6; i++) {
			System.out.print("Piso " + (i + 1) + "|");
			for (int j = 0; j < 4; j++)
				System.out.print("\t" + pisos[i][j].getNumPersonas());
		System.out.println("\n==================================");	
		}
	} 

}