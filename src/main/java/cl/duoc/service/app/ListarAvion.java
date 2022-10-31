package cl.duoc.service.app;

import cl.duoc.models.Avion;
import cl.duoc.service.IListAvion;
import java.util.ArrayList;

public class ListarAvion implements IListAvion{
    private ArrayList<Avion> ListaAvion;
    
    public ListarAvion(){
        this.ListaAvion = new ArrayList();
    }
        
    @Override
    public void Listar(){
        System.out.println(ListaAvion);
    }
    
    @Override
    public void Listar(int indice){
        System.out.println(ListaAvion.get(indice));
    }
    
    @Override
    public void Guardar(Avion avion){
        ListaAvion.add(avion);
    }
    
    @Override
    public void Reemplazar(int indice,Avion avion){
        ListaAvion.set(indice, avion);
    }
    
    @Override
    public void Eliminar(int indice){
        ListaAvion.remove(indice);
    }
    
    @Override
    public void Eliminar(Avion avion){
        ListaAvion.remove(avion);
    }
}
