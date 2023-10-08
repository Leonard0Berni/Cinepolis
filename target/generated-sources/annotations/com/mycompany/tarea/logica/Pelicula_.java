package com.mycompany.tarea.logica;

import java.time.LocalTime;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-10T19:29:45", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile SingularAttribute<Pelicula, Date> fechaBaja;
    public static volatile SingularAttribute<Pelicula, Date> fechaAlta;
    public static volatile SingularAttribute<Pelicula, String> director;
    public static volatile SingularAttribute<Pelicula, String> elenco;
    public static volatile SingularAttribute<Pelicula, String> genero;
    public static volatile SingularAttribute<Pelicula, String> titulo;
    public static volatile SingularAttribute<Pelicula, LocalTime> duracion;
    public static volatile SingularAttribute<Pelicula, Integer> id;

}