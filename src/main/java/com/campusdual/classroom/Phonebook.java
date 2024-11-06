//Contendra un Mapa <String,Contact>--> ALMACEN DE CONTACTOS
// CLAVE=codigo de contacto - VALOR= el propio contacto
//2º DEBE POSEER UN MENU:
//  a). Añadir un contacto al listín telefónico
//  b). Mostrar los contactos del listín telefónico
//  c). Seleccionar un contacto y mostrar su menú de acciones
//  d). Eliminar un contacto

package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.HashMap;
import java.util.Map;

public class Phonebook implements ICallActions {
    private Map<String, Contact> data = new HashMap<>();


    //CONSTRUCTOR
    public Phonebook(){}

    public Contact addContact(Contact nuevoContacto){
        this.data.put(nuevoContacto.getCode(),nuevoContacto);
        return nuevoContacto;
    }

    public void deleteContact (String keyContact){
        this.data.remove(keyContact);

    }



    public void menuContact(Contact elContacto){
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
                    deleteContact(elContacto.getCode());
                    break;
                case 2:
                    System.out.println("Opcion elegida: 2). Info. de contacto:\n");
                    elContacto.showContactDetails();
                    break;
                case 3:
                    System.out.println("Opcion elegida: 3). Llamar contacto...");
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
        for(Map.Entry<String,Contact> entrada : this.data.entrySet()){
            Contact alguien= entrada.getValue();
            alguien.showContactDetails();
        }
    }


        //metodo para acceder al mapa desde otra clase-->
    public Map<String, Contact> getData() {
        return this.data;
    }

    public void setData(Map<String, Contact> data) {
        this.data = data;
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
