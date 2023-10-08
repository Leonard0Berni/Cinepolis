package com.mycompany.tarea.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-10T19:29:45", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Descuento.class)
public class Descuento_ { 

    public static volatile SingularAttribute<Descuento, String> nombreDescuento;
    public static volatile SingularAttribute<Descuento, Date> fechaAltaDesc;
    public static volatile SingularAttribute<Descuento, Date> fechaBajaDesc;
    public static volatile SingularAttribute<Descuento, Integer> id;
    public static volatile SingularAttribute<Descuento, Float> porcentajeDesc;

}