package org.example.main;
import org.example.main.model.Cliente;
import org.example.main.model.Cuenta;
import org.example.main.service.ServiceCliente;
import org.example.main.service.ServiceCtaPeso;
import org.example.vista.MenuAlkeWallet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class AlkeBanco {
//    AlkeBanco cumple la función de Main en la que se instancian dos cuentas y dos clientes y se completan las listas "cuentas" y "clientes"
//    pero para la ejecución del menú no se diferenciara por tipo de cuenta y sólo se simulara las operaciones
    public static void main(String[] args) {
        Cliente cliente1= new Cliente( "Verónica", "Retamal", 160089628);
        Cliente cliente2= new Cliente("Cecilia", "Arriagada", 171191739);
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

        //se llama al metodo menu()
        MenuAlkeWallet.menu();


    }



}
