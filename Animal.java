package proyectoUnidadUno;

public abstract class Animal {
    protected String type;
    protected String sound;

    public Animal(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public void makesound() {
        System.out.println(type + " hace el sonido: " + sound);
    }

    public abstract void inherits();
}
