
package com.mycompany.tarea.logica;

public class DTOFuncion {
    private String id;
    private String horario;
    private String fecha;
    private String cantEntradasVendidas;
    private String precioEntrada;
    private String cantRecaudada;
    
    private DTOPelicula DTOpelicula;
    private DTOSala DTOsala;
    private DTOEstadoFuncion DTOestadoFuncion;

    public DTOFuncion() {
    }
    
    public String Recaudacion(DTOEntrada DTOentrada){
        String nuevoIngreso = DTOentrada.getPrecioEntradaDescuento();
        float ingreso = Float.parseFloat(nuevoIngreso);
        float recaudacion = Float.parseFloat(this.cantRecaudada);
        recaudacion += ingreso;
        String recaudacionFinal = String.valueOf(recaudacion);
        this.cantRecaudada = recaudacionFinal;
        
        int cantEntrada = Integer.parseInt(this.cantEntradasVendidas);
        cantEntrada += 1;
        String cantEntradaFinal = String.valueOf(cantEntrada);
        this.cantEntradasVendidas = cantEntradaFinal;
        
        return this.cantRecaudada;
    }

    public DTOFuncion(String id, String horario, String fecha, String cantEntradasVendidas, String precioEntrada, String cantRecaudada, DTOPelicula DTOpelicula, DTOSala DTOsala, DTOEstadoFuncion DTOestadoFuncion) {
        this.id = id;
        this.horario = horario;
        this.fecha = fecha;
        this.cantEntradasVendidas = cantEntradasVendidas;
        this.precioEntrada = precioEntrada;
        this.cantRecaudada = cantRecaudada;
        this.DTOpelicula = DTOpelicula;
        this.DTOsala = DTOsala;
        this.DTOestadoFuncion = DTOestadoFuncion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantEntradasVendidas() {
        return cantEntradasVendidas;
    }

    public void setCantEntradasVendidas(String cantEntradasVendidas) {
        this.cantEntradasVendidas = cantEntradasVendidas;
    }

    public String getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(String precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getCantRecaudada() {
        return cantRecaudada;
    }

    public void setCantRecaudada(String cantRecaudada) {
        this.cantRecaudada = cantRecaudada;
    }

    public DTOPelicula getDTOpelicula() {
        return DTOpelicula;
    }

    public void setDTOpelicula(DTOPelicula DTOpelicula) {
        this.DTOpelicula = DTOpelicula;
    }

    public DTOSala getDTOsala() {
        return DTOsala;
    }

    public void setDTOsala(DTOSala DTOsala) {
        this.DTOsala = DTOsala;
    }

    public DTOEstadoFuncion getDTOestadoFuncion() {
        return DTOestadoFuncion;
    }

    public void setDTOestadoFuncion(DTOEstadoFuncion DTOestadoFuncion) {
        this.DTOestadoFuncion = DTOestadoFuncion;
    }
    
    
}
