package org.example.main.service;

import org.example.main.model.Cuenta;

public class ServiceCuenta extends Cuenta {


    public ServiceCuenta(String numeroCuenta) {
        super(numeroCuenta);
    }

    public static double consultaSaldo(String cuenta, double saldo){
        System.out.println("Su saldo actual es de "+ saldo);
        return saldo;
    }
      public static boolean retirar(String cuenta, double saldo, double monto) {
            if (saldo < monto) {
            System.out.println("monto supera el saldo");
            return false;
        }
        saldo -= monto;
        System.out.println("Transacción exitosa");
        return true;
    }
    public static boolean depositar(String cuenta, double saldo, double monto) {
        saldo = saldo + monto;
       System.out.println("Transacción exitosa");
       return true;
    }


}
