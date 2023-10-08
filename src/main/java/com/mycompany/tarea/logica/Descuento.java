
package com.mycompany.tarea.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Descuento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombreDescuento;
    @Temporal(TemporalType.DATE)
    private Date fechaAltaDesc;
    @Temporal(TemporalType.DATE)
    private Date fechaBajaDesc;
    private float porcentajeDesc;

    public Descuento() {
    }

    public Descuento(int id, String nombreDescuento, Date fechaAltaDesc, Date fechaBajaDesc, float porcentajeDesc) {
        this.id = id;
        this.nombreDescuento = nombreDescuento;
        this.fechaAltaDesc = fechaAltaDesc;
        this.fechaBajaDesc = fechaBajaDesc;
        this.porcentajeDesc = porcentajeDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public void setNombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    public Date getFechaAltaDesc() {
        return fechaAltaDesc;
    }

    public void setFechaAltaDesc(Date fechaAltaDesc) {
        this.fechaAltaDesc = fechaAltaDesc;
    }

    public Date getFechaBajaDesc() {
        return fechaBajaDesc;
    }

    public void setFechaBajaDesc(Date fechaBajaDesc) {
        this.fechaBajaDesc = fechaBajaDesc;
    }

    public float getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(float porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }
    
    
    
    
}
