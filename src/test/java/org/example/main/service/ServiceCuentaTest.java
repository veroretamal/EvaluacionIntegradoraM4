package org.example.main.service;

import org.example.main.model.Cuenta;
import static org.junit.Assert.assertEquals;

public class ServiceCuentaTest{
    Cuenta cuenta = new Cuenta("010016008");

@org.junit.Test
    public void depositar(){

    double inicial = cuenta.getSaldo();
    double monto = 1000000;
    ServiceCuenta.depositar(cuenta, monto);
    double termino = cuenta.getSaldo();
    assertEquals(inicial, termino, monto);
    }

    @org.junit.Test
    public void retiro() {
        double monto = 1000000;
        ServiceCuenta.depositar(cuenta, monto);
        double inicial = cuenta.getSaldo();
        ServiceCuenta.retirar(cuenta, 500000);
        double termino = cuenta.getSaldo();
        assertEquals(inicial, termino, 500000);
    }




}