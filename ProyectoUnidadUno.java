package proyectoUnidadUno;

import javax.swing.JOptionPane;

public class ProyectoUnidadUno {

    public static void main(String[] args) {
        int opt;
        String menu = "";
        menu = "1. Métodos\n"
             + "2. Polimorfismo\n"
             + "3. Herencia\n"
             + "4. Abstracción\n"
             + "5. Encapsulamiento\n"
             + "6. Sobrecarga\n"
             + "7. Constructores\n"
             + "8. Salir\n";

        // Crear el objeto Metodos
        Metodos invoca = new Metodos();
        // Crear el objeto Polimorfismo
        Polimorfismo polimorfismo = new Polimorfismo();
        // Crear el objeto Herencia
        Herencia herencia = new Herencia();
        // Crear el objeto Abstracción
        Abstraccion abstraccion = new Abstraccion();
        // Crear el objeto Encapsulamiento
        Encapsulamiento encapsulamiento = new Encapsulamiento();
        // Crear el objeto Sobrecarga
        Sobrecarga sobrecarga = new Sobrecarga();
        // Crear el objeto Constructores
        Constructores constructores = new Constructores();

        // Menú interactivo
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opt) {
                case 1:
                    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor 1"));
                    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el valor 2"));
                    invoca.realizarOperacion(numero1, numero2);
                    break;
                case 2:
                    polimorfismo.ejemploPolimorfismo(); 
                    break;
                case 3:
                    herencia.ejemploHerencia();  
                    break;
                case 4:
                    abstraccion.ejemploAbstraccion(); 
                    break;
                case 5:
                    encapsulamiento.ejemploEncapsulamiento();  
                    break;
                case 6:
                    sobrecarga.ejemploSobrecarga();  
                    break;
                case 7:
                    constructores.ejemploConstructores();  
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida");
            }
        } while(opt != 8);
    }
}

