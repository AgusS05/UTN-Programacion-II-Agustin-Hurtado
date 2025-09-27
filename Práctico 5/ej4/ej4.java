
package ej4;


public class ej4 {
    public static void main(String[] args) {
        // Crear banco (puede existir sin tarjeta)
        Banco banco = new Banco("Banco Galicia", "20-12345678-3");

        // Crear cliente
        Cliente cliente = new Cliente("Agust�n Hurtado", "12345677");

        // Crear tarjeta de cr�dito y asociarla al banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9800-5432", "10/27", banco);

        // Asociar bidireccionalmente tarjeta y cliente
        cliente.setTarjeta(tarjeta);

        // Mostrar informaci�n  tarjeta
        System.out.println("Tarjeta de Cr�dito:");
        System.out.println(tarjeta);

        // Mostrar informaci�n cliente
        System.out.println("\nCliente:");
        System.out.println(cliente);

        // Mostrar informaci�n del banco
        System.out.println("\nBanco:");
        System.out.println(banco);
    }
    
}
