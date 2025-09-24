package punto3;

public class Principal3 {

    
    public static void main(String[] args) {
       Libro primerLibro = new Libro();
       
       primerLibro.setTitulo("La Larga Marcha");
       primerLibro.setAutor("Stephen King");
       System.out.println(primerLibro.getAniopubli());
       primerLibro.setAniopubli(3000);
       System.out.println(primerLibro.getAniopubli());
       primerLibro.setAniopubli(1979);
       System.out.println(primerLibro.getAniopubli());
       
       
    }
    
}
