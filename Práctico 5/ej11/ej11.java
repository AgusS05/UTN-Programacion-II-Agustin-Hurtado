
package ej11;


public class ej11 {
     public static void main(String[] args) {
        // Crear artista
        Artista artista = new Artista("Adele", "Pop");

        // Crear canción asociada al artista
        Cancion cancion = new Cancion("Set Fire To The Rain", artista);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Usar el reproductor para reproducir la canción (dependencia de uso)
        reproductor.reproducir(cancion);

        // Mostrar información de la canción
        System.out.println("\nInformación de la Canción:");
        System.out.println(cancion);

         // Mostrar información del artista
        System.out.println("\nInformación del Artista:");
        System.out.println(artista);
    }
    
}
