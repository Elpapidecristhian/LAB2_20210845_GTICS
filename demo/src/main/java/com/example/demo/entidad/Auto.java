package com.example.demo.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto")
    private Integer idauto;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "color")
    private String color;

    @Column(name = "kilometraje")
    private Integer kilometraje;

    @Column(name = "sede_idsede")
    private Integer sedeIdsede;

    @Column(name = "costo_por_dia")
    private Double costoPorDia;

    // Getters y Setters
    public Integer getIdauto() { return idauto; }
    public void setIdauto(Integer idauto) { this.idauto = idauto; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Integer getKilometraje() { return kilometraje; }
    public void setKilometraje(Integer kilometraje) { this.kilometraje = kilometraje; }

    public Integer getSedeIdsede() { return sedeIdsede; }
    public void setSedeIdsede(Integer sedeIdsede) { this.sedeIdsede = sedeIdsede; }

    public Double getCostoPorDia() { return costoPorDia; }
    public void setCostoPorDia(Double costoPorDia) { this.costoPorDia = costoPorDia; }
}
