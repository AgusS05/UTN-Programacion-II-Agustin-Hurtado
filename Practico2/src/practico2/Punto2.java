package practico2;
import java.util.Scanner;


public class Punto2 {
    public static void ejecutar() {
        System.out.println("Ejecutando Punto 1");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, mayor;
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(input.nextLine());
        
        mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
        
    }
     public static void main(String[] args) {
        ejecutar();
    }
     
     
}
