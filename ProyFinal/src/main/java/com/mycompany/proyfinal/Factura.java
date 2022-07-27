package com.mycompany.proyfinal;


public class Factura {

    private Cliente cli;
    private Articulos art;
    private float total;
    private float iva;
    private float subtotal;

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Articulos getArt() {
        return art;
    }

    public void setArt(Articulos art) {
        this.art = art;
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

    public Factura(Cliente cli, Articulos art, float total, float iva, float subtotal) {
        this.cli = cli;
        this.art = art;
        this.total = total;
        this.iva = iva;
        this.subtotal = subtotal;
    }
      @Override
    public String toString() {
        return "Factura{" + "cli=" + cli + ", art=" + art + ", total=" + total + ", iva=" + iva + ", subtotal=" + subtotal + '}';
    }

}
