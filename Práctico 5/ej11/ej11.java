
package ej11;


public class ej11 {
     public static void main(String[] args) {
        // Crear artista
        Artista artista = new Artista("Adele", "Pop");

        // Crear canci�n asociada al artista
        Cancion cancion = new Cancion("Set Fire To The Rain", artista);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Usar el reproductor para reproducir la canci�n (dependencia de uso)
        reproductor.reproducir(cancion);

        // Mostrar informaci�n de la canci�n
        System.out.println("\nInformaci�n de la Canci�n:");
        System.out.println(cancion);

         // Mostrar informaci�n del artista
        System.out.println("\nInformaci�n del Artista:");
        System.out.println(artista);
    }
    
}
