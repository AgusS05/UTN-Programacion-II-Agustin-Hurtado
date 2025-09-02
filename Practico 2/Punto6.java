package practico2;

import java.util.Scanner;

public class Punto6 {
     public static void ejecutar() {
         
         int num, positivos, negativos, ceros;
         positivos = 0;
         negativos = 0;
         ceros = 0;
         Scanner input = new Scanner(System.in);
         
         for (int i = 1; i < 11; i++) {
             System.out.print("Ingresa el número entero N°" + i + ": ");
             num = Integer.parseInt(input.nextLine());
             if (num < 0) {
                 negativos = negativos + 1;
             }
             else{
                 if (num > 0) {
                     positivos = positivos + 1;
                 }
                 else{
                 ceros = ceros + 1;
                 }
             }
             
         }
         System.out.println("Resultados:");
         System.out.println("Positivos: " + positivos);
         System.out.println("Negativos: " + negativos);
         System.out.println("Ceros: " + ceros);
     }
     public static void main(String[] args) {
        ejecutar();
    }
}
