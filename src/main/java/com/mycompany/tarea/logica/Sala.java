
package com.mycompany.tarea.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private int nroSala;
    private int cantidadAsientos;
    private String nombreSala;
    private String fila;
    private int asientosXfila;

    public Sala() {
    }

    public Sala(int id, int nroSala, int cantidadAsientos, String nombreSala, String fila, int asientosXfila) {
        this.id = id;
        this.nroSala = nroSala;
        this.cantidadAsientos = cantidadAsientos;
        this.nombreSala = nombreSala;
        this.fila = fila;
        this.asientosXfila = asientosXfila;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroSala() {
        return nroSala;
    }

    public void setNroSala(int nroSala) {
        this.nroSala = nroSala;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getAsientosXfila() {
        return asientosXfila;
    }

    public void setAsientosXfila(int asientosXfila) {
        this.asientosXfila = asientosXfila;
    }
    
    
    
}
