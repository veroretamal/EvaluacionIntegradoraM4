package org.example.main.model;

public class Cuenta {
    //se definen los atributos correspondientes a Cuenta
    private final String numeroCuenta;
    protected static double saldo;
//constructor y getters/setters
    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo=0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//toString
    @Override
    public String toString() {
        return STR."Cuenta{numeroCuenta='\{numeroCuenta}\{'\''}, saldo=\{saldo}\{'}'}";
    }
}
