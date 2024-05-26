package org.example.main.service;

import org.example.main.model.Cuenta;
import org.example.main.model.CuentaPeso;

public class ServiceCtaPeso extends CuentaPeso {
//Esta clase extiende las caracteristicas de Cuenta Peso para realizar las operaciones solicitadas en consola
    public ServiceCtaPeso(String numeroCuenta) {
        super(numeroCuenta);
    }

    public static double consultaSaldo(){ //Imprime el saldo actual del cliente
        System.out.println("Su saldo actual es de "+ saldo);
        return saldo;
    }
      public static boolean retirar(double montoRetiro) { //metodo para realizar retiro dependerá del saldo
            if (saldo < montoRetiro) {
            System.out.println("monto supera el saldo"); //si este es mayor al saldo disponible retorna false
            return false;
        }
        saldo -= montoRetiro;
        System.out.println("Transacción exitosa"); //de otro modo retorna true
        return true;
    }
    public static boolean depositar(double montoDeposito) { //depositar no tiene restricciones por lo que se suma el valor al saldo
        saldo = saldo + montoDeposito;
       System.out.println("Transacción exitosa"); //y retornará true sin restricciones.
       return true;
    }


}
