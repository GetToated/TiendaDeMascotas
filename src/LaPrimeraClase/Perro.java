package LaPrimeraClase;

public class Perro extends Animales{
    private int tamaño;
    public Perro(String nombre, int edad, int tamaño) {
        super(nombre, edad);
        this.tamaño = tamaño;
    }
    public void hacerSonido() {
        System.out.println("Guau, Guau");
    }
}
