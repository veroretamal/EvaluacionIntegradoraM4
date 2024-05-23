package org.example.main.service;

import org.example.main.model.Cuenta;
import static org.junit.Assert.assertEquals;

public class ServiceCuentaTest{
    Cuenta cuenta = new Cuenta("010016008");
    ServiceCuenta serviceCuenta= new ServiceCuenta("010016009");

@org.junit.Test
    public void depositar(){
    double inicial = cuenta.getSaldo();
    serviceCuenta.depositar("010016008", 100000);
    double termino = cuenta.getSaldo();
    assertEquals(inicial, termino);
    }

    @org.junit.Test
    public void retiro() {
    double inicial = cuenta.getSaldo();
    serviceCuenta.retirar("010016009", 500000);
    double termino = cuenta.getSaldo();
    assertEquals(inicial, termino, 500000);
    }




}