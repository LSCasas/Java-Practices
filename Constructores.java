package proyectoUnidadUno;

import javax.swing.JOptionPane;

public class Constructores {

    public void ejemploConstructores() {
        Auto auto = null;

        while (true) {
            String menu = "1. Crear Auto (por defecto)\n"
                         + "2. Crear Auto (personalizado)\n"
                         + "3. Mostrar información del auto\n"
                         + "4. Salir";

            String opcion = JOptionPane.showInputDialog(null, menu, "Menú Auto", JOptionPane.QUESTION_MESSAGE);

            if (opcion == null) break; // Usuario presionó "Cancelar"

            switch (opcion) {
                case "1":
                    auto = new Auto(); // Usando el constructor por defecto
                    JOptionPane.showMessageDialog(null, "Auto creado con valores por defecto.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":
                    String marca = JOptionPane.showInputDialog(null, "Ingresa la marca del auto:", "Datos del Auto", JOptionPane.QUESTION_MESSAGE);
                    String modelo = JOptionPane.showInputDialog(null, "Ingresa el modelo del auto:", "Datos del Auto", JOptionPane.QUESTION_MESSAGE);
                    int anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año del auto:", "Datos del Auto", JOptionPane.QUESTION_MESSAGE));

                    auto = new Auto(marca, modelo, anio); // Usando el constructor con parámetros
                    JOptionPane.showMessageDialog(null, "Auto creado con los datos proporcionados.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "3":
                    if (auto != null) {
                        auto.mostrarInfo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debes crear un auto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
