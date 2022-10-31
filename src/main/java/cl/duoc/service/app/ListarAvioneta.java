package cl.duoc.service.app;

import cl.duoc.models.Avioneta;
import cl.duoc.service.IListAvioneta;
import java.util.ArrayList;

public class ListarAvioneta implements IListAvioneta{
    private ArrayList<Avioneta> ListaAvioneta;
    
    public ListarAvioneta(){
        this.ListaAvioneta = new ArrayList();
    }
    
    @Override
    public void Listar(){
        System.out.println(ListaAvioneta);
    }
    
    @Override
    public void Listar(int indice){
        System.out.println(ListaAvioneta.get(indice));
    }
    
    @Override
    public void Guardar(Avioneta avioneta){
        ListaAvioneta.add(avioneta);
    }
    
    @Override
    public void Reemplazar(int indice,Avioneta avioneta){
        ListaAvioneta.set(indice, avioneta);
    }
    
    @Override
    public void Eliminar(int indice){
        ListaAvioneta.remove(indice);
    }
    
    @Override
    public void Eliminar(Avioneta avioneta){
        ListaAvioneta.remove(avioneta);
    }
}
