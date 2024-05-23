package org.example.main.model;

public class Cuenta {
    private final String numeroCuenta;
    protected static double saldo;

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

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +

                '}';
    }
}
