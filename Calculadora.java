package proyectoUnidadUno;

public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora() {
        this.num1 = 0;
        this.num2 = 0;
    }
    
    public Calculadora(int num1) {
        this.num1 = num1;
        this.num2 = 0;
    }
    
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int sumar() {
        return this.num1 + this.num2;
    }
    
    public int sumar(int num1) {
        return num1 + num2;
    }
    
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
    
    public int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    public int restar() {
        return this.num1 - this.num2;
    }
    
    public int restar(int num1) {
        return num1 - num2;
    }
    
    public int restar(int num1, int num2) {
        return num1 - num2;
    }
    
    public int restar(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }
    
    public int multiplicar() {
        return this.num1 * this.num2;
    }
    
    public int multiplicar(int num1) {
        return num1 * num2;
    }
    
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    
    public int multiplicar(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
    
    public int dividir() {
        return this.num1 / 1;
    }
    
    public int dividir(int num1) {
        return num2 / num1;
    }
    
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }
    
    public int dividir(int num1, int num2, int num3) {
        return num1 / num2 / num3;
    }
}
