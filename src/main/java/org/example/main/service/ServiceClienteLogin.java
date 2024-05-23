package org.example.main.service;

import org.example.main.model.Cliente;

import java.nio.file.AccessDeniedException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ServiceClienteLogin {
    public class Login {
        static Cliente cliente= null;

        public static Cliente getCliente(List<Cliente> clientes){
            Scanner sc = new Scanner(System.in);
            try { //decido si es que denomino la excepcion o desarrollo un try catch
                System.out.println("Ingrese su rut");
                int rut = sc.nextInt(); //
                System.out.println("Ingrese su clave secreta de RedAlkeBank");
                String claveSecreta = sc.next();
                for (Cliente c : clientes) {//cliente por cliente corroborando si hay informacion que coincida
                    //System.out.println(c.getId());
                    if (c.getRut() == rut) {
                        if (c.getClaveSecreta().equals(claveSecreta)) {
                            cliente = c;
                        }
                    }
                }
                if (cliente == null) {
                    throw new AccessDeniedException("Datos incorrectos");
                }
                sc.close();
            } catch (AccessDeniedException | InputMismatchException e) { //colapsar dos catch
                System.out.println(e.getMessage()); //de no encontrar se va a la excepcion generica
                getCliente(clientes);
            } catch (Exception e) {
                System.out.println("Error desconocido");
            }
            return cliente;
        }
    }}
