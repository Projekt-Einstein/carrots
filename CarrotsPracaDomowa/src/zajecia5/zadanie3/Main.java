package zajecia5.zadanie3;

import zajecia5.zadanie1.Punkt;

public class Main {
    public static void main(String[] args) {
        Kolo k1 = new Kolo(3);
        Kolo k2 = new Kolo(1, 1, 2);
        Kolo k3 = new Kolo(new Punkt(1, 2), 4);

        System.out.println("k1: " + k1);
        System.out.println("k2: " + k2);
        System.out.println("k3: " + k3);

        System.out.println("\nObwod k1: " + k1.getPerimeter());
        System.out.println("Pole k1: " + k1.getArea());

        System.out.println("\nObwod k2: " + k2.getPerimeter());
        System.out.println("Pole k2: " + k2.getArea());

        System.out.println("\nObwod k3: " + k3.getPerimeter());
        System.out.println("Pole k3: " + k3.getArea());
    }
}
