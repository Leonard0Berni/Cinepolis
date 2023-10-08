package com.mycompany.tarea.logica;

import com.mycompany.tarea.logica.Descuento;
import com.mycompany.tarea.logica.Funcion;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-10T19:29:45", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Entrada.class)
public class Entrada_ { 

    public static volatile SingularAttribute<Entrada, Float> precioEntradaDescuento;
    public static volatile SingularAttribute<Entrada, Integer> nroAsiento;
    public static volatile SingularAttribute<Entrada, Boolean> vendida;
    public static volatile SingularAttribute<Entrada, Character> fila;
    public static volatile SingularAttribute<Entrada, Integer> nroEntrada;
    public static volatile SingularAttribute<Entrada, Integer> id;
    public static volatile SingularAttribute<Entrada, Funcion> funcion;
    public static volatile SingularAttribute<Entrada, Descuento> desc;

}