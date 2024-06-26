package org.example.main.service;

import org.example.main.model.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceClienteTest{
    //se realizan los test de los metodos definidos en ServiceCliente

    ServiceCliente serviceCliente = new ServiceCliente();
    Cliente cliente = new Cliente("Nelson", "Jaque", 128765271);

    @Test
    public void testActualizarCliente() {
        var resultado = serviceCliente.actualizarCliente(cliente);
        assertEquals(resultado, "Cliente actualizado");

    }

    @Test
    public void testEliminarCliente(){
        var resultado = serviceCliente.eliminarCliente(null);
        assertEquals(resultado, "Eliminación fallida, verifique cliente");
    }

}