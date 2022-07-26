
package com.mycompany.proyfinal;
//En esta clase se declara el nuevo menu de Mantenimiento de Inventario junto con toda la funcionalidad
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Mant_inventario {
    Menu men = new Menu();
    
    /*public void inventariobase() {
        
        
        Inventario.add(new Articulos(1001, "Jeans Mezclilla", 34, 22450));
        Inventario.add(new Articulos(1002,"Camisa manga larga",45,14700));
        Inventario.add(new Articulos(1003,"Pijama 2 piezas",20,16115));
        Inventario.add(new Articulos(1004,"Blusa",50,8990));
        Inventario.add(new Articulos(1005,"Chaleco",25,12700));
        Inventario.add(new Articulos(1006,"Jacket mezclilla",18,25300));
        Inventario.add(new Articulos(1007,"Cardigan",36,21900));
        Inventario.add(new Articulos(1008,"Sueter",45,13670));
        Inventario.add(new Articulos(1009,"Botines",28,22990));
        Inventario.add(new Articulos(1010,"Tennis",45,24560));
    }*/
    public void funcion(){
        int opcion=-1;
        Scanner teclado= new Scanner(System.in);
        Scanner teclado1= new Scanner(System.in);
        do {            
            System.out.println("Menu de inventario.");
            System.out.println("1. Mostrar inventario disponible");
            System.out.println("2. Agregar articulo");
            System.out.println("3. Eliminar articulo");
            System.out.println("4. Modificar articulo");
            System.out.println("0. Salir");
            System.out.print("Seleccione la opcion que desea: ");
            opcion = teclado.nextInt();
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
                    int invidx= teclado.nextInt();
                    System.out.print("Ingrese el nombre del articulo: ");
                    String invnom= teclado1.nextLine();
                    System.out.print("Ingrese la cantidad disponible: ");
                    int invcant= teclado.nextInt();
                    System.out.print("Ingrese el precio: ");
                    int invprec= teclado.nextInt();
                    men.Inventario.add(new Articulos(invidx,invnom,invcant,invprec));
                    System.out.println("El articulo se ha agregado exitosamente.");
                    System.out.println("");
                    
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Digite el numero de posicion del articulo a eliminar: ");
                    int index=teclado.nextInt();
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
                            invnom =teclado1.nextLine();
                            System.out.print("Ingrese la nueva cantidad: ");
                            invcant =teclado.nextInt();
                            System.out.print("Ingrese el nuevo precio: ");
                            invprec =teclado.nextInt();
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
    public void Inventario(){
    }
}

