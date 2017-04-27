package zajecia5.zadanie2;

// uzywam klasy z poprzedniego zadania

import zajecia5.zadanie1.Punkt;

public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(1, 5);
        Punkt p2 = new Punkt(2);
        Punkt p3 = new Punkt(18, 6);
        Prostokat pr1 = new Prostokat();
        Prostokat pr2 = new Prostokat(p1, 15);
        Prostokat pr3 = new Prostokat(p2, 10, 6);
        Prostokat pr4 = new Prostokat(0, 75, 10, 4);
        System.out.println("pr1 = " + pr1);
        System.out.println("pr2 = " + pr2);
        System.out.println("pr3 = " + pr3);
        System.out.println("pr4 = " + pr4);
        System.out.println("====================================");
        pr1.setHeight(26);
        pr1.setPunktFromCoordinates(5, 96);
        pr2.setPunkt(p3);
        System.out.println("pr1 = " + pr1);
        System.out.println("pr2 = " + pr2);
        System.out.println("pr3 = " + pr3);
        System.out.println("====================================");
        int pr2Obwod = pr2.obwod();
        System.out.println("Obwod pr2 = " + pr2Obwod);
        int pr3Pole = pr3.pole();
        System.out.println("Pole pr3 = " + pr3Pole);

    }
}
