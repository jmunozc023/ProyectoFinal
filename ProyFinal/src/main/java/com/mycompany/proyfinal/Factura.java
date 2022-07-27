package com.mycompany.proyfinal;


public class Factura {

    
    private float total;
    private float iva;
    private float subtotal;
    private float cantidadart;
    
    public float getCantidadart() {
        return cantidadart;
    }

    public void setCantidadart(float cantidadart) {
        this.cantidadart = cantidadart;
    }
    
    public Factura(float cantidadart) {
        this.cantidadart = cantidadart;
    }
    

    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Factura(float total, float iva, float subtotal, float cantidadart) {

        this.total = total;
        this.iva = iva;
        this.subtotal = subtotal;
        this.cantidadart= cantidadart;
    }
      @Override
    public String toString() {
        return "Factura{" + ", total=" + total + ", iva=" + iva + ", subtotal=" + subtotal + ", cantidad=" + cantidadart + '}';
    }

}
