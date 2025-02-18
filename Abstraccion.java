package proyectoUnidadUno;

import java.util.Scanner;

public class Abstraccion {

    public void ejemploAbstraccion() {
        Scanner scanner = new Scanner(System.in);
        int opt;
        String menu = "Seleccione una opción:\n1. Círculo\n2. Rectángulo\n0. Salir";
        boolean continuar = true;

        while (continuar) {
            System.out.println(menu);
            System.out.print("Opción: ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1: // Círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    Figura circulo = new Circulo(radio);
                    circulo.mostrarInformacion();
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                    break;

                case 2: // Rectángulo
                    System.out.print("Ingrese el largo del rectángulo: ");
                    double largo = scanner.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    Figura rectangulo = new Rectangulo(largo, ancho);
                    rectangulo.mostrarInformacion();
                    System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                    System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
