
package com.mycompany.proyfinal;
//En esta clase se declara el nuevo menu de Mantenimiento de clientes junto con toda la funcionalidad
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Funciones {
        int opcion=-1;
        Scanner teclado= new Scanner(System.in);
        Scanner teclado1= new Scanner(System.in);
        Scanner teclado2= new Scanner(System.in);
        Scanner teclado3= new Scanner(System.in);
        Menu men=new Menu();
        
        public void Mant_clientes(){
        
        
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
                    System.out.print("Ingrese el numero telefonico del Cliente: ");
                    int clnumTel= teclado.nextInt();
                    System.out.print("Ingrese el email del Cliente: ");
                    String clem= teclado1.nextLine();
                    men.cl.add(new Cliente(clnum,clnom,clnumTel,clem));
                    
                    break;
                case 2:
                    System.out.println("-------------------------------------------------");
                    Iterator<Cliente> i = men.cl.iterator();
                    while (i.hasNext()) {
                        Cliente c = i.next();
                        System.out.println(c.toString());
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Digite el Nombre del cliente a eliminar: ");
                    String nomcl=teclado1.nextLine();
                    System.out.println("-------------------------------------------------");
                    i = men.cl.iterator();
                    while (i.hasNext()) {
                        Cliente c = i.next();
                        if(c.clnombre.equals(nomcl)){
                            i.remove();
                            found= true;
                        }
                    }
                    if (!found){
                        System.out.println("El Nombre digitado no se encuentra.");
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
                    ListIterator<Cliente> li= men.cl.listIterator();
                    while (li.hasNext()) {
                        Cliente c = li.next();
                        if(c.getClnumero()== clnum){
                            System.out.print("Ingrese el nuevo nombre de Cliente: ");
                            clnom =teclado1.nextLine();
                            System.out.print("Ingrese el nuevo numero de Telefono del Cliente: ");
                            clnumTel =teclado.nextInt();
                            System.out.print("Ingrese el nuevo Email del Cliente: ");
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
        public void Mant_inventario(){
        
        
        do {            
            System.out.println("Menu de inventario.");
            System.out.println("1. Mostrar inventario disponible");
            System.out.println("2. Agregar articulo");
            System.out.println("3. Eliminar articulo");
            System.out.println("4. Modificar articulo");
            System.out.println("0. Salir");
            System.out.print("Seleccione la opcion que desea: ");
            opcion = teclado2.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-------------------------------------------------");
                    Iterator<Articulos> x = men.Inventario.iterator();
                    while (x.hasNext()) {
                        Articulos c = x.next();
                        System.out.println(c.toString());
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 2:
                    System.out.print("Ingrese el numero de posicion: ");
                    int invidx= teclado2.nextInt();
                    System.out.print("Ingrese el nombre del articulo: ");
                    String invnom= teclado1.nextLine();
                    System.out.print("Ingrese la cantidad disponible: ");
                    int invcant= teclado3.nextInt();
                    System.out.print("Ingrese el precio: ");
                    int invprec= teclado2.nextInt();
                    men.Inventario.add(new Articulos(invidx,invnom,invcant,invprec));
                    System.out.println("El articulo se ha agregado exitosamente.");
                    System.out.println("");
                    
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Digite el numero de posicion del articulo a eliminar: ");
                    int index=teclado2.nextInt();
                    System.out.println("-------------------------------------------------");
                    x = men.Inventario.iterator();
                    while (x.hasNext()) {
                        Articulos c = x.next();
                        if(c.getPosicion()== index){
                            x.remove();
                            found= true;
                        }
                    }
                    if (!found){
                        System.out.println("El numero digitado no se encuentra.");
                    }else{
                        System.out.println("El articulo se ha borrado exitosamente");
                    }
                    System.out.println("-------------------------------------------------");
                    break;
                case 4:
                    found = false;
                    System.out.print("Digite el numero de posicion del articulo a modificar: ");
                    invidx=teclado.nextInt();
                    System.out.println("-------------------------------------------------");
                    ListIterator<Articulos> v= men.Inventario.listIterator();
                    while (v.hasNext()) {
                        Articulos c = v.next();
                        if(c.getPosicion()== invidx){
                            System.out.print("Ingrese el nuevo nombre del articulo: ");
                            invnom =teclado3.nextLine();
                            System.out.print("Ingrese la nueva cantidad: ");
                            invcant =teclado2.nextInt();
                            System.out.print("Ingrese el nuevo precio: ");
                            invprec =teclado2.nextInt();
                            v.set(new Articulos(invidx,invnom,invcant,invprec));
                            found= true;
                        }
                    }
                    if (!found){
                        System.out.println("El articulo no se encuentra.");
                    }else{
                        System.out.println("El articulo se ha modificado exitosamente");
                    }
                    System.out.println("-------------------------------------------------");
                    
                    break;
              
            }
        } while (opcion !=0);
    }
    
}

    
   