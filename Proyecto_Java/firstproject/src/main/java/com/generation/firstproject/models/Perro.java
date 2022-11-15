package com.generation.firstproject.models;

public class Perro {
    private int id;
    private String nombre;
    private String pelaje;
    private String raza;
    private Boolean vacunado;

    public Perro() {
    }
    public Perro(int id, String nombre, String pelaje, String raza, Boolean vacunado) {
        this.id = id;
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = vacunado;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPelaje() {
        return pelaje;
    }
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Boolean getVacunado() {
        return vacunado;
    }
    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }
    public void ladrar(){
        System.out.println("Woof");
        }
    public void caminar() {
        System.out.println("caminar");
    }
    public String truco(String tipoTruco){
        if(tipoTruco == "da la pata"){
            return "doy la pata";
        }
        return "no hago nada :c";
    }
    public Boolean adopcion(){
        try {
            if(this.vacunado){
                return true;
            }
            return false;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
    @Override
    public String toString() {
        return "Perro [id=" + id + ", nombre=" + nombre + ", pelaje=" + pelaje + ", raza=" + raza + ", vacunado="
                + vacunado + "]";
    }
}
