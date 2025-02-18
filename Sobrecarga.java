package proyectoUnidadUno;

import javax.swing.JOptionPane;

public class Sobrecarga {

    public void ejemploSobrecarga() {
        int val1;
        int val2;
        int val3;
        int opt;
        String menu = "Seleccione una opción:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n0. Salir";
        boolean continuar = true;
        
        while (continuar) {
            opt = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opt) {
                case 1:
                    val1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer valor"));
                    val2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo valor"));
                    val3 = Integer.parseInt(JOptionPane.showInputDialog("Dame el tercer valor"));
                    Calculadora calc1 = new Calculadora();
                    Calculadora calc2 = new Calculadora(10);
                    Calculadora calc3 = new Calculadora(10);
                    System.out.println("Suma sin parámetros: " + calc1.sumar());
                    System.out.println("Suma con un número: " + calc1.sumar(val1));
                    System.out.println("Suma con dos números: " + calc1.sumar(val1, val2));
                    System.out.println("Suma con tres números: " + calc1.sumar(val1, val2, val3));
                    break;
                case 2:
                    val1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer valor"));
                    val2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo valor"));
                    val3 = Integer.parseInt(JOptionPane.showInputDialog("Dame el tercer valor"));
                    Calculadora calc4 = new Calculadora();
                    Calculadora calc5 = new Calculadora(10);
                    Calculadora calc6 = new Calculadora(10);
                    System.out.println("Resta sin parámetros: " + calc4.restar());
                    System.out.println("Resta con un número: " + calc4.restar(val1));
                    System.out.println("Resta con dos números: " + calc4.restar(val1, val2));
                    System.out.println("Resta con tres números: " + calc4.restar(val1, val2, val3));
                    break;
                case 3:
                    val1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer valor"));
                    val2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo valor"));
                    val3 = Integer.parseInt(JOptionPane.showInputDialog("Dame el tercer valor"));
                    Calculadora calc7 = new Calculadora();
                    Calculadora calc8 = new Calculadora(10);
                    Calculadora calc9 = new Calculadora(10);
                    System.out.println("Multiplicación sin parámetros: " + calc7.multiplicar());
                    System.out.println("Multiplicación con un número: " + calc7.multiplicar(val1));
                    System.out.println("Multiplicación con dos números: " + calc7.multiplicar(val1, val2));
                    System.out.println("Multiplicación con tres números: " + calc7.multiplicar(val1, val2, val3));
                    break;
                case 4:
                    val1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer valor"));
                    val2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo valor"));
                    val3 = Integer.parseInt(JOptionPane.showInputDialog("Dame el tercer valor"));
                    Calculadora calc10 = new Calculadora();
                    Calculadora calc11 = new Calculadora(10);
                    Calculadora calc12 = new Calculadora(10);
                    System.out.println("División sin parámetros: " + calc10.dividir());
                    System.out.println("División con un número: " + calc10.dividir(val1));
                    System.out.println("División con dos números: " + calc10.dividir(val1, val2));
                    System.out.println("División con tres números: " + calc10.dividir(val1, val2, val3));
                    break;
                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        }
    }
}
