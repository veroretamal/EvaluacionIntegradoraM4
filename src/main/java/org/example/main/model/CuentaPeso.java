package org.example.main.model;

public class CuentaPeso extends Cuenta{
    //la CuentaPeso se define como subclase de la clase Cuenta y
// sus atributos corresponden a los relacionados con los metodos depositar y retirar
    private double montoDeposito;
    private double montoRetiro;

    //constructor y getters/setters
    public CuentaPeso(String numeroCuenta) {
        super(numeroCuenta);
        this.montoDeposito = montoDeposito;
        this.montoRetiro= montoRetiro;
    }

    public double getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(double montoDeposito) {
        this.montoDeposito = montoDeposito;
    }

    public double getMontoRetiro() {
        return montoRetiro;
    }

    public void setMontoRetiro(double montoRetiro) {
        this.montoRetiro = montoRetiro;
    }
}
