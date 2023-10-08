
package com.mycompany.tarea.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private int nroEntrada;
    private float precioEntradaDescuento;
    private int nroAsiento;
    private char fila;
    private boolean vendida;
    
    @ManyToOne //--> Muchas entradas tienen una funcion
    @JoinColumn(name = "entrada_funcion")
    private Funcion funcion;
    
    //@OneToOne me olvide de escribirla al principio
    private Descuento desc;

    public Entrada() {
    }

    public Entrada(int id, int nroEntrada, float precioEntradaDescuento, int nroAsiento, char fila, boolean vendida, Funcion funcion, Descuento desc) {
        this.id = id;
        this.nroEntrada = nroEntrada;
        this.precioEntradaDescuento = precioEntradaDescuento;
        this.nroAsiento = nroAsiento;
        this.fila = fila;
        this.vendida = vendida;
        this.funcion = funcion;
        this.desc = desc;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public float getPrecioEntradaDescuento() {
        return precioEntradaDescuento;
    }

    public void setPrecioEntradaDescuento(float precioEntradaDescuento) {
        this.precioEntradaDescuento = precioEntradaDescuento;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public boolean isVendida() {
        return vendida;
    }

    public void setVendida(boolean vendida) {
        this.vendida = vendida;
    }

    public Descuento getDesc() {
        return desc;
    }

    public void setDesc(Descuento desc) {
        this.desc = desc;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
    
    
    
}
