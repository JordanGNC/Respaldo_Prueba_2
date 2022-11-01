package cl.duoc.models;

public class Carguero extends VehiculoAereo{
    private int Tonelaje;

    public Carguero(){
        this.Tonelaje = 0;
    }
    
    public Carguero(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }
    

    public int getTonelaje() {
        return Tonelaje;
    }

    public void setTonelaje(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }
    
}
