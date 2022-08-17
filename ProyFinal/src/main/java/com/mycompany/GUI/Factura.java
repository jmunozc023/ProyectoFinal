package com.mycompany.GUI;

public class Factura {

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Factura(String producto) {
        this.producto = producto;
    }
    private String producto;
    private String total;
    private float iva;
    private String subtotal;
    private String cantidadart;
    
    public String getCantidadart() {
        return cantidadart;
    }

    public void setCantidadart(String cantidadart) {
        this.cantidadart = cantidadart;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public Factura(String producto, String total, float iva, String subtotal, String cantidadart) {
        this.producto=producto;
        this.total = total;
        this.iva = iva;
        this.subtotal = subtotal;
        this.cantidadart= cantidadart;
    }
      @Override
    public String toString() {
        return producto + cantidadart + total +  iva +  subtotal ;
    }
    

    
    
   
}
