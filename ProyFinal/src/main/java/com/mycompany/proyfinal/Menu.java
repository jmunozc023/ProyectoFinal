package com.mycompany.proyfinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Crea el menu principal, aqui solo se llaman las clases principales
public class Menu {

    Scanner leer = new Scanner(System.in);
    Scanner leer1 = new Scanner(System.in);
    int opcion;
    String buscar;
    public List<Cliente> cl =new ArrayList<>();
    public List<Articulos> Inventario =new ArrayList<>();
   
   
    
    
    /*public void clientesBase(){
        cl.add(new Cliente(1001, "Jose Muñoz", 87026720, "jmunozc023@ulacit.ed.cr"));
        cl.add(new Cliente(1002, "Diana Rodriguez", 72845478, "drodriguezs298@ulacit.ed.cr"));
        cl.add(new Cliente(1003, "Julliam Salazar", 57124752, "jsalazarg423@ulacit.ed.cr"));
    }  */   
    public void opciones(){
        Funciones func= new Funciones();
          
        
        do {
            System.out.println("Menu de principal.");
            System.out.println("1. Mantenimiento de clientes");
            System.out.println("2. Mantenimiento de inventario");
            System.out.println("3. Facturacion");
            System.out.println("4. Cierre de caja");
            System.out.println("0. Salir");
            System.out.print("Seleccione la opcion que desea: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    func.Mant_clientes();
                    
                    break;
                case 2:
                    func.Mant_inventario();
                    
                    break;
                case 3:
                    List<Cliente> cl1 =new ArrayList<>();
                    System.out.println("-------------------------------------------------");
                    Iterator<Cliente> i = cl1.iterator();
                    while (i.hasNext()) {
                        Cliente c = i.next();
                        System.out.println(c.toString());
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 4:
                    
                    break;
            }
        } while (opcion !=0);
    }
    
}
