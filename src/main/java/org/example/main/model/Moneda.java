package org.example.main.model;

public class Moneda implements Conversor {
    private String nombreDivisa;
    private double tasaDivisa;
    private String codigoDivisa;

    public Moneda(String nombreDivisa, double tasaDivisa, String codigoDivisa) {

    }

    public String getNombreDivisa() {
        return nombreDivisa;
    }

    public void setNombreDivisa(String nombreDivisa) {
        this.nombreDivisa = nombreDivisa;
    }

    public double getTasaDivisa() {
        return tasaDivisa;
    }

    public void setTasaDivisa(double tasaDivisa) {
        this.tasaDivisa = tasaDivisa;
    }

    public String getCodigoDivisa() {
        return codigoDivisa;
    }

    public void setCodigoDivisa(String codigoDivisa) {
        this.codigoDivisa = codigoDivisa;
    }


    @Override
    public String toString() {
        return "Moneda{" +
                "nombreDivisa='" + nombreDivisa + '\'' +
                ", tasaDivisa=" + tasaDivisa +
                ", codigoDivisa='" + codigoDivisa + '\'' +
                '}';
    }
}
