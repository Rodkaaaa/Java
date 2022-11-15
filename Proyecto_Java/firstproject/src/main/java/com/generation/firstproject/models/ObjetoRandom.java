package com.generation.firstproject.models;

import java.time.LocalDate;

public class ObjetoRandom {
    private int _id;
    private String _nombre;
    private String _apellido;
    private int _edad;
    private String _email;
    private int _numeroTelefono;

    public ObjetoRandom() {
    }

    public ObjetoRandom(int id, String nombre, String apellido, int edad, String email, int numeroTelefono) {
        this._id = id;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this._email = email;
        this._numeroTelefono = numeroTelefono;
    }

    public int anioNacimiento() {
        LocalDate date = LocalDate.now();
        return date.getYear() - this._edad;

    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String apellido) {
        this._apellido = apellido;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int edad) {
        this._edad = edad;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public int getNumeroTelefono() {
        return _numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this._numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Datos [id=" + _id + ", nombre=" + _nombre + ", apellido=" + _apellido + ", edad=" + _edad
                + ", email="
                + _email + ", numeroTelefono=" + _numeroTelefono + ", nacido el año="
                + String.valueOf(this.anioNacimiento()) + "]";
    }
    
}