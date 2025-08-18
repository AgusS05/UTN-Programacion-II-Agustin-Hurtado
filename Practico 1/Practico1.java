// Práctico 1 Agustín Hurtado

package practico1;
import java.util.Scanner;

public class Practico1 {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //3 
        String nombre = "Agustín";
        int edad = 25;
        double altura = 1.78;
        boolean estudiante = true;
        
        System.out.println("Mi nombre es " + nombre + ", tengo " + edad + " años y mido " + altura + ". Soy estudiante: " + estudiante + ".");
        
        
        //4
        String nombre2;
        int edad2;
        System.out.print("Por favor, ingrese su nombre: ");
        nombre2 = input.nextLine();
        System.out.print("Ahora ingrese su edad: ");
        edad2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Hola " + nombre2 + ", tenés " + edad2 + " años.");
        
        
        
        // 5
        int num1, num2, suma, resta, multiplicacion, division;
        
        System.out.print("Por favor, ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Por favor, ingrese otro número entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        System.out.println("Operaciones entre los números otorgados:\n Suma = " + suma + "\n Resta = " + resta + "\n Multiplicación = " + multiplicacion + "\n División = " + division);
        
        
        
        // 6
        String nombre3 = "Juan Pérez";
        int edad3 = 30;
        String direccion = "Calle Falsa 123";
        
        System.out.println(" Nombre: " + nombre3 + "\n\n Edad: " + edad3 + " años\n\n Dirección: \"" + direccion + "\"");
        
        
        
        //8 
        
        int numa, numb;
        double resultado;
        
        System.out.print("Ingresa un número entero: ");
        numa = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa otro número entero: ");
        numb = Integer.parseInt(input.nextLine());
        
        resultado = (double)numa / numb;
        
        System.out.println("El resultado de la división es: " + resultado);
        
        
        
        // 9 Corrección de código
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre4 = scanner.nextLine(); // Se cambia nextint por nextLine, no se puede esperar un entero si la variable es una string.
        System.out.println("Hola, " + nombre4); 
        
        
        
      
        
        
        
        
        
        
        
        
        
              
        
        
               
        
        
        
                
        
        
        
    }
    
}
