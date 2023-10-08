package com.mycompany.tarea.logica;

import com.mycompany.tarea.logica.Entrada;
import java.time.LocalTime;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-10T19:29:45", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Funcion.class)
public class Funcion_ { 

    public static volatile SingularAttribute<Funcion, Date> fecha;
    public static volatile SingularAttribute<Funcion, Float> cantRecaudada;
    public static volatile SingularAttribute<Funcion, LocalTime> horario;
    public static volatile SingularAttribute<Funcion, Integer> cantEntradasVendidas;
    public static volatile ListAttribute<Funcion, Entrada> listaEntradas;
    public static volatile SingularAttribute<Funcion, Integer> id;
    public static volatile SingularAttribute<Funcion, Float> precioEntrada;

}