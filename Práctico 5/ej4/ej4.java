
package ej4;


public class ej4 {
    public static void main(String[] args) {
        // Crear banco (puede existir sin tarjeta)
        Banco banco = new Banco("Banco Galicia", "20-12345678-3");

        // Crear cliente
        Cliente cliente = new Cliente("Agustín Hurtado", "12345677");

        // Crear tarjeta de crédito y asociarla al banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9800-5432", "10/27", banco);

        // Asociar bidireccionalmente tarjeta y cliente
        cliente.setTarjeta(tarjeta);

        // Mostrar información  tarjeta
        System.out.println("Tarjeta de Crédito:");
        System.out.println(tarjeta);

        // Mostrar información cliente
        System.out.println("\nCliente:");
        System.out.println(cliente);

        // Mostrar información del banco
        System.out.println("\nBanco:");
        System.out.println(banco);
    }
    
}
