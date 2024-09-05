package com.alexandre;

public class Conveniencia {
    private String estado;
    private Double faturamento;

    public Conveniencia(String estado, Double faturamento) {
        this.estado = estado;
        this.faturamento = faturamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }
}
