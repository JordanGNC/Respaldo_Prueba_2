package cl.duoc.models;

public class Avioneta extends VehiculoAereo{
    private boolean UltraSonico;
    
    public Avioneta(){
        this.UltraSonico = false;
    }
    
    public Avioneta(boolean UltraSonico) {
        this.UltraSonico = UltraSonico;
    }
    
    public boolean isUltraSonico() {
        return UltraSonico;
    }

    public void setUltraSonico(boolean UltraSonico) {
        this.UltraSonico = UltraSonico;
    }
    
}
