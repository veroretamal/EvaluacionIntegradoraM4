package org.example.main.service;

import org.example.main.model.Cuenta;
import org.example.main.model.CuentaPeso;

public class ServiceCtaPeso extends CuentaPeso {

    public ServiceCtaPeso(String numeroCuenta) {
        super(numeroCuenta);
    }

    public static double consultaSaldo(){
        System.out.println("Su saldo actual es de "+ saldo);
        return saldo;
    }
      public static boolean retirar(double montoRetiro) {
            if (saldo < montoRetiro) {
            System.out.println("monto supera el saldo");
            return false;
        }
        saldo -= montoRetiro;
        System.out.println("Transacción exitosa");
        return true;
    }
    public static boolean depositar(double montoDeposito) {
        saldo = saldo + montoDeposito;
       System.out.println("Transacción exitosa");
       return true;
    }


}
