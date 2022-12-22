package com.company;

// Ejercicio tema 9 - Herencia

public class Main {
    public static void main(String[] args){

        // Objeto cliente
        Cliente cliente = new Cliente();
        cliente.nombre = "Anderson";
        cliente.edad = 29;
        cliente.telefono = "000-000-0000";
        cliente.credito = 5000f;
        System.out.println("Datos del cliente");
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Telefono del cliente: " + cliente.telefono);
        System.out.println("Crédito del cliente: " + cliente.credito);

        // Objeto Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "José";
        trabajador.edad = 29;
        trabajador.telefono = "000-000-0000";
        trabajador.salario = 70000f;
        System.out.println("\nDatos del trabajador");
        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad del trabajador: " + trabajador.edad);
        System.out.println("Telefono del trabajador: " + trabajador.telefono);
        System.out.println("Salario del trabajador: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    float credito;
}

class Trabajador extends Persona {
    float salario;
}
