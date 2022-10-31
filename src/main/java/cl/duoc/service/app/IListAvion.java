package cl.duoc.service.app;

import cl.duoc.models.Avion;

public interface IListAvion {
    
    public void MostrarTodo();
    
    public void Buscar(int indice);
    
    public void Guardar(Avion avion);
    
    public void Reemplazar(int indice,Avion avion);
    
    public void EliminarIndice(int indice);
    
    public void EliminarElemento(Avion avion);
}
