package cl.duoc.models;

public class Pasajero {
    private int ID;
    private String Nombre;
    private String FechaNacimiento;
    private int Rut;
    private String Dv;
    private long Telefono;
    private String Email;
    private boolean Vetado;

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

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getRut() {
        return Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setRutyDv(int Run, char Dv) {
        if(this.validarRut(Run, Dv)){
            this.Rut = Run;
            this.Dv = Dv+"";
        }else{
            System.out.println("El rut ingresado no existe");
        }
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        if (Long.toString(Telefono).length()>=8){
            int num = 56;
            String cadenaResultante = String.valueOf(num) + String.valueOf(Telefono);
            long TelefonoMod = Long.parseLong(cadenaResultante);
            this.Telefono = TelefonoMod;
        }else{
            System.out.println("El numero de telefono no es valido");
        }
        
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@")){
            if(Email.contains(".cl")||Email.contains(".com")){
                this.Email = Email;
            }else{
                System.out.println("Email invalido (Asegurece que termine con .cl o .com)");
            }
            
    }else{
            System.out.println("Email invalido (Asegurece que contenga @)");
        }

    }

    public boolean isVetado() {
        return Vetado;
    }

    public void setVetado(boolean Vetado) {
        this.Vetado = Vetado;
    }
    
    public boolean validarRut(int Rut, char Dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; Rut != 0; Rut /= 10) {
                s = (s + Rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (Dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
                        
    }
       
}
