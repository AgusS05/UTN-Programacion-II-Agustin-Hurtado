
package ej14;


public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto '" + proyecto.getNombre() + "' en formato " + formato);
        return render;
    }
}