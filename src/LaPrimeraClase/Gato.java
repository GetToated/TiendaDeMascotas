package LaPrimeraClase;

public class Gato extends Animales {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public void hacerSonido() {
        System.out.println("Miau, Miau");
    }
}
