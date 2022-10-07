package Empresa.emtities;

import java.util.Date;

public class HorasContrato {

    private Date data;
    private Double valorPorHora;
    private Integer horas;

    public HorasContrato() {
    }

    public HorasContrato(Date data, Double valorPorHora, Integer horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal(){
        return  valorPorHora * horas;
    }
}
