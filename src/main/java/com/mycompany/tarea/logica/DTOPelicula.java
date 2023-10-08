
package com.mycompany.tarea.logica;

public class DTOPelicula {
    private String id;
    private String titulo;
    private String genero;
    private String director;
    private String elenco;
    private String duracion;
    private String fechaAlta;
    private String fechaBaja;

    public DTOPelicula() {
    }

    public DTOPelicula(String id, String titulo, String genero, String director, String elenco, String duracion, String fechaAlta, String fechaBaja) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.elenco = elenco;
        this.duracion = duracion;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    
}
