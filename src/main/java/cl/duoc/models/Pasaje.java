package cl.duoc.models;

public class Pasaje {
     private int ID;
     private Pasajero Pasajero;
     private String Fecha;
     private String CodigoVuelo;
     private int Valor;
     private VehiculoAereo VehiculoAereo;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Pasajero getPasajero() {
        return Pasajero;
    }

    public void setPasajero(Pasajero Pasajero) {
        this.Pasajero = Pasajero;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCodigoVuelo() {
        return CodigoVuelo;
    }

    public void setCodigoVuelo(String CodigoVuelo) {
        this.CodigoVuelo = CodigoVuelo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public VehiculoAereo getVehiculoAereo() {
        return VehiculoAereo;
    }

    public void setVehiculoAereo(VehiculoAereo VehiculoAereo) {
        this.VehiculoAereo = VehiculoAereo;
    }
          
}
