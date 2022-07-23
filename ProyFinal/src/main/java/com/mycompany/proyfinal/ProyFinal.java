package com.mycompany.proyfinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ProyFinal {
    
   
    
    public static void main(String[] args) {
                
        int opcion=-1;
        Scanner teclado= new Scanner(System.in);
        Scanner teclado1= new Scanner(System.in);
        List<Cliente> cl =new ArrayList<Cliente>();
        do {            
            System.out.println("1. Ingreso de clientes");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Borrar cliente");
            System.out.println("4. Modificar clientes");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero de Cliente: ");
                    int clnum= teclado.nextInt();
                    System.out.print("Ingrese el nombre del Cliente: ");
                    String clnom= teclado1.nextLine();
                    System.out.print("Ingrese el numero de Cliente: ");
                    int clnumTel= teclado.nextInt();
                    System.out.print("Ingrese el email del Cliente: ");
                    String clem= teclado1.nextLine();
                    cl.add(new Cliente(clnum,clnom,clnumTel,clem));
                    
                    break;
                case 2:
                    System.out.println("-------------------------------------------------");
                    Iterator<Cliente> i = cl.iterator();
                    while (i.hasNext()) {
                        Cliente c = i.next();
                        System.out.println(c.toString());
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 3:
                     
                    break;
                case 4:
                    
                    break;
                case 0:
                     
                    break;     
                 
                default:
                    throw new AssertionError();
            }
        } while (opcion !=0);

        
    }
    
}
