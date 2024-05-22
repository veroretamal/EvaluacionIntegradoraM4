package org.example.main;
import org.example.main.model.Cliente;
import org.example.main.model.Cuenta;
import org.example.main.service.ServiceCliente;
import org.example.main.service.ServiceCuenta;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.example.vista.MenuAlkeWallet.menu;



public class AlkeBanco {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente( "Verónica", "Retamal", 160089628, "1600");
        Cliente cliente2= new Cliente("Cecilia", "Arriagada", 171191739, "1711");
        Cuenta cuentaCliente1= new Cuenta("010016008");
        Cuenta cuentaCliente2= new Cuenta("010016009");
        List<Cliente> clientes= new LinkedList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        List<Cuenta> cuentas= new ArrayList<>();
        cuentas.add(cuentaCliente1);
        cuentas.add(cuentaCliente2);
        cliente1.getCuentas().add(cuentaCliente1);
        cliente2.getCuentas().add(cuentaCliente2);

       // menu();


    }



}
