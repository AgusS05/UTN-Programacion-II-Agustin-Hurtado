
package ej5;

import ej1.*;


public class ej5 {

    public static void main(String[] args) {
        // Crear propietario
        Propietario propietario = new Propietario("Agust�n Hurtado", "42217919");

        // Crear computadora con su placa madre (composici�n)
        Computadora pc = new Computadora("Asus", "AB231", "PlacaMadre123", "Intel I7");

        // Asociar bidireccionalmente propietario y computadora
        propietario.setComputadora(pc);

        // Mostrar informaci�n computadora
        System.out.println("Computadora:");
        System.out.println(pc);

        // Mostrar informaci�n propietario
        System.out.println("\nPropietario:");
        System.out.println(propietario);
    }
    
}
