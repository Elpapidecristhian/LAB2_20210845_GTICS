package com.example.demo.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "seguro")
public class Seguro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro")
    private Integer idseguro;

    @Column(name = "empresa_aseguradora")
    private String empresaAseguradora;

    @Column(name = "cobertura_max")
    private Double coberturaMax;

    @Column(name = "tarifa")
    private Double tarifa;

    // Getters y Setters
    public Integer getIdseguro() { return idseguro; }
    public void setIdseguro(Integer idseguro) { this.idseguro = idseguro; }

    public String getEmpresaAseguradora() { return empresaAseguradora; }
    public void setEmpresaAseguradora(String empresaAseguradora) { this.empresaAseguradora = empresaAseguradora; }

    public Double getCoberturaMax() { return coberturaMax; }
    public void setCoberturaMax(Double coberturaMax) { this.coberturaMax = coberturaMax; }

    public Double getTarifa() { return tarifa; }
    public void setTarifa(Double tarifa) { this.tarifa = tarifa; }
}
