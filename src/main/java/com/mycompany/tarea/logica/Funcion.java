
package com.mycompany.tarea.logica;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String horario;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private int cantEntradasVendidas;
    private float precioEntrada;
    private float cantRecaudada;
    
    @ManyToOne
    private Pelicula pelicula;
    @ManyToOne
    private Sala sala;
    @ManyToOne
    private EstadoFuncion estado;
    
    public float Recaudacion(Entrada entrada){
        float nuevoIngreso = entrada.getPrecioEntradaDescuento();
        this.cantRecaudada += nuevoIngreso;
        this.cantEntradasVendidas += 1;
        return this.cantRecaudada;
    }

    public Funcion() {
    }

    public Funcion(int id, String horario, Date fecha, int cantEntradasVendidas, float precioEntrada, float cantRecaudada, Pelicula pelicula, Sala sala, EstadoFuncion estado) {
        this.id = id;
        this.horario = horario;
        this.fecha = fecha;
        this.cantEntradasVendidas = cantEntradasVendidas;
        this.precioEntrada = precioEntrada;
        this.cantRecaudada = cantRecaudada;
        this.pelicula = pelicula;
        this.sala = sala;
        this.estado = estado;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantEntradasVendidas() {
        return cantEntradasVendidas;
    }

    public void setCantEntradasVendidas(int cantEntradasVendidas) {
        this.cantEntradasVendidas = cantEntradasVendidas;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public float getCantRecaudada() {
        return cantRecaudada;
    }

    public void setCantRecaudada(float cantRecaudada) {
        this.cantRecaudada = cantRecaudada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public EstadoFuncion getEstado() {
        return estado;
    }

    public void setEstado(EstadoFuncion estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
