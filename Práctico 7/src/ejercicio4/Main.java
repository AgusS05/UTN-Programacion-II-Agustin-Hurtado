package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genérico");
        Perro perro = new Perro("Canino");
        Gato gato = new Gato("Felino");
        Vaca vaca = new Vaca("Bovino");

        animal.describirAnimal();
        animal.hacerSonido();

        perro.describirAnimal();
        perro.hacerSonido();

        gato.describirAnimal();
        gato.hacerSonido();

        vaca.describirAnimal();
        vaca.hacerSonido();
    }
}
