package com.campusdual.classroom;


import java.util.HashMap;
import java.util.Map;

public class Exercise26 {
    public static void main(String[] args) {
        System.out.println("Ceamos el mapa: ");


        Contact contacto1 = new Contact("Marcelo","López Peña","607351896");
        Contact contacto2 = new Contact("¿conoces a conocelo? ","agachate marcelo","123456789");

        System.out.println("Codigo del contacto 1: " + contacto1.getCode());
        System.out.println("Codigo del contacto 2: " + contacto2.getCode());


    }
}
