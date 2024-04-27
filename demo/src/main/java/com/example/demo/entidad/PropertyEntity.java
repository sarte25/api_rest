package com.example.demo.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

@Entity
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true )
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "La ubicacion no puede estar vacio")
    private String ubicacion;

    @NotBlank(message = "La URL de la imagen no puede estar vacia")
    private String imageurl;


    private boolean disponibilidad;

    @NotNull(message = "El precio no puede ser nulo")
    @Positive(message = "El precio debe ser mayor a cero")
    private double precio;

    @NotNull(message = "La fecha de creacion no puede ser nulo")
    private LocalDateTime createdAt;

    public PropertyEntity() {

    }

    public PropertyEntity(long id, String nombre, String ubicacion, String imageurl, boolean disponibilidad, double precio, LocalDateTime createdAt) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.imageurl = imageurl;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getImageurl() {
        return imageurl;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


}
