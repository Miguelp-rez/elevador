public class Elevador{
    private int numPersonas;
    private int pisoActual;

    public Elevador(){
        this.numPersonas = 0;       //Elevador vacío
        this.pisoActual = 1;        //Piso uno es planta baja
    }

    public void subePiso(int destino){  //Recibe el piso destino
        for(int i = this.pisoActual + 1; i <= destino; i++){
            System.out.println("Subiendo al piso " + i);
        }
        System.out.println("Ha llegado al piso " + destino);
        pisoActual = destino;
    }

    public void bajaPiso(int destino){  //Recibe el piso destino
        for(int i = this.pisoActual - 1 ; i >= destino; i--){
            System.out.println("Bajando al piso " + i);
        }
        System.out.println("Ha llegado al piso " + destino);
        pisoActual = destino;
    }

    public void subePersona(){  //Sube una persona
        this.numPersonas++;
    }

    public void bajaPersona(){  //Baja una persona
        this.numPersonas--;
    }

    public int getNumPersonas(){
        return this.numPersonas;
    }

    public int getPiso(){
        return this.pisoActual;
    }
}