package cl.duoc.models;

public class Avion extends VehiculoAereo{
    private String DatosExtras;

    public Avion(){
        this.DatosExtras = "";
    }
    
    public Avion(String DatosExtras){
        this.DatosExtras = "";
    }

    public String getDatosExtras() {
        return DatosExtras;
    }

    public void setDatosExtras(String DatosExtras) {
        this.DatosExtras = DatosExtras;
    }
    
    
}
