package cl.duoc.service;

import cl.duoc.models.Avioneta;

public interface IListAvioneta {
    
    public void Listar();
    
    public void Listar(int indice);
    
    public void Guardar(Avioneta avioneta);
    
    public void Reemplazar(int indice,Avioneta avioneta);
    
    public void Eliminar(int indice);
    
    public void Eliminar(Avioneta avioneta);
}
