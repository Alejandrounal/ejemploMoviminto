/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int xref;
    private int yref;
    private int ancho;
    private int alto;
    private Llanta[] llantas;
    private Chasis chasis;

    public Carro(int xref, int yref, int ancho, int alto) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
        this.chasis = new Chasis();
        this.llantas = new Llanta[2];
    }
    
    public void mover(){
        if(this.xref<500){
        this.xref++;
    }else{
            this.xref = 0;
        }
    }

    public int getXref() {
        return xref;
    }

    public void setXref(int xref) {
        this.xref = xref;
    }

    public int getYref() {
        return yref;
    }

    public void setYref(int yref) {
        this.yref = yref;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    
}
