package com.mycompany.GUI;
//Clase para crear el objeto de Cliente

//Clase para crear el objeto de Cliente
public class Articulos {
    int posicion;
    int setPosicion;
    int getPosicion;
    String invNombre;
    String setInvNombre;
    String getInvNombre;
    String cantDisp;
    String setCantDisp;
    String getCantDisp;
    String precio;
    String setPrecio;
    String getPrecio;
    public Articulos(int posicion, String invNombre, String cantDisp, String precio) {
        this.posicion = posicion;
        this.invNombre = invNombre;
        this.cantDisp = cantDisp;
        this.precio = precio;
    }
     Articulos() {
        
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getInvNombre() {
        return invNombre;
    }

    public void setInvNombre(String invNombre) {
        this.invNombre = invNombre;
    }

    public String getCantDisp() {
        return cantDisp;
    }

    public void setCantDisp(String cantDisp) {
        this.cantDisp = cantDisp;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  invNombre+" Cant. disponible: " +  cantDisp+" Prec. uni.: " + precio;
    }


    
    
   
}
