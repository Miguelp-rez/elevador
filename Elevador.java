public class Elevador{
    private int numPersonas;
    private int pisoActual;

    public Elevador(){
        this.numPersonas = 0;       //Elevador vacío
        this.pisoActual = 1;        //Piso uno es planta baja
    }

    public void subePiso(int destino){  //Recibe el piso destino
        for(int i = pisoActual; i <= destino; i++){
            System.out.println("Subiendo al piso " + i);
        }
        pisoActual = destino;
    }
    public void bajaPiso(int destino){  //Recibe el piso destino
        for(int i = pisoActual; i >= destino; i--){
            System.out.println("Bajando al piso " + i);
        }
        pisoActual = destino;
    }
    public void subePersona(){
        this.numPersonas++;
    }
    public void bajaPersona(){
        this.numPersonas--;
    }
    public int getNumPersonas(){
        return this.numPersonas;
    }
    public int getPiso(){
        return this.pisoActual;
    }
}