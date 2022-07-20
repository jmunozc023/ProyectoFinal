/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.Scanner;

/**
 *
 * @author josep
 */

public class Cliente {

    
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private String telefono;
    private String email;
    public Cliente() {
    }
    
    public String getNombre() {
        System.out.print("Escriba el nombre del cliente: ");
        nombre = leer.nextLine();
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        System.out.print("Escriba el telefono del cliente: ");
        nombre = leer.nextLine();
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        System.out.print("Escriba el email del cliente: ");
        nombre = leer.nextLine();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
}
