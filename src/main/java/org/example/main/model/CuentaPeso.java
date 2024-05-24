package org.example.main.model;

public class CuentaPeso extends Cuenta{
    private double montoDeposito;
    private double montoRetiro;

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
