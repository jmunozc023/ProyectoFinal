package com.mycompany.proyfinal;

import com.mycompany.model.Cliente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ProyFinal {
    
   
    
    public static void main(String[] args) {
        var cliente1=new Cliente();
        ArrayList<Cliente> arrayOfCliente=new ArrayList<>();
        cliente1.getNombre();
        cliente1.getTelefono();
        cliente1.getEmail();
        arrayOfCliente.add(cliente1);
        for (int i=0; i<arrayOfCliente.size();i++){
            System.out.println(arrayOfCliente.get(i));
            
        }
        
    }
    
}
