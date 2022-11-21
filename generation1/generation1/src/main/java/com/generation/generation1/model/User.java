package com.generation.generation1.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonBackReference;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Lazy;

@Entity(name = "User")
public class User {
    // especificar id
    @Id
    // especificar llave primaria
    @GeneratedValue
    // definir atributo id
    public int id;
    private String name;
    @Column(name = "last_name")//cambia el nombre del dato para la columna
    private String lastName;
    @Column(unique = true)// que el dato de abajo sea unico
    private String email;


    //relacion uno a uno
    //relacion uno a uno con la tabla licencia
    @JsonBackReference
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private License license;

  

    //relacion one to many
    //cuando se envia de uno a uno es lazy y de uno a mucho es eager
    //JsonBackReference cuando se envia el dato

    @JsonBackReference
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<BuySell> BuySell;
    
    public User() {
    }

    public User(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + "]";
    }

    

}
