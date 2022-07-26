package com.mycompany.proyfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crea el menu principal, aqui solo se llaman las clases principales
public class Menu {
    Scanner leer = new Scanner(System.in);
    int opcion;
    public List<Cliente> cl =new ArrayList<>();
    public List<Articulos> Inventario =new ArrayList<>();
    
    /*public void clientesBase(){
        cl.add(new Cliente(1001, "Jose Muñoz", 87026720, "jmunozc023@ulacit.ed.cr"));
        cl.add(new Cliente(1002, "Diana Rodriguez", 72845478, "drodriguezs298@ulacit.ed.cr"));
        cl.add(new Cliente(1003, "Julliam Salazar", 57124752, "jsalazarg423@ulacit.ed.cr"));
    }  */   
    public void opciones(){
        Mant_clientes mancli = new Mant_clientes();
        Mant_inventario maninv = new Mant_inventario();
        
        
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
                    mancli.funcional();
                    
                    break;
                case 2:
                    //maninv.inventariobase();
                    maninv.funcion();
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
            }
        } while (opcion !=0);
    }
    
}
