
package ej8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Documento{" +
               "titulo=" + titulo +
               ", contenido=" + contenido +
               ", firma=" + firma +
               '}';
    }
}