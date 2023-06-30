public class Circulo extends Figura {
    Punto centro;
    double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // Cálculo del área del círculo
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        // Cálculo del perímetro del círculo
        return 2 * Math.PI * radio;
    }
}