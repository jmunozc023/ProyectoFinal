package com.mycompany.GUI;
//Clase para crear el objeto de Cliente1

import com.mycompany.proyfinal.*;
//Clase para crear el objeto de Cliente1
public class Cliente1 {
    int clnumero;
    String clnombre;
    String clnumeroTel;
    String clemail;
    int getClnumero;
    String getClnombre;
    int getClnumeroTel;
    String getClemail;
    
    public Cliente1(int clnumero, String clnombre, String clnumeroTel, String clemail) {
        this.clnumero = clnumero;
        this.clnombre = clnombre;
        this.clnumeroTel = clnumeroTel;
        this.clemail = clemail;
    }

    Cliente1() {
        
        
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

    public String getClnumeroTel() {
        return clnumeroTel;
    }

    public void setClnumeroTel(String clnumeroTel) {
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

    public void clnumero() {
        
    }

    public void clnombre() {
        
    }

    public void clnumeroTel() {
        
    }

    public void clemail() {
        
    }

    
    
   
}
