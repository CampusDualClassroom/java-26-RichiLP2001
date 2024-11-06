package com.campusdual.classroom;


import javax.management.openmbean.CompositeType;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class Exercise26 {
    public static void main(String[] args) {
//        System.out.println("Creamos el nuestro Phonebook(mi telefono): ");
        Phonebook miTelefono = new Phonebook();
            //creo que mi propio contacto
        Contact Yo = new Contact("Ricardo","Los Apellidos","123455543232");
            //me llamo a mi mismo.
        Yo.callMyNumber();


        System.out.println("\nAgregamos un contacto a nuestro Phonebook: ....");

            Contact contacto1 = new Contact("Javier","López","607351896");
            Contact contacto2 = new Contact("Carlos","Fernandez-Simón","12345678");
            Contact contacto3 = new Contact("Jose Manuel","Soria","23123123123");
            Contact contacto4 = new Contact("Santiago","Fernández Rocha","444444444444");
            Contact contacto5 = new Contact("Esteban","Serrano del Río","123455678");
            Contact contacto6 = new Contact("Fernando Miguel","Juan de los Santos Requejo León","123455678");

        System.out.println("Imprimimos todos los contactos a agregar: \n===================\n");
            //imprimimos a los contactos-->
            contacto1.showContactDetails();
            contacto2.showContactDetails();
            contacto3.showContactDetails();
            contacto4.showContactDetails();
            contacto5.showContactDetails();
            contacto6.showContactDetails();
            //añadimos a los contactos-->
            miTelefono.addContact(contacto1);
            miTelefono.addContact(contacto2);
            miTelefono.addContact(contacto3);
            miTelefono.addContact(contacto4);
            miTelefono.addContact(contacto5);
            miTelefono.addContact(contacto6);
//
//        miTelefono.addContact(contacto1.getCode(),contacto1);
//        miTelefono.addContact(contacto2.getCode(),contacto2);
//        miTelefono.addContact(contacto3.getCode(),contacto3);
//        miTelefono.addContact(contacto4.getCode(),contacto4);
//        miTelefono.addContact(contactoSinApellido.getCode(),contactoSinApellido);
//
        System.out.println("\nImprimimos nuestra lista de contactos: \n");
            miTelefono.showPhonebook();
        System.out.println("Abrir menu del contacto: ");
            miTelefono.menuContact(contacto3);
//
//        System.out.println("lista despues de eleccion en contacto");
//            miTelefono.showPhonebook();

        /* *Seleccionar un contacto y mostrar su menú de acciones* */










    }
}
