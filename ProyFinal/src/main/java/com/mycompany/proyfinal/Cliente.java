package com.mycompany.proyfinal;

public class Cliente {
    int clnumero;
    String clnombre;
    int clnumeroTel;
    String clemail;
    int getClnumero;
    String getClnombre;
    int getClnumeroTel;
    String getClemail;
    public Cliente(int clnumero, String clnombre, int clnumeroTel, String clemail) {
        this.clnumero = clnumero;
        this.clnombre = clnombre;
        this.clnumeroTel = clnumeroTel;
        this.clemail = clemail;
    }

    Cliente() {
        
    }

    public int getClnumero() {
        return clnumero;
    }

    public void setClnumero(int clnumero) {
        this.clnumero = clnumero;
    }

    public String getClnombre() {
        return clnombre;
    }

    public void setClnombre(String clnombre) {
        this.clnombre = clnombre;
    }

    public int getClnumeroTel() {
        return clnumeroTel;
    }

    public void setClnumeroTel(int clnumeroTel) {
        this.clnumeroTel = clnumeroTel;
    }

    public String getClemail() {
        return clemail;
    }

    public void setClemail(String clemail) {
        this.clemail = clemail;
    }

    @Override
    public String toString() {
        return "Cliente " + "Numero:" + clnumero + ", Nombre:" + clnombre + ", Telefono:" + clnumeroTel + ", Email:" + clemail;
    }

    
    
   
}
