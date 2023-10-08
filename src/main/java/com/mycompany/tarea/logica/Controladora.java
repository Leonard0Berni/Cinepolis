
package com.mycompany.tarea.logica;

import com.mycompany.tarea.persistencia.ControladoraPersistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controladora {
    
    ControladoraPersistencia ControlPersis = new ControladoraPersistencia();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

    public void crearSala(String nombreSala, String CantAsientos, String Filas, String CantAsientosXFila) {
        int cantAsientos = Integer.parseInt(CantAsientos);
        int cantAsientosXFila = Integer.parseInt(CantAsientosXFila);
        
        Sala sala = new Sala();
        sala.setNombreSala(nombreSala);
        sala.setCantidadAsientos(cantAsientos);
        sala.setAsientosXfila(cantAsientosXFila);
        sala.setFila(Filas);
        
        ControlPersis.crearSala(sala);
    }

    public List<DTOSala> traerSalas() {
        List<Sala> listaSala = ControlPersis.traerSalas();
        List<DTOSala> listaDtoSala = new ArrayList();
        DTOSala DtoSala = new DTOSala();
        
        int index = 0;
        for(Sala sala: listaSala){
            DtoSala.setId(String.valueOf(sala.getId()));
            DtoSala.setNombreSala(sala.getNombreSala());
            DtoSala.setCantidadAsientos(String.valueOf(sala.getCantidadAsientos()));
            DtoSala.setFila(sala.getFila());
            DtoSala.setAsientosXfila(String.valueOf(sala.getAsientosXfila()));
            listaDtoSala.add(index, DtoSala);
            index += 1;
        }
        return listaDtoSala;
    }

    public DTOSala traerSala(int IdSala) {
        Sala sala = ControlPersis.traerSala(IdSala);
        DTOSala DtoSala = new DTOSala();
        DtoSala.setId(String.valueOf(sala.getId()));
        DtoSala.setNombreSala(sala.getNombreSala());
        DtoSala.setCantidadAsientos(String.valueOf(sala.getCantidadAsientos()));
        DtoSala.setFila(sala.getFila());
        DtoSala.setAsientosXfila(String.valueOf(sala.getAsientosXfila()));
        return DtoSala;
    }

    public void editarSala(String IdSala, String nombreSala, String CantAsientos, String Filas, String CantAsientosXFila) {
        Sala sala = new Sala();
        sala.setId(Integer.parseInt(IdSala));
        sala.setNombreSala(nombreSala);
        sala.setCantidadAsientos(Integer.parseInt(CantAsientos));
        sala.setAsientosXfila(Integer.parseInt(CantAsientosXFila));
        sala.setFila(Filas);
        
        ControlPersis.editarSala(sala);
    }

    public void eliminarSala(String IdSala) {
        ControlPersis.eliminarSala(Integer.parseInt(IdSala));
    }

    public void crearPelicula(String titulo, String genero, String director, String elenco, String hs, String min, String seg, String fechaAlta, String fechaBaja) {
        try {
            Pelicula peli = new Pelicula();
            
            peli.setTitulo(titulo);
            peli.setGenero(genero);
            peli.setDirector(director);
            peli.setElenco(elenco);
            
            int Hs = Integer.parseInt(hs);
            int Min = Integer.parseInt(min);
            int Seg = Integer.parseInt(seg);
            LocalTime duracion = LocalTime.of(Hs, Min, Seg);
            peli.setDuracion(duracion);
            
            Date FechaAlta = dateFormat.parse(fechaAlta);
            Date FechaBaja = dateFormat.parse(fechaBaja);
            
            peli.setFechaAlta(FechaAlta);
            peli.setFechaBaja(FechaBaja);
            
            ControlPersis.crearPelicula(peli);
        } catch (ParseException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<DTOPelicula> traerPeliculas() {
        List<Pelicula> listaPeliculas = ControlPersis.traerPeliculas();
        List<DTOPelicula> listaDtoPelicula = new ArrayList();
        DTOPelicula DtoPeli = new DTOPelicula();
        
        int index = 0;
        for(Pelicula peli: listaPeliculas){
            DtoPeli.setId(String.valueOf(peli.getId()));
            DtoPeli.setTitulo(peli.getTitulo());
            DtoPeli.setDirector(peli.getDirector());
            DtoPeli.setElenco(peli.getElenco());
            DtoPeli.setDuracion(String.valueOf(peli.getDuracion()));
            
            DtoPeli.setFechaAlta(dateFormat.format(peli.getFechaAlta()));
            DtoPeli.setFechaBaja(dateFormat.format(peli.getFechaBaja()));
            
            listaDtoPelicula.add(index, DtoPeli);
            index += 1;
        }
        return listaDtoPelicula;
    }

    public DTOPelicula traerPelicula(int IdPelicula) {
        Pelicula peli = ControlPersis.traerPelicula(IdPelicula);
        DTOPelicula DtoPeli = new DTOPelicula();
        DtoPeli.setId(String.valueOf(peli.getId()));
        DtoPeli.setTitulo(peli.getTitulo());
        DtoPeli.setDirector(peli.getDirector());
        DtoPeli.setElenco(peli.getElenco());
        DtoPeli.setDuracion(String.valueOf(peli.getDuracion()));
        DtoPeli.setFechaAlta(String.valueOf(peli.getFechaAlta()));
        DtoPeli.setFechaBaja(String.valueOf(peli.getFechaBaja()));
        return DtoPeli;
    }

    public void editarPelicula(String Id, String titulo, String genero, String director, String elenco, String hs, String min, String seg, String fechaAlta, String fechaBaja) {
        try {
            Pelicula peli = new Pelicula();
            peli.setId(Integer.parseInt(Id));
            peli.setTitulo(titulo);
            peli.setGenero(genero);
            peli.setDirector(director);
            peli.setElenco(elenco);
            
            int Hs = Integer.parseInt(hs);
            int Min = Integer.parseInt(min);
            int Seg = Integer.parseInt(seg);
            LocalTime duracion = LocalTime.of(Hs, Min, Seg);
            peli.setDuracion(duracion);
            
            SimpleDateFormat formato = new SimpleDateFormat();
            Date FechaAlta = formato.parse(fechaAlta);
            Date FechaBaja = formato.parse(fechaBaja);
            
            peli.setFechaAlta(FechaAlta);
            peli.setFechaBaja(FechaBaja);
            
            ControlPersis.editarPelicula(peli);
        } catch (ParseException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPelicula(int IdPelicula) {
        ControlPersis.eliminarPelicula(IdPelicula);
    }

    public List<DTODescuento> traerDescuentos() {
        List<Descuento> listaDescuentos = ControlPersis.traerDescuentos();
        List<DTODescuento> listaDtoDescuentos = new ArrayList<>();
        int index = 0;
        for(Descuento Desc: listaDescuentos){
            DTODescuento DtoDesc = new DTODescuento();
            DtoDesc.setId(String.valueOf(Desc.getId()));
            DtoDesc.setNombreDescuento(Desc.getNombreDescuento());
            DtoDesc.setPorcentajeDesc(String.valueOf(Desc.getPorcentajeDesc()));
            // Formatear las fechas antes de asignarlas al DTO
            DtoDesc.setFechaAltaDesc(dateFormat.format(Desc.getFechaAltaDesc()));
            DtoDesc.setFechaBajaDesc(dateFormat.format(Desc.getFechaBajaDesc()));
            listaDtoDescuentos.add(index, DtoDesc);
            index += 1;
        }
        return listaDtoDescuentos;
    }

    public void crearDescuento(String nombre, String porcentaje, String fechaAlta, String fechaBaja) {
        try {
            Descuento Desc = new Descuento();
            Desc.setNombreDescuento(nombre);
            Desc.setPorcentajeDesc(Float.parseFloat(porcentaje));
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            Date FechaAlta = dateFormat.parse(fechaAlta);
            Date FechaBaja = dateFormat.parse(fechaBaja);
            
            Desc.setFechaAltaDesc(FechaAlta);
            Desc.setFechaBajaDesc(FechaBaja);
            
            ControlPersis.crearDescuento(Desc);
        } catch (ParseException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }

    public DTODescuento traerDescuento(int IdDescuento) {
        Descuento Desc = ControlPersis.traerDescuento(IdDescuento);
        DTODescuento DtoDesc = new DTODescuento();
        
        DtoDesc.setId(String.valueOf(Desc.getId()));
        DtoDesc.setNombreDescuento(Desc.getNombreDescuento());
        DtoDesc.setPorcentajeDesc(String.valueOf(Desc.getPorcentajeDesc()));
        DtoDesc.setFechaAltaDesc(String.valueOf(Desc.getFechaAltaDesc()));
        DtoDesc.setFechaAltaDesc(String.valueOf(Desc.getFechaBajaDesc()));
        return DtoDesc;
    }

    public void editarDescuento(String Id, String nombre, String porcentaje, String fechaAlta, String fechaBaja) {
        try {
            Descuento Desc = new Descuento();
            Desc.setId(Integer.parseInt(Id));
            Desc.setNombreDescuento(nombre);
            Desc.setPorcentajeDesc(Float.parseFloat(porcentaje));
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            Date FechaAlta = formato.parse(fechaAlta);
            Date FechaBaja = formato.parse(fechaBaja);
            
            Desc.setFechaAltaDesc(FechaAlta);
            Desc.setFechaBajaDesc(FechaBaja);
            
            ControlPersis.editarDescuento(Desc);
        } catch (ParseException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarDescuento(int IdDescuento) {
        ControlPersis.eliminarDescuento(IdDescuento);
    }
    
    public List<DTOEstadoFuncion> traerEstados(){
        List<EstadoFuncion> listaEstados = ControlPersis.traerEstados();
        List<DTOEstadoFuncion> listaDtoEstados = new ArrayList<>();
        DTOEstadoFuncion DtoEstado = new DTOEstadoFuncion();
        int index = 0;
        for(EstadoFuncion estado: listaEstados){
            DtoEstado.setId(String.valueOf(estado.getId()));
            DtoEstado.setNombreEstFun(estado.getNombreEstFun());
            listaDtoEstados.add(DtoEstado);
            index += 1;
        }
        return listaDtoEstados;
    }
    
    public DTOEstadoFuncion traerEstado(int IdEstado){
        EstadoFuncion estado = ControlPersis.traerEstado(IdEstado);
        DTOEstadoFuncion DtoEstado = new DTOEstadoFuncion();
        DtoEstado.setId(String.valueOf(estado.getId()));
        DtoEstado.setNombreEstFun(estado.getNombreEstFun());
        return DtoEstado;
    }

    public List<DTOFuncion> traerFunciones() {
        List<Funcion> listaFunciones = ControlPersis.traerFunciones();
        List<DTOFuncion> listaDtoFunciones = new ArrayList<>();
        DTOFuncion DtoFunc = new DTOFuncion();
        int index = 0;
        for(Funcion Func: listaFunciones){
            DtoFunc.setId(String.valueOf(Func.getId()));
            DtoFunc.setHorario(String.valueOf(Func.getHorario()));
            DtoFunc.setFecha(String.valueOf(Func.getHorario()));
            DtoFunc.setCantEntradasVendidas(String.valueOf(Func.getCantEntradasVendidas()));
            DtoFunc.setPrecioEntrada(String.valueOf(Func.getPrecioEntrada()));
            DtoFunc.setCantRecaudada(String.valueOf(Func.getCantRecaudada()));
            
            DTOSala DtoSala = traerSala(Func.getSala().getId());
            DtoFunc.setDTOsala(DtoSala);
            
            DTOPelicula DtoPeli = traerPelicula(Func.getPelicula().getId());
            DtoFunc.setDTOpelicula(DtoPeli);
            
            DTOEstadoFuncion DtoEstado = traerEstado(Func.getEstado().getId());
            DtoFunc.setDTOestadoFuncion(DtoEstado);
            
            listaDtoFunciones.add(index, DtoFunc);
            index += 1;
        }
        return listaDtoFunciones;
    }

    public DTOFuncion traerFuncion(int IdFuncion) {
        Funcion Func = ControlPersis.traerFuncion(IdFuncion);
        DTOFuncion DtoFunc = new DTOFuncion();
        DtoFunc.setId(String.valueOf(Func.getId()));
        DtoFunc.setHorario(String.valueOf(Func.getHorario()));
        DtoFunc.setFecha(String.valueOf(Func.getHorario()));
        DtoFunc.setCantEntradasVendidas(String.valueOf(Func.getCantEntradasVendidas()));
        DtoFunc.setPrecioEntrada(String.valueOf(Func.getPrecioEntrada()));
        DtoFunc.setCantRecaudada(String.valueOf(Func.getCantRecaudada()));
        
        DTOSala DtoSala = traerSala(Func.getSala().getId());
        DtoFunc.setDTOsala(DtoSala);

        DTOPelicula DtoPeli = traerPelicula(Func.getPelicula().getId());
        DtoFunc.setDTOpelicula(DtoPeli);

        DTOEstadoFuncion DtoEstado = traerEstado(Func.getEstado().getId());
        DtoFunc.setDTOestadoFuncion(DtoEstado);
        return DtoFunc;
    }

    public void venderEntrada(String precioEntradaDesc, String fila, String asiento, DTODescuento DtoDescuento) {
        Entrada entrad = new Entrada();
        entrad.setPrecioEntradaDescuento(Float.parseFloat(precioEntradaDesc));
        entrad.setFila(fila.charAt(0));
        entrad.setNroAsiento(Integer.parseInt(asiento));
        entrad.setVendida(true);
        Descuento Desc = ControlPersis.traerDescuento(Integer.parseInt(DtoDescuento.getId()));
        entrad.setDesc(Desc);
        ControlPersis.venderEntrada(entrad);
    }

    public boolean login(String email, String contraseña) {
        List<Usuario> listaUsuarios = ControlPersis.traerUsuarios();
        boolean sesion = false;
        for(Usuario usu: listaUsuarios){
            String bdEmail = usu.getEmail();
            String bdContraseña = usu.getContraseña();
            if(contraseña.equals(bdContraseña) && email.equals(bdEmail)){
                sesion = true;
            }
        }
        return sesion;
    }

    public boolean crearUsuario(String nombre, String email, String contraseña, String rol, String adminContraseña) {
        List<Usuario> listaUsuarios = ControlPersis.traerUsuarios();
        boolean admin = false;
        boolean status = false;
        
        for(Usuario usuAdmin: listaUsuarios){
            if(usuAdmin.getContraseña().equals(adminContraseña)){
                if (rol.equals("Administrador")) {
                    admin = true;
                    status = true;
                }else{
                    admin = false;
                    status = false;
                }
            }
        }
        
        Usuario usu = new Usuario();
        usu.setNombre(nombre);
        usu.setEmail(email);
        usu.setContraseña(contraseña);
        usu.setAdmin(admin);
        ControlPersis.crearUsuario(usu);
        return status;
    }

    public void crearFuncion(DTOPelicula DtoPeli, DTOSala DtoSala, DTOEstadoFuncion DtoEstado, String hs, String min,String precio, String fechaAlta) {
        try {
            Funcion funcion = new Funcion();
            
            Pelicula Peli = ControlPersis.traerPelicula(Integer.parseInt(DtoPeli.getId()));
            funcion.setPelicula(Peli);
            Sala sala = ControlPersis.traerSala(Integer.parseInt(DtoSala.getId()));
            funcion.setSala(sala);
            EstadoFuncion estado = ControlPersis.traerEstado(Integer.parseInt(DtoEstado.getId()));
            funcion.setEstado(estado);
            
            
            String horario = hs + ":" + min;
            funcion.setHorario(horario);
            
            float precioEntrada = Float.parseFloat(precio);
            funcion.setPrecioEntrada(precioEntrada);
            
            SimpleDateFormat formato = new SimpleDateFormat();
            Date FechaAlta = formato.parse(fechaAlta);
            funcion.setFecha(FechaAlta);
            
            ControlPersis.crearFuncion(funcion);
            
        } catch (ParseException ex) {
            Logger.getLogger(Controladora.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    
}
