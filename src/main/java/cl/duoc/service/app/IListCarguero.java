package cl.duoc.service.app;

import cl.duoc.models.Carguero;

public interface IListCarguero {
    
    public void MostrarTodo();
    
    public void Buscar(int indice);
    
    public void Guardar(Carguero carguero);
    
    public void Reemplazar(int indice,Carguero carguero);
    
    public void EliminarIndice(int indice);
    
    public void EliminarElemento(Carguero carguero);
}
