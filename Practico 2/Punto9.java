
package practico2;

import java.util.Scanner;


public class Punto9 {
    public static void ejecutar() {
        Scanner input = new Scanner(System.in);
        
        double peso, precio, costoEnvio, totalCompra;
        String zona;

        System.out.print("Ingresa el precio del paquete: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingresa el peso del paquete: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingresa la zona de envío del paquete (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        totalCompra = calcularTotalCompra(precio, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
    }
    static double calcularCostoEnvio(double peso, String zona){
        
        if (zona.equalsIgnoreCase("Nacional")) {
            return 5 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10 * peso;
        } else {
            System.out.println("Zona de envío no válida. Se asume costo 0.");
            return 0;
        }   
    }
    static double calcularTotalCompra(double precio, double costoEnvio){
        return precio + costoEnvio;
    }
     public static void main(String[] args) {
        ejecutar();
    }
}
