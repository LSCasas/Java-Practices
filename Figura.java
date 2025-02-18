package proyectoUnidadUno;

abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public void mostrarInformacion(){
        System.out.println("Esta es una figura geometrica");
    }
}
