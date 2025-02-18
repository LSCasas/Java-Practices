package proyectoUnidadUno;

import proyectounidaduno.Persona;
import javax.swing.JOptionPane;

public class Encapsulamiento {

    public void ejemploEncapsulamiento() {
        String nombre;
        int edad;
        int lim;
        int i;
        lim = Integer.parseInt(JOptionPane.showInputDialog("Dame el limite de personas"));

        for (i = 0; i < lim; i = i + 1) {
            nombre = JOptionPane.showInputDialog("Dame el nombre ");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Dame la edad"));
            Persona personal = new Persona(nombre, edad);
            personal.mostrarInformacion();
        }
    }
}
