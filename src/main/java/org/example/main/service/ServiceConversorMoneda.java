package org.example.main.service;

import org.example.main.model.Conversor;
import org.example.main.model.Moneda;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ServiceConversorMoneda implements Conversor {
    public static void convertirDivisas(){
        List<Moneda> monedas= new ArrayList<>();
        monedas.add(peso);
        monedas.add(dolar);
        monedas.add(euro);
        monedas.add(yen);
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese moneda base");
            String base = sc.next().toUpperCase();
            System.out.println("Ingrese monto");
            double monto = sc.nextDouble();
            System.out.println("Ingrese moneda destino");
            String destino = sc.next().toUpperCase();

            Moneda monedaBase = null;
            Moneda monedaDestino = null;
            for(Moneda moneda : monedas) {
                if(moneda.getCodigoDivisa().equals(base)) {
                    monedaBase = moneda;
                }
                if(destino.equals(moneda.getCodigoDivisa())) {
                    monedaDestino = moneda;
                }
            }
            if(monedaBase == null || monedaDestino == null) {
                throw new Exception("Ingresa una moneda válida");
            }
            System.out.println("Moneda base " + monedaBase.getCodigoDivisa());
            System.out.println("Moneda destino " + monedaDestino.getCodigoDivisa());
            System.out.printf("Monto base: %.2f\nMonto destino: %.2f", monto, (monto*monedaDestino.getTasaDivisa()/monedaBase.getTasaDivisa()));

        } catch (InputMismatchException e) {
            System.err.println("Ingresa un número válido");
            convertirDivisas();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            convertirDivisas();
        }
    }
}
