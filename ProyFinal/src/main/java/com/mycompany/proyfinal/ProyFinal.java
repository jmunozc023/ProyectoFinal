package com.mycompany.proyfinal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
                    boolean found = false;
                    System.out.print("Digite el numero de cliente a eliminar: ");
                    int numcl=teclado.nextInt();
                    System.out.println("-------------------------------------------------");
                    i = cl.iterator();
                    while (i.hasNext()) {
                        Cliente c = i.next();
                        if(c.getClnumero()== numcl){
                            i.remove();
                            found= true;
                        }
                    }
                    if (!found){
                        System.out.println("El numero digitado no se encuentra.");
                    }else{
                        System.out.println("El cliente se ha borrado exitosamente");
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 4:
                    found = false;
                    System.out.print("Digite el numero de cliente a eliminar: ");
                    clnum=teclado.nextInt();
                    System.out.println("-------------------------------------------------");
                    ListIterator<Cliente> li= cl.listIterator();
                    while (li.hasNext()) {
                        Cliente c = li.next();
                        if(c.getClnumero()== clnum){
                            System.out.print("Ingrese el nuevo nombre de empleado: ");
                            clnom =teclado1.nextLine();
                            System.out.print("Ingrese el nuevo numero de Telefono del empleado: ");
                            clnumTel =teclado.nextInt();
                            System.out.print("Ingrese el nuevo Email del empleado: ");
                            clem =teclado1.nextLine();
                            li.set(new Cliente(clnum, clnom, clnumTel, clem));
                            found= true;
                        }
                    }
                    if (!found){
                        System.out.println("El numero digitado no se encuentra.");
                    }else{
                        System.out.println("El cliente se ha modificado exitosamente");
                    }
                    System.out.println("-------------------------------------------------");
                    
                    break;
              
            }
        } while (opcion !=0);

        
    }
    
}
