
package ej1;

public class ej1 {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Agust�n Hurtado", "12345678");

        // Crear pasaporte con su foto (la composici�n ocurre aqu�)
        Pasaporte pasaporte = new Pasaporte("ARG-12345", "05/12/2025", "fotodeperfil.jpg", "jpg");
        titular.setPasaporte(pasaporte);

        // Mostrar informaci�n pasaporte
        System.out.println("Pasaporte:");
        System.out.println(pasaporte);

        // Mostrar informaci�n titular
        System.out.println("Titular:");
        System.out.println(titular);

    }
    
}
