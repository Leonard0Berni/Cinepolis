
package com.mycompany.tarea.logica;

public class DTOUsuario {
    private String id;
    private String Nombre;
    private String email;
    private String contraseña;
    private String admin;

    public DTOUsuario() {
    }

    public DTOUsuario(String id, String Nombre, String email, String contraseña, String admin) {
        this.id = id;
        this.Nombre = Nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.admin = admin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
