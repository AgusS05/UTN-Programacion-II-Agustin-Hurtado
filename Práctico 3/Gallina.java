package punto4;

public class Gallina {
    private int idGallina, edad, huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public int ponerHuevo(int huevos) {
        return huevosPuestos += huevos;
    }
    public int envejecer(int anios) {
        return edad += anios;
    }
    
    public void mostrarEstado() {
        System.out.println("La gallina " + idGallina + " a puesto " + huevosPuestos + " huevos y tiene " + edad + " años.");
    }
    
  
}
