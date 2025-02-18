package proyectoUnidadUno;

import javax.swing.JOptionPane;

public class Herencia {

    public void ejemploHerencia() {
        // Entrada de los datos para el gallo
        String nombreGallo = JOptionPane.showInputDialog("Ingrese el nombre del gallo:");
        String tipoAlimentacionGallo = JOptionPane.showInputDialog("Ingrese el tipo de alimentación del gallo:");
        int edadGallo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del gallo:"));
        String razaGallo = JOptionPane.showInputDialog("Ingrese la raza del gallo:");

        Gallo gallo = new Gallo(nombreGallo, tipoAlimentacionGallo, edadGallo, razaGallo);

        // Entrada de los datos para la vaca
        String nombreVaca = JOptionPane.showInputDialog("Ingrese el nombre de la vaca:");
        String tipoAlimentacionVaca = JOptionPane.showInputDialog("Ingrese el tipo de alimentación de la vaca:");
        int edadVaca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la vaca:"));
        String razaVaca = JOptionPane.showInputDialog("Ingrese la raza de la vaca:");

        Vaca vaca = new Vaca(nombreVaca, tipoAlimentacionVaca, edadVaca, razaVaca);

        // Entrada de los datos para el caballo
        String nombreCaballo = JOptionPane.showInputDialog("Ingrese el nombre del caballo:");
        String tipoAlimentacionCaballo = JOptionPane.showInputDialog("Ingrese el tipo de alimentación del caballo:");
        int edadCaballo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del caballo:"));
        String razaCaballo = JOptionPane.showInputDialog("Ingrese la raza del caballo:");

        Caballo caballo = new Caballo(nombreCaballo, tipoAlimentacionCaballo, edadCaballo, razaCaballo);

        // Mostrar los detalles de los animales
        String mensaje = "Detalles de los Seres Vivos:\n\n";
        mensaje += "Gallo: " + gallo.getNombre() + " - " + gallo.getTipoAlimentacion() + " - " + gallo.getEdad() + " años - Raza: " + gallo.getRaza() + "\n";
        mensaje += "Vaca: " + vaca.getNombre() + " - " + vaca.getTipoAlimentacion() + " - " + vaca.getEdad() + " años - Raza: " + vaca.getRaza() + "\n";
        mensaje += "Caballo: " + caballo.getNombre() + " - " + caballo.getTipoAlimentacion() + " - " + caballo.getEdad() + " años - Raza: " + caballo.getRaza();

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
