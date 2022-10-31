package cl.duoc.service.app.Implements;

import cl.duoc.models.Carguero;
import cl.duoc.service.app.IListCarguero;
import java.util.ArrayList;

public class ListarCarguero implements IListCarguero{
    private ArrayList<Carguero> ListaCarguero;
    
    public ListarCarguero(){
        this.ListaCarguero = new ArrayList();
    }
    
    @Override
    public void MostrarTodo(){
        System.out.println(ListaCarguero);
    }
    
    @Override
    public void Buscar(int indice){
        System.out.println(ListaCarguero.get(indice));
    }
    
    @Override
    public void Guardar(Carguero carguero){
        ListaCarguero.add(carguero);
    }
    
    @Override
    public void Reemplazar(int indice,Carguero carguero){
        ListaCarguero.set(indice, carguero);
    }
    
    @Override
    public void EliminarIndice(int indice){
        ListaCarguero.remove(indice);
    }
    
    @Override
    public void EliminarElemento(Carguero carguero){
        ListaCarguero.remove(carguero);
    }
}
