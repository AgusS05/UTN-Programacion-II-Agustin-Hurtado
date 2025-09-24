package punto3;

public class Libro {
    private String titulo;
    private String autor;
    private int aniopubli;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAniopubli() {
        return aniopubli;
    }

    public void setAniopubli(int aniopubli) {
        if (aniopubli > 1700 && aniopubli <= 2025) {
            this.aniopubli = aniopubli;
        } else {
            System.out.println("Ingrese una fecha válida.");
        }
    }
    
}
