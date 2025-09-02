package practico2;

import java.util.Scanner;


public class Punto11 {
    static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void ejecutar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio);
    }
     public static void calcularDescuentoEspecial(double precio) {
        // Variable local para almacenar descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
     public static void main(String[] args) {
        ejecutar();
    }
}
