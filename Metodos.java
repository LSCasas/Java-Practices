package proyectoUnidadUno;

import javax.swing.JOptionPane;

public class Metodos {



    // Método para realizar la operación según la selección del usuario
    public void realizarOperacion(int numero1, int numero2) {
        String operacionesMenu = "Elija la operación:\n"
                               + "1. Suma\n"
                               + "2. Resta\n"
                               + "3. Multiplicación\n"
                               + "4. División\n"
                               + "5. Módulo";
        int opcionOperacion = Integer.parseInt(JOptionPane.showInputDialog(operacionesMenu));

        switch (opcionOperacion) {
            case 1:
                suma(numero1, numero2);
                break;
            case 2:
                resta(numero1, numero2);
                break;
            case 3:
                multiplicacion(numero1, numero2);
                break;
            case 4:
                divison(numero1, numero2);
                break;
            case 5:
                modulo(numero1, numero2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
        }
    }

    public void suma(int numero1, int numero2) {
        int total = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + total);
    }

    public void resta(int numero1, int numero2) {
        int total = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + total);
    }

    public void multiplicacion(int numero1, int numero2) {
        int total = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + total);
    }

    public void divison(int numero1, int numero2) {
        if (numero2 != 0) {
            int total = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "El resultado de la división es: " + total);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
        }
    }

    public void modulo(int numero1, int numero2) {
        int total = numero1 % numero2;
        JOptionPane.showMessageDialog(null, "El resultado del módulo es: " + total);
    }

    // Implementación de Polimorfismo
    public void polimorfismo() {
        // Crear instancias de las clases Dog y Cat
        Dog dog = new Dog("Guau");
        dog.makesound();

        Cat cat = new Cat("Miau");
        cat.makesound();
    }
}
