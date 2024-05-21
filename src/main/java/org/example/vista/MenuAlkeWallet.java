package org.example.vista;
import org.example.main.model.Cuenta;

import  java.util.Scanner;
import static org.example.main.service.ServiceConversorMoneda.convertirDivisas;
import static org.example.main.service.ServiceCuenta.*;

public class MenuAlkeWallet {

        public static void menu(){
        String bienvenida = """
                *****************************************************
                **          Bienvenido a tu AlkeWallet             **
                *****************************************************""";
        System.out.println(bienvenida);
        String menu = """
        *****************************************************
        ** 1- Ver mi saldo                                 **
        ** 2- Realizar deposito                            **
        ** 3- Retirar fondos                               **
        ** 4- Conversor de divisas
        ** 0- Salir                                        **
        *****************************************************""";
        System.out.println(menu);
        Scanner leer = new Scanner(System.in);

        int option= leer.nextInt();
        switch (option){
            case 1:
                //consultaSaldo();
                menu();
                break;
            case 2:
                //retiro();
                menu();
                break;
            case 3:
                //deposito();
                menu();
                break;
            case 4:
                convertirDivisas();
                menu();
                break;
            default:
                System.out.println("Has salido de tu AlkeWallet");
                menu();
        }
    }
}
