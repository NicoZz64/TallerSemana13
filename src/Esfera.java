public class Esfera extends Circulo {
    public Esfera(Punto centro, double radio) {
        super(centro, radio);
    }

    public double calcularVolumen() {
        // Cálculo del volumen de la esfera
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }
}