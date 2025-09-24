package javaapplication29;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + "Apellido: " + apellido + " " + "Curso: " + curso + " " + "Calificación: " + calificacion );
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    
    public double subirCalificacion(double puntos){
        
        return calificacion += puntos;   
    }
    public double bajarCalificacion(double puntos){
        
        return calificacion -= puntos;   
    }
    
    
    
    
}
