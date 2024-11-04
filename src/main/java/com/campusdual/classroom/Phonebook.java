//Contendra un Mapa <String,Contact>--> ALMACEN DE CONTACTOS
// CLAVE=codigo de contacto - VALOR= el propio contacto
//2º DEBE POSEER UN MENU:
//  a). Añadir un contacto al listín telefónico
//  b). Mostrar los contactos del listín telefónico
//  c). Seleccionar un contacto y mostrar su menú de acciones
//  d). Eliminar un contacto

package com.campusdual.classroom;

import com.campusdual.util.Utils;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Phonebook extends Contact implements ICallActions {
    private Map<String, Contact> mapaDatos = new HashMap<>();

    public Phonebook(String name, String surnames, String phone) {
        super(name, surnames, phone);

    }

    public Contact addContact(String key, Contact nuevoContacto){
        this.mapaDatos.put(key,nuevoContacto);
        return nuevoContacto;
    }

    public Contact deleteContact (String key, Contact elContacto){
        this.mapaDatos.remove(key,elContacto);
        return elContacto;
    }

    public void getData (Contact elContacto){
        System.out.println("=======================\n" +
                "Opciones del contacto: " + elContacto.getName() +
                " -Telefono: " + elContacto.getPhone());
        System.out.println("\n1). Eliminar contacto. \n2). Info. de contacto. \n3). Llamar contacto.\n");
        int eleccion;
        do {
            eleccion=Utils.integer("Seleccione su opcion:...");

            switch (eleccion + 0) {
                case 1:
                    System.out.println("Opcion elegida: 1). Eliminar contacto: \n");
                    deleteContact(elContacto.getCode(), elContacto);
                    break;
                case 2:
                    System.out.println("Opcion elegida: 2). Info. de contacto:\n");
                    elContacto.showContactDetails();
                    break;
                case 3:
                    String phoneNumber = elContacto.getPhone();
                    callThisContact(elContacto);
                    callOtherNumber(phoneNumber);
                    break;
                default:
                    System.out.println("Opcion no valida...\nIntenta de nuevo: ");
                    break;
            }
        } while (!(eleccion>0 && eleccion<4));


    }

    public void showPhonebook(){
        System.out.println("Listin Telefonico: ");
        for(Map.Entry<String,Contact> entrada : this.mapaDatos.entrySet()){
            Contact alguien= entrada.getValue();
            alguien.showContactDetails();
        }
    }



        //metodo para acceder al mapa desde otra clase-->
    public Map<String, Contact> getMapaDatos() {
        return this.mapaDatos;
    }

    public void setMapaDatos(Map<String, Contact> mapaDatos) {
        this.mapaDatos = mapaDatos;
    }

    public void callThisContact(Contact elContacto){
        System.out.println("LLAMANDO al contacto: " + "\nNombre: " + elContacto.getName() + "\nNº telefono: " + elContacto.getPhone());

    }

    @Override
    public void callMyNumber() {


    }

    @Override
    public void callOtherNumber(String number) {

    }

    @Override
    public void showContactDetails() {


    }
}
