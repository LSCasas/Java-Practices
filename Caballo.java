package proyectoUnidadUno;

public class Caballo extends SerVivo {
    private String raza;

    public Caballo(String nombre, String tipo_alimentacion, int edad, String raza) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
