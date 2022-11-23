package com.generation.generation1.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "BuySell")
public class BuySell {
    @Id
    @GeneratedValue
    private Integer id;
    @Range(min = 0)// determinar el minimo de un numero que se ingrese
    private int monto;
    @DateTimeFormat(pattern = "yyyy-MM=dd") //dar formato a fecha
    private Date fechaCompra;

    //recepcionando referencia one to many
    /* @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)// cuando se recive una relacion many to one es lazy
    @JoinColumn(name = "user_id")
    private User user;
 */

    //recepcionar One to many (many to one)
 
    //cuando se recibe una relacion many to one el fetch type es con LAZY
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    //many to many de auto
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name="carSell",
        joinColumns = @JoinColumn(name="buySell_id"),
        inverseJoinColumns = @JoinColumn(name="car_id")
    )
    private List <CarSell>  carSells;

    public BuySell() {
    }

    public BuySell(Integer id, @Range(min = 0) int monto, Date fechaCompra, User user) {
        this.id = id;
        this.monto = monto;
        this.fechaCompra = fechaCompra;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    
}
