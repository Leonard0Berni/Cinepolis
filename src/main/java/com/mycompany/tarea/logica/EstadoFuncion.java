
package com.mycompany.tarea.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EstadoFuncion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombreEstFun;

    public EstadoFuncion() {
    }

    public EstadoFuncion(int id, String nombreEstFun) {
        this.id = id;
        this.nombreEstFun = nombreEstFun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEstFun() {
        return nombreEstFun;
    }

    public void setNombreEstFun(String nombreEstFun) {
        this.nombreEstFun = nombreEstFun;
    }
    
    
}
