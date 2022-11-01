package cl.duoc.models;

import java.time.LocalDate;

public class Avion extends VehiculoAereo{
    private String DatosExtras;

    public Avion(){
        this.DatosExtras = "";
    }

    public Avion(String DatosExtras) {
        this.DatosExtras = DatosExtras;
    }   

    public Avion(String Nombre, int HorasVoladas, boolean ListoParaVolar, LocalDate FechaUltimoVuelo, String DatosExtras) {
        super.setNombre(Nombre);
        super.setHorasVoladas(HorasVoladas);
        super.setListoParaVolar(ListoParaVolar);
        super.setFechaUltimoVuelo(FechaUltimoVuelo);
        this.DatosExtras = DatosExtras;
    }
    
    

    public String getDatosExtras() {
        return DatosExtras;
    }

    public void setDatosExtras(String DatosExtras) {
        this.DatosExtras = DatosExtras;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getNombre());
        sb.append(", #100, ultimo vuelo: ");
        sb.append(this.FechaUltimoVuelo.getDayOfMonth());
        sb.append("/0");
        sb.append(this.FechaUltimoVuelo.getMonthValue());
        sb.append("/");
        sb.append(this.FechaUltimoVuelo.getYear());
        sb.append(", total de horas: ");
        sb.append(super.getHorasVoladas());
        sb.append(", ");
        sb.append(this.DatosExtras);
        return sb.toString();
    }
}
    

