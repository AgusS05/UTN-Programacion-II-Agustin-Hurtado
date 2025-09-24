package javaapplication29;


public class Principal {

    
    public static void main(String[] args) {
        Estudiante agus = new Estudiante();
        agus.setNombre("Agustín");
        agus.setApellido("Hurtado");
        agus.setCurso("Naturales");
        agus.setCalificacion(9.0);
        
        agus.mostrarInfo();
        agus.subirCalificacion(1);
        agus.mostrarInfo();
        agus.bajarCalificacion(0.5);
        agus.mostrarInfo();
    }
    
}
