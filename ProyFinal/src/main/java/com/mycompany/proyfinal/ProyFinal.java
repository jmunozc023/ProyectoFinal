package com.mycompany.proyfinal;

import com.mycompany.GUI.MenuGUI;


public class ProyFinal {
    
    
    public void Mant_clientes(){
 
    }
    //El main solo debe tener la llamada del contructor para el menu. Todo lo demas se hace en clases aparte.
    public static void main(String[] args) {
        Menu men =new Menu();
        men.opciones();
        new MenuGUI().setVisible(true);
    }
}
