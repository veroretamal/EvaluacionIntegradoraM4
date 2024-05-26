package org.example.vista;
import org.example.main.service.ServiceCtaPeso;
import java.util.Scanner;
import static org.example.main.service.ServiceConversorMoneda.convertirDivisas;
import static org.example.main.service.ServiceCtaPeso.*;

public class MenuAlkeWallet {
    public static void menu() {

        //menú para la consola en el cual se ingresan las opciones solicitadas
        String menu = """
                *****************************************************
                ** 1- Ver mi saldo                                 **
                ** 2- Realizar deposito                            **
                ** 3- Retirar fondos                               **
                ** 4- Conversor de divisas
                ** 0- Salir                                        **
                *****************************************************""";
        System.out.println(menu);
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        switch (option) {
            case 1:
                ServiceCtaPeso.consultaSaldo();
                menu();
                break;
            case 2:
            System.out.println("Ingrese el monto a depositar:");
            double montoDeposito = sc.nextDouble();
            if (ServiceCtaPeso.depositar(montoDeposito)) {
                System.out.println("Depósito realizado con éxito");
            } else {
                System.out.println("No se pudo realizar el depósito");
            }
            menu();
            break;
            case 3:
                System.out.println("Ingrese el monto a retirar:");
                double montoRetiro = sc.nextDouble();
                if (ServiceCtaPeso.retirar(montoRetiro)) {
                    System.out.println("Retiro realizado con éxito");
                } else {
                    System.out.println("No se pudo realizar el retiro");
                }
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
