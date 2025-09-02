
package practico2;

import java.util.Scanner;

public class Punto5 {
    public static void ejecutar() {
        int num = 1;
        int suma = 0;
        Scanner input = new Scanner(System.in);
        
        while (num != 0){
            System.out.print("Ingresa un número entero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0) {
                suma = suma + num;
            }
        }
        System.out.print("La suma de los números pares ingresados es: " + suma);
        System.out.println("");
        
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
