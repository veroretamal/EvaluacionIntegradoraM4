package org.example.main.service;

import org.example.main.model.Moneda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ServiceConversorMoneda extends Moneda{

    //en el caso de ServiceConversorMoneda es subclase de la Clase Moneda, para lo cual se llama a "super"
    public ServiceConversorMoneda(String nombreDivisa, double tasaDivisa, String codigoDivisa) {
        super(nombreDivisa, tasaDivisa, codigoDivisa);
    }
//se define el metodo convetirDivisas en el cual se inicializan las distintas monedas elegidas con sus atributos definidos en la clase Moneda
    public static void convertirDivisas(){
        Moneda peso = new Moneda("Chilean Peso", 1, "CLP");
        Moneda dolar = new Moneda("American Dollar", 0.001059, "USD");
        Moneda euro = new Moneda("Euro", 0.00098474, "EUR");
        Moneda yen = new Moneda("Japanese Yen", 0.1622, "JPY");
        List<Moneda> monedas = new ArrayList<>(); //se reunen en un ArrayList
        monedas.add(peso);
        monedas.add(dolar);
        monedas.add(euro);
        monedas.add(yen);
        try { //try para intentar realizar la conversión a través de la recepción de parametros a traves de la consola
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese moneda base"); //Se solicita al usuario que ingrese los datos.
            String base = sc.next().toUpperCase();
            System.out.println("Ingrese monto");
            double monto = sc.nextDouble();
            System.out.println("Ingrese moneda destino");
            String destino = sc.next().toUpperCase();
            Moneda monedaBase = null;
            Moneda monedaDestino = null;
            for(Moneda moneda : monedas) {  //Se itera para buscar que coincidan con los códigos de divisa ingresados.

                if(moneda.getCodigoDivisa().equals(base)) {
                    monedaBase = moneda;
                }
                if(destino.equals(moneda.getCodigoDivisa())) {
                    monedaDestino = moneda;
                }
            }
            if(monedaBase == null || monedaDestino == null) {   //en caso de ser null se lanza Excepcion
                throw new Exception("Ingresa una moneda válida");
            }
            System.out.println("Moneda base: " + monedaBase.getCodigoDivisa());
            System.out.println("Moneda destino: " + monedaDestino.getCodigoDivisa());
            System.out.printf("Monto base: %.2f %s\nMonto destino: %.2f %s\n", //Si se encuentran ambas monedas, se muestran los nombres de las monedas base y destino
                    monto, monedaBase.getCodigoDivisa(),
                    (monto * monedaDestino.getTasaDivisa() / monedaBase.getTasaDivisa()),
                    monedaDestino.getCodigoDivisa());

        } catch (InputMismatchException e) {
            System.err.println("Ingresa un número válido");
            convertirDivisas();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            convertirDivisas();
        }
    }
}
