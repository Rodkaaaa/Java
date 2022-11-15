package com.generation.firstproject.models;

public class Autor {
    int _id;
    String _nombre,_apellido;
    
    public Autor() {
    }

    public Autor(int _id, String _nombre, String _apellido) {
        this._id = _id;
        this._nombre = _nombre;
        this._apellido = _apellido;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_apellido() {
        return _apellido;
    }

    public void set_apellido(String _apellido) {
        this._apellido = _apellido;
    }

    @Override
    public String toString() {
        return "Autor [_id=" + _id + ", _nombre=" + _nombre + ", _apellido=" + _apellido + "]";
    }
    
}
