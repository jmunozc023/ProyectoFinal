/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.GUI;


import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class Main {
    public static ArrayList<Cliente> cl;
    public static ArrayList<Articulos> inv;
    public static ArrayList<Factura> fac;
    
    public static void main(String[] args) {
        cl =new ArrayList<>();
        inv =new ArrayList<>();
        fac =new ArrayList<>();
        interfazCliente infaCli = new interfazCliente();
        infaCli.clientesBase();
        interfazInventario infaInv = new interfazInventario();
        infaInv.inventarioBase();
        interfazFacturacion infafac = new interfazFacturacion();
        MenuGUI principal =new MenuGUI ();
        principal.setVisible(true);
        
    }
    
}
