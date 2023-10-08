
package com.mycompany.tarea.logica;

public class DTODescuento {
    private String id;
    private String nombreDescuento;
    private String fechaAltaDesc;
    private String fechaBajaDesc;
    private String porcentajeDesc;

    public DTODescuento() {
    }

    public DTODescuento(String id, String nombreDescuento, String fechaAltaDesc, String fechaBajaDesc, String porcentajeDesc) {
        this.id = id;
        this.nombreDescuento = nombreDescuento;
        this.fechaAltaDesc = fechaAltaDesc;
        this.fechaBajaDesc = fechaBajaDesc;
        this.porcentajeDesc = porcentajeDesc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public void setNombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    public String getFechaAltaDesc() {
        return fechaAltaDesc;
    }

    public void setFechaAltaDesc(String fechaAltaDesc) {
        this.fechaAltaDesc = fechaAltaDesc;
    }

    public String getFechaBajaDesc() {
        return fechaBajaDesc;
    }

    public void setFechaBajaDesc(String fechaBajaDesc) {
        this.fechaBajaDesc = fechaBajaDesc;
    }

    public String getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(String porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }
    
    
}
