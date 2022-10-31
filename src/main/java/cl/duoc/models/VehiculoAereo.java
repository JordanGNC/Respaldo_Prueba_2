package cl.duoc.models;

public class VehiculoAereo {
    private int ID;
    private String Nombre;
    private int HorasVoladas;
    private boolean ListoParaVolar;
    private String FechaUltimoVuelo;
    
    public VehiculoAereo(){
        this.ID = 0;
        this.Nombre = "";
        this.HorasVoladas = 0;
        this.ListoParaVolar = false;
        this.FechaUltimoVuelo = "";
    }
    
    public VehiculoAereo(int ID, String Nombre, int HorasVoladas, boolean ListoParaVolar, String FechaUltimoVuelo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.HorasVoladas = HorasVoladas;
        this.ListoParaVolar = ListoParaVolar;
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHorasVoladas() {
        return HorasVoladas;
    }

    public void setHorasVoladas(int HorasVoladas) {
        this.HorasVoladas = HorasVoladas;
    }

    public boolean isListoParaVolar() {
        return ListoParaVolar;
    }

    public void setListoParaVolar(boolean ListoParaVolar) {
        this.ListoParaVolar = ListoParaVolar;
    }

    public String getFechaUltimoVuelo() {
        return FechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(String FechaUltimoVuelo) {
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    }
    
    
}
