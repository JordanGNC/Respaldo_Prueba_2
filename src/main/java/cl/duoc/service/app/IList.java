package cl.duoc.service.app;

import cl.duoc.models.VehiculoAereo;

public interface IList {
    
    public void MostrarTodo();
    
    public void Buscar(int indice);
    
    public void Guardar(VehiculoAereo VA);
    
    public void Reemplazar(int indice,VehiculoAereo VA);
    
    public void EliminarIndice(int indice);
    
    public void EliminarElemento(VehiculoAereo VA);
}
