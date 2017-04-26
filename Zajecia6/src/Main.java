/**
 * Created by rpi on 18.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setImie("Dominik");
        student.setNazwisko("Ciborowski");
        student.setNumerIndeksu("s13302");

        Pracownik pracownik = new Pracownik();
        pracownik.setImie("Karol");
        pracownik.setNazwisko("Lewandowski");
        pracownik.setNumerKadrowy("AABB11");

        Osoba[] osoby = {student, pracownik};
//        for (Osoba osoba : osoby) {
//            System.out.println(osoba);
//        }
//        OdczytZapis.zapisz(osoby);
        Osoba[] odczytaneOsoby = OdczytZapis.odczyt();
        for (Osoba osoba : odczytaneOsoby) {
            osoba.przedstawSie();
        }


//        Osoba osoba = new Osoba() {
//            @Override
//            public void przedstawSie() {
//                System.out.println("Osoba");
//            }
//        };
//        osoba.przedstawSie();
    }

}
