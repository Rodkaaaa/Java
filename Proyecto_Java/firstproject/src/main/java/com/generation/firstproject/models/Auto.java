package com.generation.firstproject.models;

public class Auto {
    //datos a definir
    private float _rueda;
    private String _color, _patente, _forma, _luces;
    //constructor con parametros
    public Auto(float rueda, String color, String patente, String forma, String luces) {
        this._rueda = rueda;
        this._color = color;
        this._patente = patente;
        this._forma = forma;
        this._luces = luces;
    }
    //constructor sin definicion para poliformismo
    public Auto() {
    }
    //getter and setters
    public float getRueda() {
        return _rueda;
    }

    public void setRueda(float rueda) {
        this._rueda = rueda;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        this._color = color;
    }

    public String getPatente() {
        return _patente;
    }

    public void setPatente(String patente) {
        this._patente = patente;
    }

    public String getForma() {
        return _forma;
    }

    public void setForma(String forma) {
        this._forma = forma;
    }

    public String getLuces() {
        return _luces;
    }

    public void setLuces(String luces) {
        this._luces = luces;
    }

    /* funcion para ternar objeto */
    @Override
    public String toString() {
        return "Auto [rueda=" + _rueda + ", color=" + _color + ", patente=" + _patente + ", forma=" + _forma + ", luces="
                + _luces + "]";
    }

}
