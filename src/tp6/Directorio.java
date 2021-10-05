/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;


/**
 *
 * @author Administrador
 */
public class Directorio {
   
    private TreeMap <String, Cliente> clientes = new TreeMap<>();

    public TreeMap<String, Cliente> getClientes() {
        return clientes;
    }
  
    
    public boolean agregarCliente(String tel, Cliente c) {
        if (clientes.containsKey(tel)){
           return false;
       }
       else {
        clientes.put(tel, c);
        return true;
    }
    }
    
    public Cliente buscarCliente(String tel) {
        return clientes.get(tel);
    }
    
    public List<String> buscarTelefono(String apellido){
        ArrayList<String> listTelefono = new ArrayList<>();
        Set<String> telefono = clientes.keySet();
        for(String itera: telefono){
            Cliente c = clientes.get(itera);
            if (c.getApellido()==apellido) {
                listTelefono.add(itera);
            } 
        }
        return listTelefono;
    }
    
    public List<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> clientesXCiudad = new ArrayList<>();
        Set<String> telefono = clientes.keySet();
        for (String city : telefono) {
            Cliente c = clientes.get(city);
            if (c.getCiudad()==ciudad) {
                clientesXCiudad.add(clientes.get(ciudad));
            }
        }
        return clientesXCiudad;
    }
    
    public boolean borrarCliente(long dni) {
       TreeMap<String, Cliente> borrarXDni = new TreeMap<>();
        Set<String> claves = clientes.keySet();
       for(String clave:claves) {
        Cliente c = clientes.get(clave);
        if (c.getDni()==dni) {
            borrarXDni.put(clave, c);
            clientes.remove(clave);
            return true;
        }  
    }
       return false;
    }

    @Override
    public String toString() {
        return "Directorio{" + "clientes=" + clientes + '}';
    }
       

}