package org.example.main.service;
import org.example.main.model.Cuenta;

public class ServiceCuenta {


    public static double consultaSaldo(Cuenta cuenta, double saldo){
        System.out.println("Su saldo actual es de "+ cuenta.getSaldo());
        return saldo;
    }

    public static boolean depositar(Cuenta cuenta, double monto) {
        cuenta.setSaldo (cuenta.getSaldo()+ monto);
        System.out.println("Transacción exitosa, su saldo actual es de "+ cuenta.getSaldo() + "CLP");
        return true;
    }

    public static boolean retirar(Cuenta cuenta, double monto) {
        if(cuenta.getSaldo() < monto) {
            System.out.println("Su saldo actual no permite ejecutar esta opción");
            return false;
        }
        cuenta.setSaldo(cuenta.getSaldo() - monto);
        System.out.println("Transacción exitosa. Su nuevo saldo es de "+ cuenta.getSaldo() +"CLP" );
        return true;

    }
}
