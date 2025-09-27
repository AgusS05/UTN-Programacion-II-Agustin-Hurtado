
package ej1;

public class ej1 {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Agustín Hurtado", "12345678");

        // Crear pasaporte con su foto (la composición ocurre aquí­)
        Pasaporte pasaporte = new Pasaporte("ARG-12345", "05/12/2025", "fotodeperfil.jpg", "jpg");
        titular.setPasaporte(pasaporte);

        // Mostrar información pasaporte
        System.out.println("Pasaporte:");
        System.out.println(pasaporte);

        // Mostrar información titular
        System.out.println("Titular:");
        System.out.println(titular);

    }
    
}
