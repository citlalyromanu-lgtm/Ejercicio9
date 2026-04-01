package com.UPIIZ.Ejercicio9.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "jugadores")
public class JugadorE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String posicion;
    private int numero;

    public JugadorE() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
}