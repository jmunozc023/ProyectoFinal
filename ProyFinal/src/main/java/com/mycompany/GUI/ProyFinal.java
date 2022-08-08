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
public class ProyFinal {
    public static ArrayList<Cliente> cl;
    
    public static void main(String[] args) {
        cl =new ArrayList<>();
        interfazCliente infaCli = new interfazCliente();
        infaCli.clientesBase();
        MenuGUI principal =new MenuGUI ();
        principal.setVisible(true);
        
    }
    
}
