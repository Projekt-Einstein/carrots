package zajecia5.zadanie3;


import zajecia5.zadanie1.Punkt;

public class Kolo {
    private Punkt middlePoint;
    private int radius;

    public Kolo(int radius) {
        this(new Punkt(), radius);
    }

    public Kolo(int x, int y, int radius) {
        this(new Punkt(x, y), radius);
    }

    public Kolo(Punkt middlePoint, int radius) {
        this.middlePoint = middlePoint;
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    // pominalem gettery i settery dla czytelniejszego kodu

    @Override
    public String toString() {
        return "middle point: " + middlePoint.toString() + " radius: " + radius;
    }
}
