package practico2;

import java.util.Scanner;


public class Punto4 {
     public static void ejecutar() {
     double precio, descuento, descuentoFinal, precioFinal;
     char categoria;
     descuento = 0;
     Scanner input = new Scanner(System.in);
     
         System.out.print("Ingrese el precio del producto: ");
         precio = Double.parseDouble(input.nextLine());
         
          System.out.print("Ingrese la categoría del producto (A, B o C): ");
         categoria = input.next().toUpperCase().charAt(0);
         
         switch (categoria) {
             case 'A':
                 descuento = 0.10;
                 break;
             case 'B':
                 descuento = 0.15;
                 break;
             case 'C':
                 descuento = 0.20;
                 break;
             default:
                 System.out.println("Categoría no válida.");
                 System.exit(0);   
         }
     descuentoFinal = precio * descuento;
     precioFinal = precio - descuentoFinal;
     
         System.out.println("Precio original: " + precio);
         System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
         System.out.println("Precio final: " + precioFinal);

     }
     public static void main(String[] args) {
        ejecutar();
    }
}
