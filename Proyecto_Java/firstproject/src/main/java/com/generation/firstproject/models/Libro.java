package com.generation.firstproject.models;

public class Libro extends Autor {
    int _idLibro, _serial;
    String _titulo;
    Autor _autor;
    
    public Libro() {
        super();
    }
    

    /* public Libro(int _id, String _nombre, String _apellido, int _idLibro, int serial, String _titulo {
        super(_id, _nombre, _apellido);
        _id = _idLibro;
        this._serial = serial;
        this._titulo = _titulo;

    } */

    public Libro(int _idLibro, int _serial, String _titulo, Autor _autor) {
        this._idLibro = _idLibro;
        this._serial = _serial;
        this._titulo = _titulo;
        this._autor = _autor;
    }


    public Libro(int _id, String _nombre, String _apellido, int _idLibro, int _serial, String _titulo, Autor _autor) {
        super(_id, _nombre, _apellido);
        this._idLibro = _idLibro;
        this._serial = _serial;
        this._titulo = _titulo;
        this._autor = _autor;
    }


    public int get_id() {
        return _id;
    }


    public void set_id(int _id) {
        this._id = _id;
    }
    public int getSerial() {
        return _serial;
    }
    public void setSerial(int serial) {
        this._serial = serial;
    }
    public String getTitulo() {
        return _titulo;
    }
    public void setTitulo(String titulo) {
        this._titulo = titulo;
    }
    
    public Autor get_autor() {
        return _autor;
    }

    public void set_autor(Autor _autor) {
        this._autor = _autor;
    }

    @Override
    public String toString() {
        return "Libro [_id=" + _id + ", serial=" + _serial + ", titulo=" + _titulo + ", autor=" + _autor + "]";
           /*  return "Libro [_id=" + _id + ", serial=" + _serial + ", titulo=" + _titulo + ", autor=" + super.toString() + "]"; */

    }

}
