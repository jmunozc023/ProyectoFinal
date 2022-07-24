package com.mycompany.proyfinal;

import java.util.Scanner;

//Crea el menu principal, aqui solo se llaman las clases principales
public class Menu {
    Scanner leer = new Scanner(System.in);
    int opcion;
    public void opciones(){
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
                    Mant_clientes mancli = new Mant_clientes();
                    mancli.funcional();
                    break;
                case 2:
                    Mant_inventario maninv = new Mant_inventario();
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
