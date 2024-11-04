package com.campusdual.classroom;


import javax.management.openmbean.CompositeType;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class Exercise26 {
    public static void main(String[] args) {
        System.out.println("Creamos el nuestro Phonebook(mi telefono): ");
            Phonebook miTelefono = new Phonebook("Ricardo","Lopez Peña","31313131313");

        System.out.println("Agregamos un contacto a nuestro Phonebook: ....");
            Contact contacto1 = new Contact("Marcelo","Gonzalez petro","607351896");
            Contact contacto2 = new Contact("luis","Burbano Nuñez","12345678");
            Contact contacto3 = new Contact("Cristian","Alban","23123123123");
            Contact contacto4 = new Contact("Valeria","Zuluaga","444444444444");



        System.out.println("... Contacto a agregar: " + "\n");
            contacto1.showContactDetails();
        miTelefono.addContact(contacto1.getCode(),contacto1);
        miTelefono.addContact(contacto2.getCode(),contacto2);
        miTelefono.addContact(contacto3.getCode(),contacto3);
        miTelefono.addContact(contacto4.getCode(),contacto4);

        System.out.println("\nImprimimos nuestra lista de contactos: \n");
            miTelefono.showPhonebook();
        System.out.println("Abrir menu del contacto: ");
            miTelefono.getData(contacto3);

        System.out.println("lista despues de eleccion en contacto");
            miTelefono.showPhonebook();

        /* *Seleccionar un contacto y mostrar su menú de acciones* */










    }
}
