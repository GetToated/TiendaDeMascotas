package LaPrimeraClase;

public class Gallo extends Animales {
    private int peso;
    public Gallo (String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;

    }
    public void hacerSonido() {
        System.out.println("Quiriri, quiriri");
    }
}
