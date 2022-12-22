package com.company;

/*
Ejercicios tema 3 - Funciones

Primera parte:

    1-Crear una función con tres parámetros que sean números que se suman entre sí.
    2-Llamar a la función en el main y darle valores.

Segunda parte:

    1-Crear una clase coche.
    2-Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    3-Una función que incremente el número de puertas que tiene el coche.
    4-Crear un objeto miCoche en el main y añadirle una puerta.
    5-Mostrar el número de puertas que tiene el objeto.
*/

public class Main {
    public static void main(String[] args){

        suma(1 ,5, 7);

        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c){
        System.out.println(a + b + c);
    }
}

class Coche {
    public int puertas = 4;
    public void AgregarPuertas() {
        this.puertas++;
    }
}
