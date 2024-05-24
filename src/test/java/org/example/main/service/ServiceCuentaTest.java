package org.example.main.service;

import org.example.main.model.Cuenta;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ServiceCuentaTest {
    Cuenta cuenta;

    @Test
    public void depositar() {
        // Se crea una cuenta con saldo inicial de 0
        cuenta = new Cuenta("010016008");
        double saldoInicial = cuenta.getSaldo();

        // Se deposita 100
        ServiceCtaPeso serviceCuenta = new ServiceCtaPeso("010016009");
        serviceCuenta.depositar(100);

        // Se verifica que el saldo aumenta correctamente
        assertEquals(saldoInicial + 100, cuenta.getSaldo(), 0);
    }


    @Test
    public void retiro() {
        // Establecer un saldo inicial suficiente para el retiro
        cuenta = new Cuenta("010016008");
        ServiceCtaPeso.depositar(200); // Saldo inicial de 200

        double saldoInicial = cuenta.getSaldo();
        ServiceCtaPeso.retirar(100);

        assertEquals(saldoInicial - 100, cuenta.getSaldo(), 0);
    }
}
