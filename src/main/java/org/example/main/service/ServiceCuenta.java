package org.example.main.service;
import org.example.main.model.Cuenta;

public class ServiceCuenta {


    public static double consultaSaldo(Cuenta cuenta, double saldo){
       return saldo;
    }

    public static boolean deposito(Cuenta cuenta, double monto) {
        cuenta.setSaldo (cuenta.getSaldo()+ monto);
        return true;
    }

    public static boolean retiro(Cuenta cuenta, double monto) {
        if(cuenta.getSaldo() < monto) {
            System.out.println("Fondos insuficientes");
            return false;
        }
        cuenta.setSaldo(cuenta.getSaldo() - monto);
        return true;
    }


}
