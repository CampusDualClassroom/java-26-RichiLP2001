//Contendra un Mapa <String,Contact>--> ALMACEN DE CONTACTOS
// CLAVE=codigo de contacto - VALOR= el propio contacto
//2º DEBE POSEER UN MENU:
//  a). Añadir un contacto al listín telefónico
//  b). Mostrar los contactos del listín telefónico
//  c). Seleccionar un contacto y mostrar su menú de acciones
//  d). Eliminar un contacto

package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook extends Contact implements ICallActions {
    public Phonebook(String name, String surnames, String phone) {
        super(name, surnames, phone);
    }



    public static Map<String, Contact> createHashMap(){
        Map<String, Contact> Menu = new HashMap<>();
        return Menu;
    }
    public static Contact addContact(Map<String, Contact> map,
                                  String key, Contact nuevoContacto){
        map.put(key,nuevoContacto);
        return nuevoContacto;
    }

    public void getData(Contact){
        System.out.println("Nombre: " + this.name + " -Apellidos: " + this.surnames + " -Numero de telefono: " + this.phone );
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
