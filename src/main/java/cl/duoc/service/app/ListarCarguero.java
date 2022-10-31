package cl.duoc.service.app;

import cl.duoc.models.Carguero;
import cl.duoc.service.IListCarguero;
import java.util.ArrayList;

public class ListarCarguero implements IListCarguero{
    private ArrayList<Carguero> ListaCarguero;
    
    public ListarCarguero(){
        this.ListaCarguero = new ArrayList();
    }
    
    @Override
    public void Listar(){
        System.out.println(ListaCarguero);
    }
    
    @Override
    public void Listar(int indice){
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
    public void Eliminar(int indice){
        ListaCarguero.remove(indice);
    }
    
    @Override
    public void Eliminar(Carguero carguero){
        ListaCarguero.remove(carguero);
    }
}
