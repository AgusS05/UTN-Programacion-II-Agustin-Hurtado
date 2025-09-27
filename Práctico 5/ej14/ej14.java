
package ej14;


public class ej14 {
    public static void main(String[] args) {
        // Crear proyecto
        Proyecto proyecto = new Proyecto("Videoclip artista emergente", 10);

        // Crear editor de video
        EditorVideo editor = new EditorVideo();

        // Exportar proyecto a render (dependencia de creaci�n)
        Render render = editor.exportar("MP4", proyecto);

        // Mostrar informaci�n del render y del proyecto
        System.out.println("\nInformaci�n del Render:");
        System.out.println(render);

        System.out.println("\nInformaci�n del Proyecto:");
        System.out.println(proyecto);
    }
    
}
