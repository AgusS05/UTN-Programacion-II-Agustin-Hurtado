package ej3;

public class ej3 {
    public static void main(String[] args) {
        // Crear autor
        Autor autor = new Autor("Julio Cortazar", "Argentino");

        // Crear editorial
        Editorial editorial = new Editorial("Editorial Alfaguara", "Buenos Aires, Argentina");

        // Crear libro con autor y editorial
        Libro libro = new Libro("Rayuela", "978-987-801-067-0", autor, editorial);

        // Mostrar informaci�n del libro
        System.out.println("Informaci�n del Libro:");
        System.out.println(libro);

        // Mostrar informaci�n del autor
        System.out.println("\nInformaci�n del Autor:");
        System.out.println(autor);

        // Mostrar informaci�n de la editorial
        System.out.println("\nInformaci�n de la Editorial:");
        System.out.println(editorial);
    }
    
}
