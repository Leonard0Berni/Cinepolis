
package com.mycompany.tarea.persistencia;

import com.mycompany.tarea.logica.Descuento;
import com.mycompany.tarea.logica.Entrada;
import com.mycompany.tarea.logica.EstadoFuncion;
import com.mycompany.tarea.logica.Funcion;
import com.mycompany.tarea.logica.Pelicula;
import com.mycompany.tarea.logica.Sala;
import com.mycompany.tarea.logica.Usuario;
import com.mycompany.tarea.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    DescuentoJpaController DescuentoJPA = new DescuentoJpaController();
    EntradaJpaController EntradaJPA = new EntradaJpaController();
    EstadoFuncionJpaController EstadoFuncionJPA = new EstadoFuncionJpaController();
    FuncionJpaController FuncionJPA = new FuncionJpaController();
    PeliculaJpaController PeliculaJPA = new PeliculaJpaController();
    SalaJpaController SalaJPA= new SalaJpaController();
    UsuarioJpaController UsuarioJPA = new UsuarioJpaController();

    public void crearSala(Sala sala) {
        SalaJPA.create(sala);
    }

    public List<Sala> traerSalas() {
        return SalaJPA.findSalaEntities();
    }

    public Sala traerSala(int IdSala) {
        return SalaJPA.findSala(IdSala);
    }

    public void editarSala(Sala sala) {
        try {
            SalaJPA.edit(sala);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarSala(int IdSala) {
        try {
            SalaJPA.destroy(IdSala);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearPelicula(Pelicula peli) {
        PeliculaJPA.create(peli);
    }

    public List<Pelicula> traerPeliculas() {
        return PeliculaJPA.findPeliculaEntities();
    }

    public Pelicula traerPelicula(int IdPelicula) {
        return PeliculaJPA.findPelicula(IdPelicula);
    }

    public void editarPelicula(Pelicula peli) {
        try {
            PeliculaJPA.edit(peli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPelicula(int IdPelicula) {
        try {
            PeliculaJPA.destroy(IdPelicula);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Descuento> traerDescuentos() {
        return DescuentoJPA.findDescuentoEntities();
    }

    public void crearDescuento(Descuento Desc) {
        DescuentoJPA.create(Desc);
    }

    public Descuento traerDescuento(int IdDescuento) {
        return DescuentoJPA.findDescuento(IdDescuento);
    }

    public void editarDescuento(Descuento Desc) {
        try {
            DescuentoJPA.edit(Desc);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarDescuento(int IdDescuento) {
        try {
            DescuentoJPA.destroy(IdDescuento);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Funcion> traerFunciones() {
        return FuncionJPA.findFuncionEntities();
    }

    public Funcion traerFuncion(int IdFuncion) {
        return FuncionJPA.findFuncion(IdFuncion);
    }

    public void venderEntrada(Entrada entrada) {
        EntradaJPA.create(entrada);
    }

    public List<Usuario> traerUsuarios() {
        return UsuarioJPA.findUsuarioEntities();
    }

    public void crearUsuario(Usuario usu) {
        UsuarioJPA.create(usu);
    }

    public List<EstadoFuncion> traerEstados() {
        return EstadoFuncionJPA.findEstadoFuncionEntities();
    }

    public EstadoFuncion traerEstado(int IdEstado) {
        return EstadoFuncionJPA.findEstadoFuncion(IdEstado);
    }

    public void crearFuncion(Funcion funcion) {
        FuncionJPA.create(funcion);
    }

    public List<Entrada> traerEntradas() {
        return EntradaJPA.findEntradaEntities();
    }

    

    
    
    
    
    
}
