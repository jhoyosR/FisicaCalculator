package calculador;

public class Calculador{
    public double m1;
    public double m2;
    public double u;
    final public double g = 9.8;

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public void setU(double u) {
        this.u = u;
    }
    public double calculateAcceleration(){
        return ((m1 * g - ((m2 * g) * u)) / (m1 + m2));
    }

    public double calculateTension(){
        return (((m2 * g) * u) + (m2 * calculateAcceleration()));
    }
    public String showResults(){
        return "Para este sistema, la aceleración de los objetos es " + this.calculateAcceleration() + "m/s², y la tensión del cable es de " + this.calculateTension() + "N";
    }
}
