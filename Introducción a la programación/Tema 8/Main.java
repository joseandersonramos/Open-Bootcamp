package com.company;

/*
Ejercicios tema 8 - Encapsulación

Para practicar la encapsulación:

    -Crear clase Persona.
    -Crear las variables privadas edad, nombre y telefono de la clase Persona.
    -Crear gets y sets de cada propiedad.
    -Crear un objeto persona en el main.
    -Utiliza los gets y sets para darle valores a las propiedades edad, nombre
     y telefono, por último muéstralas por consola.
*/

public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad(29);
        persona.setNombre("Anderson");
        persona.setTelefono("000-000-0000");
        System.out.println("El nombre de la persona es: " + persona.getNombre());
        System.out.println("La edad de la persona es: " + persona.getEdad());
        System.out.println("El telefono de la persona es: " + persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}
