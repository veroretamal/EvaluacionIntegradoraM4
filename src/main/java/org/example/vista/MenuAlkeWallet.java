package org.example.vista;
import org.example.main.AlkeBanco;
import org.example.main.service.ServiceCuenta;
import java.util.Scanner;
import static org.example.main.service.ServiceConversorMoneda.convertirDivisas;
import static org.example.main.service.ServiceCuenta.*;

public class MenuAlkeWallet {
    public static void menu() {
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

        int option = leer.nextInt();
        switch (option) {
            case 1:
                consultaSaldo("010016008", 1000000);
                menu();
                break;
            case 2:
                retirar("010016008", 60000, 10);
                break;
            case 3:
                depositar("010016009", 1000, 15000);
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
