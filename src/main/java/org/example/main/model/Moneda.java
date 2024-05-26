package org.example.main.model;

import java.util.ArrayList;
import java.util.List;

public class Moneda {

    //para desarrollar el convertidor de Monedas se definen los atributos para las monedas a convertir
    private String nombreDivisa;
    private double tasaDivisa;
    private String codigoDivisa;

    //constructores y getters/setters
    public Moneda(String nombreDivisa, double tasaDivisa, String codigoDivisa) {
        this.nombreDivisa = nombreDivisa;
        this.tasaDivisa = tasaDivisa;
        this.codigoDivisa = codigoDivisa;
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

    //toString

    @Override
    public String toString() {
        return "Moneda{" +
                "nombreDivisa='" + nombreDivisa + '\'' +
                ", tasaDivisa=" + tasaDivisa +
                ", codigoDivisa='" + codigoDivisa + '\'' +
                '}';
    }
}
