/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author magus919
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap<String, Cliente> directorio=new TreeMap<>();
        
        Cliente c1=new Cliente(12312,"asd","sadasd","sdasd","asdas");
        Cliente c2=new Cliente(12444,"asd","sadasd","hdf","fhs");
        Cliente c3=new Cliente(12124,"assdfd","sgsgsd","df","jdfj");
        
        String t1=new String("123123");
        String t2=new String("32423");
        
        Set<String> clave = directorio.keySet();
        Iterator<String> it = clave.iterator();

        Iterator<String> itl = clave.iterator();
        while(itl.hasNext()){
            System.out.println(directorio.get(itl.next()));
        }
        
        System.out.println();
       Directorio dire=new Directorio();
        
        if(dire.agregarCliente(t1, c1)){
            JOptionPane.showMessageDialog(null, "Agregado");
            System.out.println(dire.buscarCliente(t1));
        }
        if(dire.agregarCliente(t2, c2)){
            JOptionPane.showMessageDialog(null, "Agregado");
            System.out.println(dire.buscarCliente(t2));
        }
        if(dire.agregarCliente(t1, c3)){
            JOptionPane.showMessageDialog(null, "Agregado");
            System.out.println(dire.buscarCliente(t1));
        }else{
            JOptionPane.showMessageDialog(null, "Ocupado");
            System.out.println("ERROR");
        }
        System.out.println(dire.buscarCliente(t2));
        dire.borrarCliente(12444);
        System.out.println(dire.buscarCliente(t2));
    }
    
    
    }

