package cl.duoc.service.app;

import cl.duoc.models.Avioneta;

public interface IListAvioneta {
    
    public void MostrarTodo();
    
    public void Buscar(int indice);
    
    public void Guardar(Avioneta avioneta);
    
    public void Reemplazar(int indice,Avioneta avioneta);
    
    public void EliminarIndice(int indice);
    
    public void EliminarElemento(Avioneta avioneta);
}
