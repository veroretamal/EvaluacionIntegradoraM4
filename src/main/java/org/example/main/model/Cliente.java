package org.example.main.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente { //se definen los atributos correspondientes a la clase Cliente
    private String nombre;
    private String apellido;
    private int rut;
   private List<Cuenta> cuentas;

    public Cliente(String nombre, String apellido, int rut) { //constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        cuentas = new ArrayList<Cuenta>();
    }

    public Cliente(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void addCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    //getters y setters de atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    //toString
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
