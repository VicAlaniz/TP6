/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Cliente c1 = new Cliente(31542776, "Victoria", "Alaniz", "San Luis", "Cuchicorral 1821");
        Cliente c2 = new Cliente(23700745, "Diego", "Romero", "San Luis", "Solares 1104");
        Cliente c3 = new Cliente(27376476, "Juan", "Perez", "Villa Mercedes", "Mitre 1115");
        
        String tel1 = "2664552265";
        String tel2 = "2664298088";
        String tel3 = "2664515753";
        
        
        Directorio dir = new Directorio();
        
        if (dir.agregarCliente(tel3, c3)){
            JOptionPane.showMessageDialog(null, "Agregado");
        }
        if (dir.agregarCliente(tel2, c2)){
            JOptionPane.showMessageDialog(null, "Agregado");
        }
        if (dir.agregarCliente(tel1, c1)){
            JOptionPane.showMessageDialog(null, "Agregado");
        }
        
        dir.buscarCliente("2664552265");
        dir.agregarCliente(tel3, c3);
        dir.borrarCliente(23700745);
        
        
        
    }
    
}
