//numero de posicion, nombre del articulo, cantidad disponible, precio del articulo
package com.mycompany.proyfinal;

//Clase para crear el objeto de inventario
public class Articulos {
    int posicion;
    int setPosicion;
    int getPosicion;
    String invNombre;
    String setInvNombre;
    String getInvNombre;
    int cantDisp;
    int setCantDisp;
    int getCantDisp;
    int precio;
    int setPrecio;
    int getPrecio;
    public Articulos(int posicion, String invNombre, int cantDisp, int precio) {
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

    public int getCantDisp() {
        return cantDisp;
    }

    public void setCantDisp(int cantDisp) {
        this.cantDisp = cantDisp;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio() {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Inventario " + "Posicion:" + posicion + ", Nombre:" + invNombre + ", Cantidad disponible:" + cantDisp + ", Precio:" + precio;
    }
}
