
package ej10;

public class ej10 {
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Agust�n Hurtado", "12345678");

        // Crear cuenta bancaria con clave de seguridad y fecha de �ltima modificaci�n como String
        CuentaBancaria cuenta = new CuentaBancaria("CBU-123454668", 3000000.0, "5983", "16/09/2025");

        // Asociar bidireccionalmente titular y cuenta
        titular.setCuenta(cuenta);

        // Mostrar informaci�n de la cuenta bancaria
        System.out.println("Cuenta Bancaria:");
        System.out.println(cuenta);

        // Mostrar informaci�n titular
        System.out.println("\nTitular:");
        System.out.println(titular);
    }
    
}
