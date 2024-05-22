package org.example.main.service;
import org.example.main.model.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ServiceCliente {

    private Map<Integer, Cliente> clientes; //se genera un Mapa para agrupar la información asociada a los clientes de la clase Cliente

    public ServiceCliente() {
        this.clientes = new HashMap<Integer, Cliente>();
    }

    public String crearCliente(Cliente cliente) { //se define metodo crearCliente
        if(cliente == null) {
            return "Error, datos inválidos. Verificar cliente";
        }
        clientes.put(cliente.getRut(), cliente);
        return "Cliente creado con éxito";
    }

    public Map<Integer, Cliente> leerClientes() { //se define metodo leerCliente
        return this.clientes;
    }

    public String actualizarCliente(Cliente cliente) { //se define metodo actualizarCliente
        if(cliente == null) {
            return "Actualización fallida, verifique cliente";
        }
        clientes.put(cliente.getRut(), cliente);
        return "Cliente actualizado";
    }

    public String eliminarCliente(Cliente cliente) {  // y metodo eliminar cliente
        if(cliente == null) {
            return "Eliminación fallida, verifique cliente";
        }
        clientes.remove(cliente.getRut());
        return "Cliente eliminado";
    }
}
