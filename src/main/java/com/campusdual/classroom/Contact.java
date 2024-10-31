//REPRESENTA= CONTACTO
// ,--> el contacto se guardara en el listin
// contacto= +nombre, apellidos1, apellido 2
//          +Nº telefono
//          +codigo genera automaticamente

// 2º codigo debe tener :
/*      Todo en minuscula
        sin signos diacriticos
        Si el contacto tiene solo 1 apellido--> apellido en minuscula
        Si el contacto tiene mas de 1 apellido -->
            - La primera letra del primer apellido (o primera parte del apellido)
            - El resto de las letras del subsiguiente apellido (o del mismo apellido compuesto) sin espacios
* */



package com.campusdual.classroom;


import java.text.Normalizer;

public class Contact implements ICallActions {
    public String name;
    public String surnames;
    public String phone;
    public String code;

    public Contact(String name, String surnames, String phone) {
        this.name = name;
        this.surnames = surnames;
        this.phone = phone;
            // llamamos a generar codigo
            // automaticamente cada que creemos un nuevo elemento
        this.code = createCode();


    }
    //1º NORMALIZAR EL TEXTO: convertirlos a minuscula
    private static String normalizarTexto(String texto){
        texto= texto.toLowerCase(); // convertir a minuscula
        texto= Normalizer.normalize(texto,Normalizer.Form.NFD); //Normalizer para eliminar diacríticos
        texto=texto.replaceAll("\\p{InCOMBINING_DIACRITICAL_MARKS}+", ""); // eliminar combinaciones
        return texto;
    }
    //generar codigo y que se asigne a el contacto
    public String createCode(){
            //llamamos texto a minuscula y eliminar diacriticos
        String apellidosNormalizados = normalizarTexto(this.surnames);
            //Separar los apellidos por espacio
        String[] partesApellidos = apellidosNormalizados.split(" ");
        if(partesApellidos.length == 1){

            return partesApellidos[0];
        }else{ // Mas de un apellido o compuesto
            String primerApellido = partesApellidos[0];
            String segundoApellido = partesApellidos[1];

            return primerApellido.charAt(0) + segundoApellido;
        }

    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
