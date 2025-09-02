package practico2;

import java.util.Scanner;


public class Punto3 {
    public static void ejecutar() {
    int edad;
    Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        if (edad >= 0 && edad < 12) {
            System.out.println("Niño");
        }
        else {
            if (edad >= 12 && edad < 17) {
                System.out.println("Adolescente");
            }
            else{
                if (edad >= 18 && edad < 59) {
                    System.out.println("Adulto");
                }
                else {
                    if (edad >= 60 && edad < 120) {
                        System.out.println("Adulto Mayor");
                    }
                    else {
                        System.out.println("Edad inválida.");
                    }
                }
            }
        }
    
    }
     public static void main(String[] args) {
        ejecutar();
    }
    
}
