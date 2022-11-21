package com.generation.generation1.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "Car")
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    @Range(min = 0)
    private int valor;


    //many to many
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "carSell",//nombre tabla relacional
        joinColumns = @JoinColumn(name="car_id"),//nombre de la columna de mi tabla
        inverseJoinColumns = @JoinColumn(name= "buySell_id")// nombre de la clumna de la otra tabla
    )
    private List<CarSell> carSell;



    public Car() {
    }
    
    public Car(Integer id, String marca, String modelo, String color, int anio, int valor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }


    
}
