package com.prueba2.prueba2.model;

public class Persona {
    private Integer idPersona;
    private String nombrer;
    private String apellido;
    private String tlfn;

    public Persona() { // Persona persona1 = new Persona();
    }

    public Persona(Integer idPersona, String nombrer, String apellido, String tlfn) {
        this.idPersona = idPersona;
        this.nombrer = nombrer;
        this.apellido = apellido;
        this.tlfn = tlfn;
    }
    //Persona persona1 = new Persona(idPersona,nombrer,apellido,tlfn);

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona; //this = Persona
    }

    public String getNombrer() {
        return nombrer;
    }

    public void setNombrer(String nombrer) {
        this.nombrer = nombrer;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    

    
    
}
