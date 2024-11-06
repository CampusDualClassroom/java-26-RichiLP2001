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
    public String surname;
    public String phone;
    public String code;

    public Contact(String name, String surnames, String phone) {

        this.name = name;
        this.surname = surnames;
        this.phone = phone;
            // llamamos a generar codigo
            // automaticamente cada que creemos un nuevo elemento
        this.code = createCode();
    }
//    public Contact(String nameAndSurname, String phone) {
//
//        String[] partesApellidos = nameAndSurname.split(" ");
//
//        if (partesApellidos.length == 1) {
//            System.out.println("Es necesario poner un apellido... ");
//
//
//        } else {
//            String apellido1 = "";
//
//            for (int i = 1; i <= partesApellidos.length - 1; i++) {
//                apellido1 = apellido1 + partesApellidos[i] + " ";
//
//            }
//            this.phone = phone;
//            this.surname = apellido1;
//            this.name = partesApellidos[0];
//            this.code = createCode();
//        }
//    }




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
        String apellidoPrueba="";
        String nombreNormalizado =normalizarTexto(this.name);
            String primeraLetraNombre=nombreNormalizado.substring(0,1);

        String apellidosNormalizados = normalizarTexto(this.surname);
            //Separar los apellidos por espacio
        String[] partesApellidos = apellidosNormalizados.split(" ");
        if(partesApellidos.length == 1) {

            return primeraLetraNombre + partesApellidos[0];
        }
//        else if(partesApellidos.length==2){
//            // con 2 apellidos
//
//            String primerApellido = partesApellidos[0];
//            String segundoApellido = partesApellidos[1];
//
//            return primeraLetraNombre + primerApellido.charAt(0) + segundoApellido;
//        }
        else{
            String primerApellido = partesApellidos[0];
            for(int i=1;i <= partesApellidos.length-1; i++){
              apellidoPrueba= apellidoPrueba + partesApellidos[i];
            }
            return primeraLetraNombre + primerApellido.charAt(0) + apellidoPrueba;
        }
    }

    public String getSurnames() {
        return surname;
    }

    public void setSurnames(String surnames) {
        this.surname = surnames;
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
        System.out.println("Te estas llamando a ti mismo: "+"\nNombre: "  + this.name + " - surname: "+
        this.surname + " -telefono: " + this.phone);

    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println("Yo:  "+"\nNombre: "  + this.name + " - surname: "+
                this.surname + " -telefono: " + this.phone);
        System.out.println("Estoy llamando al siguiente contacto con el Nº de tel: "+ number);

    }

    @Override
    public void showContactDetails() {
        System.out.println("Nombre: " + this.name + " - surname: "+
                this.surname + " -telefono: " + this.phone +
                " -Codigo: " + this.code);

    }

}
