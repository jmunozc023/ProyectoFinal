
package com.mycompany.proyfinal;
//En esta clase se declara el nuevo menu de Mantenimiento de clientes junto con toda la funcionalidad
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.mycompany.GUI.interfazCliente;

public class Funciones {
        interfazCliente inter = new interfazCliente();
        int opcion=-1;
        Scanner teclado= new Scanner(System.in);
        Scanner teclado1= new Scanner(System.in);
        Scanner teclado2= new Scanner(System.in);
        Scanner teclado3= new Scanner(System.in);
        Menu men=new Menu();
        public void clientesBase(){
        men.cl.add(new Cliente(1001, "Jose Muñoz", 87026720, "jmunozc023@ulacit.ed.cr"));
        men.cl.add(new Cliente(1002, "Diana Rodriguez", 72845478, "drodriguezs298@ulacit.ed.cr"));
        men.cl.add(new Cliente(1003, "Julliam Salazar", 57124752, "jsalazarg423@ulacit.ed.cr"));
        }
        public void inventarioBase(){
        men.Inventario.add(new Articulos(1001, "Jeans Mezclilla", 34, 22450));
        men.Inventario.add(new Articulos(1002,"Camisa manga larga",45,14700));
        men.Inventario.add(new Articulos(1003,"Pijama 2 piezas",20,16115));
        men.Inventario.add(new Articulos(1004,"Blusa",50,8990));
        men.Inventario.add(new Articulos(1005,"Chaleco",25,12700));
        men.Inventario.add(new Articulos(1006,"Jacket mezclilla",18,25300));
        men.Inventario.add(new Articulos(1007,"Cardigan",36,21900));
        men.Inventario.add(new Articulos(1008,"Sueter",45,13670));
        men.Inventario.add(new Articulos(1009,"Botines",28,22990));
        men.Inventario.add(new Articulos(1010,"Tennis",45,24560));
        }
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
        public void Facturacion(List<Cliente> cl, List<Articulos> Inventario){
            int opcion=-1;
            boolean found = false;
            
                System.out.println("-------------------------------------------------");
                System.out.println("Bienvenido al sistema de facturacion.");
                System.out.print("Digite el nombre del cliente a buscar: ");
                String index = teclado2.nextLine();
                Iterator<Cliente> x = men.cl.iterator();
                Iterator<Articulos> y = men.Inventario.iterator();
                Iterator<Factura> z= men.fac.iterator();
                while (x.hasNext()) {
                    Cliente c = x.next();
                    if (c.getClnombre().equals(index)) {
                        System.out.println(" Nombre del cliente: " + c.getClnombre() + " Numero telefonico: " + c.getClnumeroTel() + " Email: " + c.getClemail());
                        
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("El nombre digitado no se encuentra.");
                } 
                System.out.print("Digite el producto que desea comprar: ");
                String producto= teclado.nextLine();
                System.out.print("Digite la cantidad que desea comprar: ");
                int cantidad= teclado.nextInt();
                while (y.hasNext()) {
                    Articulos a = y.next();
                    if (a.getInvNombre().equals(producto)) {
                        int subt=0;
                        int tot=0;
                        System.out.println(" Nombre del prodcuto: " + a.getInvNombre() + " Precio " + a.getPrecio()+" Cantidad de articulos: "+cantidad);
                        subt= a.getPrecio()*cantidad;
                        tot=tot+subt;
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("El producto digitado no se encuentra.");
                }
            System.out.println("-------------------------------------------------");
        
    }

    
    
}

    
   