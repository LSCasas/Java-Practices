package proyectoUnidadUno;

import javax.swing.JOptionPane;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor por defecto
    public Auto() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.anio = 0;
    }

    // Constructor con parámetros
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, 
            "Marca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio, 
            "Información del Auto", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
