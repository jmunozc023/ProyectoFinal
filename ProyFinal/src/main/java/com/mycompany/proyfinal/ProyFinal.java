package com.mycompany.proyfinal;
import java.util.Scanner;

public class ProyFinal {
    private Scanner teclado;
    private String[] nombre;
    private String[] telefono;
    private String[] email;
    public void cargar(){
        teclado=new Scanner(System.in);
        nombre=new String [5];
        telefono =new String [5];
        email =new String [5];
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el nombre del cliente: ");
            nombre[i]=teclado.next();
        }
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el telefono del cliente: ");
            telefono[i]=teclado.next();
        }
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el email del cliente: ");
            email[i]=teclado.next();
        }
    }
    
    public static void main(String[] args) {
        ProyFinal c =new ProyFinal();
        c.cargar();
    }
}
