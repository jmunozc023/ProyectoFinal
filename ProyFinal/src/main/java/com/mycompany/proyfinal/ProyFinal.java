package com.mycompany.proyfinal;
import java.util.Scanner;

public class ProyFinal {
    private Scanner teclado;
    private String[][] cliente;
    public void cargar(){
        teclado=new Scanner(System.in);
        cliente=new String [3][5];
        for (int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.println("Ingrese los datos del cliente: ");
                cliente[i][j]=teclado.next();
            }        
        }
    }
    
    public static void main(String[] args) {
        ProyFinal c =new ProyFinal();
        c.cargar();
    }
}
