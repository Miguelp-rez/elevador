public class Controlador{
    Elevador elevador = new Elevador();

    public void cambiarPiso(int destino){
        if( destino < elevador.getPiso() ){
            elevador.bajaPiso(destino); 
        }else{
            elevador.subePiso(destino);
        }
    }
}