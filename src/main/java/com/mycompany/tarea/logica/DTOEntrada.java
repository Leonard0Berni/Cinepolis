
package com.mycompany.tarea.logica;

public class DTOEntrada {
    private String id;
    private String nroEntrada;
    private String precioEntradaDescuento;
    private String nroAsiento;
    private String fila;
    private String vendida;
    
    private DTOFuncion DTOFunc;
    private DTODescuento DTODesc;

    public DTOEntrada() {
    }

    public DTOEntrada(String id, String nroEntrada, String precioEntradaDescuento, String nroAsiento, String fila, String vendida, DTOFuncion DTOFunc, DTODescuento DTODesc) {
        this.id = id;
        this.nroEntrada = nroEntrada;
        this.precioEntradaDescuento = precioEntradaDescuento;
        this.nroAsiento = nroAsiento;
        this.fila = fila;
        this.vendida = vendida;
        this.DTOFunc = DTOFunc;
        this.DTODesc = DTODesc;
    }

    public DTOFuncion getDTOFunc() {
        return DTOFunc;
    }

    public void setDTOFunc(DTOFuncion DTOFunc) {
        this.DTOFunc = DTOFunc;
    }

    

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(String nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public String getPrecioEntradaDescuento() {
        return precioEntradaDescuento;
    }

    public void setPrecioEntradaDescuento(String precioEntradaDescuento) {
        this.precioEntradaDescuento = precioEntradaDescuento;
    }

    public String getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(String nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getVendida() {
        return vendida;
    }

    public void setVendida(String vendida) {
        this.vendida = vendida;
    }

    public DTODescuento getDTODesc() {
        return DTODesc;
    }

    public void setDTODesc(DTODescuento DTODesc) {
        this.DTODesc = DTODesc;
    }
    
    
}
