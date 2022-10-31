package cl.duoc.service.app.Implements;

import cl.duoc.models.VehiculoAereo;
import cl.duoc.service.app.IList;
import java.util.ArrayList;

public class Listar implements IList{
    private ArrayList<VehiculoAereo> lista;
    
    public Listar(){
        this.lista = new ArrayList();
    }
    
    @Override
    public void MostrarTodo(){
        System.out.println(lista);
    }
    
    @Override
    public void Buscar(int indice){
        System.out.println(lista.get(indice));
    }
    
    @Override
    public void Guardar(VehiculoAereo VA){
        lista.add(VA);
    }
    
    @Override
    public void Reemplazar(int indice,VehiculoAereo VA){
        lista.set(indice, VA);
    }
    
    @Override
    public void EliminarIndice(int indice){
        lista.remove(indice);
    }
    
    @Override
    public void EliminarElemento(VehiculoAereo VA){
        lista.remove(VA);
    }
}
