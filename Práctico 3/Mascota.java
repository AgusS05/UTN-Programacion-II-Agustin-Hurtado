package punto2;


public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("Se llama " + nombre + ", es un/a " + especie + " y tiene " + edad + " años.");
    }
    
    public int cumplirAnios(int anios) {
        return edad += anios;
    }
    
}
