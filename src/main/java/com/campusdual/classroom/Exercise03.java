package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    // : Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.

    public static String greetings(String name) {
        return "Hola. Bienvenido " + name;
    }

    // Esto es una funcion, ya que devuelve un valor
    // : Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro

    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    // : Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()

    public static void checkUser(String user, String pass) {

        String validUser = "Sebas";
        String validPass = "sebas01";
        if (validUser.equals(user) && validPass.equals(pass)){
            System.out.println( greetings(user));
        }else{
            System.out.println(error(validUser));
        }
    }
    public static void main(String[] args) {

        checkUser("Sebas","sebas01");
        checkUser("marisol","sol");

    }
}
