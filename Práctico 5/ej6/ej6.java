
package ej6;


public class ej6 {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Lucas Patone", "1122334455");

        // Crear mesa
        Mesa mesa = new Mesa(5, 4);

        // Crear reserva asociando cliente y mesa
        Reserva reserva = new Reserva("18/09/2025", "20:00", cliente, mesa);

        // Mostrar información  reserva
        System.out.println(" Reserva:");
        System.out.println(reserva);

        // Mostrar información del cliente
        System.out.println("\nInformación del Cliente:");
        System.out.println(cliente);

        // Mostrar información de la mesa
        System.out.println("\nInformación de la Mesa:");
        System.out.println(mesa);
    }
    
}
