package com.mycompany.proyfinal;

import java.util.Scanner;

public class Clientes {
    String nombre, telefono, email;
    private Scanner teclado;
    public Clientes(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
              
    }

    Clientes() {
        
    }

    public void nombre() {
        System.out.print("Digite el nombre del cliente: ");
        teclado= new Scanner(System.in);
        nombre=teclado.nextLine();
    }

    public void telefono() {
        System.out.print("Digite el telefono del cliente: ");
        teclado= new Scanner(System.in);
        telefono=teclado.nextLine();
    }

    public void email() {
        System.out.print("Digite el email del cliente: ");
        teclado= new Scanner(System.in);
        email=teclado.nextLine();     
        
    }
    
}
