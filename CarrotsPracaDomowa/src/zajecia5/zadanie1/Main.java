package zajecia5.zadanie1;

public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(1, 5);
        Punkt p2 = new Punkt(2);
        Punkt p3 = new Punkt();
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p3 equals p1 = " + p3.equals(p1));
        double odleglosc = 0.0;
        if (!p3.equals(p1)) {
            odleglosc = p3.odlegloscDo(p1);
            System.out.println("Odleglosc p3 -> p1 = " + odleglosc);
        }
        p1.setX(-9);
        p2.setY(p1.getY());

        int sum = p1.getX() + p2.getX();
        p3.setX(sum);
        System.out.println("=======================================");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
    }
}
