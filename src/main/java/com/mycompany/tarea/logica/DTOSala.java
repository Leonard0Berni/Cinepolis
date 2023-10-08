
package com.mycompany.tarea.logica;

public class DTOSala {
    private String id;
    private String nroSala;
    private String cantidadAsientos;
    private String nombreSala;
    private String fila;
    private String asientosXfila;

    public DTOSala() {
    }

    public DTOSala(String id, String nroSala, String cantidadAsientos, String nombreSala, String fila, String asientosXfila) {
        this.id = id;
        this.nroSala = nroSala;
        this.cantidadAsientos = cantidadAsientos;
        this.nombreSala = nombreSala;
        this.fila = fila;
        this.asientosXfila = asientosXfila;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNroSala() {
        return nroSala;
    }

    public void setNroSala(String nroSala) {
        this.nroSala = nroSala;
    }

    public String getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(String cantidadAsientos) {
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

    public String getAsientosXfila() {
        return asientosXfila;
    }

    public void setAsientosXfila(String asientosXfila) {
        this.asientosXfila = asientosXfila;
    }
    
    
}
