
package ej12;


public class ej12 {
    public static void main(String[] args) {
        // Crear contribuyente
        Contribuyente contribuyente = new Contribuyente("Agust�n Hurtado", "20-41212481-3");

        // Crear impuesto asociado al contribuyente
        Impuesto impuesto = new Impuesto(130.0, contribuyente);

        // Crear calculadora
        Calculadora calculadora = new Calculadora();

        // Usar la calculadora para calcular el impuesto
        calculadora.calcular(impuesto);

        // Mostrar informaci�n del impuesto
        System.out.println("\nInformaci�n del Impuesto:");
        System.out.println(impuesto);

        // Mostrar informaci�n del contribuyente
        System.out.println("\nInformaci�n del Contribuyente:");
        System.out.println(contribuyente);
    }
    
}
