/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author magus919
 */
public class Directorio {
    private TreeMap<String, Cliente> directorio= new TreeMap<>();
    
    
    public boolean agregarCliente(String telefono, Cliente cliente){
        if(directorio.containsKey(telefono)){
            return false;
        }else{
            directorio.put(telefono, cliente);
            return true;
        }
    }
    public Cliente buscarCliente(String telefono){
        return directorio.get(telefono);
    }
    
    public ArrayList<String> buscarTelefono(String apellido){
        
        ArrayList<String> numero=new ArrayList<>();
        Set<String> claves = directorio.keySet();
        
        for(String clave:claves){
            Cliente c=directorio.get(clave);
            
            if(c.getApellido().equals(apellido)){
                numero.add(clave);
            }
        }
        return numero;
    }
    public ArrayList<String> buscarClientes(String ciudad){
      ArrayList<String> ciudades=new ArrayList<>();
        Set<String> claves = directorio.keySet();
        
        for(String clave:claves){
            Cliente c=directorio.get(clave);
            
            if(c.getCiudad().equals(ciudad)){
                ciudades.add(clave);
            }
        }
        return ciudades;
    }
    public TreeMap<String,Cliente> borrarCliente(long dni){
        
        TreeMap<String, Cliente> listaBorrada=new TreeMap<>();
        
        Set<String> claves = directorio.keySet();
        
        for(String clave:claves){
            
            Cliente c=directorio.get(clave);
            
            if(c.getDni()==dni){
                listaBorrada.put(clave, c);
                directorio.remove(clave);
                return listaBorrada;
            }
        }
        return null;
    }
    public TreeMap<String, Cliente> getLista() {
        return directorio;
    }
    
    @Override
    public String toString() {
        return "Directorio{" + "directorio=" + directorio + '}';
    }

    
   
}
