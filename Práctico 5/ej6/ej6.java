
package ej6;


public class ej6 {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Lucas Patone", "1122334455");

        // Crear mesa
        Mesa mesa = new Mesa(5, 4);

        // Crear reserva asociando cliente y mesa
        Reserva reserva = new Reserva("18/09/2025", "20:00", cliente, mesa);

        // Mostrar informaci�n  reserva
        System.out.println(" Reserva:");
        System.out.println(reserva);

        // Mostrar informaci�n del cliente
        System.out.println("\nInformaci�n del Cliente:");
        System.out.println(cliente);

        // Mostrar informaci�n de la mesa
        System.out.println("\nInformaci�n de la Mesa:");
        System.out.println(mesa);
    }
    
}
