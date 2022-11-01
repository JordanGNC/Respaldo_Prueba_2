package cl.duoc.service;

import cl.duoc.models.VehiculoAereo;

public interface IList {
    
    public void Listar();
    
    public void Listar(int indice);
    
    public void Guardar(VehiculoAereo VA);
    
    public void Reemplazar(int indice,VehiculoAereo VA);
    
    public void Eliminar(int indice);
    
    public void Eliminar(VehiculoAereo VA);
}