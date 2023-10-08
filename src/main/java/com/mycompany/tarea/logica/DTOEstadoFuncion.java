
package com.mycompany.tarea.logica;

public class DTOEstadoFuncion {
    private String id;
    private String nombreEstFun;

    public DTOEstadoFuncion() {
    }

    public DTOEstadoFuncion(String id, String nombreEstFun) {
        this.id = id;
        this.nombreEstFun = nombreEstFun;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEstFun() {
        return nombreEstFun;
    }

    public void setNombreEstFun(String nombreEstFun) {
        this.nombreEstFun = nombreEstFun;
    }
    
    
}
