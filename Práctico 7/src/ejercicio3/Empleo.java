
package ejercicio3;


public abstract class Empleo {
    protected String nombre;
    protected String apellido;
    protected String id;

    public Empleo(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }

    public String getId() {
        return id;
    }
    
    public abstract double calcularSueldo();
}