package com.UPIIZ.Ejercicio9.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "entrenadores")
public class EntrenadorE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public EntrenadorE() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}