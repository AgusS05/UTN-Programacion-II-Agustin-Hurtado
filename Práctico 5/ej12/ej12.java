
package ej12;


public class ej12 {
    public static void main(String[] args) {
        // Crear contribuyente
        Contribuyente contribuyente = new Contribuyente("Agustín Hurtado", "20-41212481-3");

        // Crear impuesto asociado al contribuyente
        Impuesto impuesto = new Impuesto(130.0, contribuyente);

        // Crear calculadora
        Calculadora calculadora = new Calculadora();

        // Usar la calculadora para calcular el impuesto
        calculadora.calcular(impuesto);

        // Mostrar información del impuesto
        System.out.println("\nInformación del Impuesto:");
        System.out.println(impuesto);

        // Mostrar información del contribuyente
        System.out.println("\nInformación del Contribuyente:");
        System.out.println(contribuyente);
    }
    
}
