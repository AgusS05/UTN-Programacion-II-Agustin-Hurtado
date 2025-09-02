package practico2;
import java.util.Scanner;

public class Punto1 {
     public static void ejecutar() {
        System.out.println("Ejecutando Punto 1");
        
        Scanner input = new Scanner(System.in);
        int anio; 
         System.out.print("Ingrese un año por favor: ");
        anio = Integer.parseInt(input.nextLine());
         if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
             System.out.println("El año " + anio + " es año bisiesto");
         }
         else {
             System.out.println("El año " + anio + " NO es año bisiesto");
         }
        
        
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
