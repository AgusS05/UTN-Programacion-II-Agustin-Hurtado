
package ej5;

import ej1.*;


public class ej5 {

    public static void main(String[] args) {
        // Crear propietario
        Propietario propietario = new Propietario("Agustín Hurtado", "42217919");

        // Crear computadora con su placa madre (composición)
        Computadora pc = new Computadora("Asus", "AB231", "PlacaMadre123", "Intel I7");

        // Asociar bidireccionalmente propietario y computadora
        propietario.setComputadora(pc);

        // Mostrar información computadora
        System.out.println("Computadora:");
        System.out.println(pc);

        // Mostrar información propietario
        System.out.println("\nPropietario:");
        System.out.println(propietario);
    }
    
}
