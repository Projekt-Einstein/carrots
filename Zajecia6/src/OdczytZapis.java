import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by rpi on 18.04.2017.
 */
public class OdczytZapis {

    private static final String SEPARATOR = ":";
    private static final String NAZWA_PLIKU = "plik.txt";

    public static void zapisz(Osoba[] osoby) {
        try (PrintWriter pw = new PrintWriter(NAZWA_PLIKU)) {
            for (Osoba osoba : osoby) {
                zapisz(pw, osoba);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static Osoba[] odczyt() {
        Osoba[] osoby = new Osoba[0];
        try (Scanner scanner = new Scanner(new File(NAZWA_PLIKU))) {
            while (scanner.hasNext()) {
                String osoba = scanner.nextLine();
                if (osoba.length() > 0) {
                    Osoba[] osobyTemp = osoby;
                    osoby = new Osoba[osobyTemp.length + 1];
                    for (int i = 0; i < osobyTemp.length; i++) {
                        osoby[i] = osobyTemp[i];
                    }
                    Osoba parsedOsoba = parseOsoba(osoba);
                    osoby[osoby.length - 1] = parsedOsoba;
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return osoby;
    }

    private static void zapisz(PrintWriter pw, Osoba osoba) {
        pw.append(osoba.getClass().getName()).append(SEPARATOR);
        switch (osoba.getClass().getName()) {
            case "Pracownik":
                zapiszPracownik(pw, (Pracownik) osoba);
                break;
            case "Student":
                zapiszStudent(pw, (Student) osoba);
                break;
        }
        pw.append(SEPARATOR)
                .append(osoba.getImie())
                .append(SEPARATOR)
                .append(osoba.getNazwisko())
                .append('\n');
        pw.flush();
    }

    private static void zapiszStudent(PrintWriter pw, Student student) {
        pw.append(student.getNumerIndeksu());
    }

    private static void zapiszPracownik(PrintWriter pw, Pracownik pracownik) {
        pw.append(pracownik.getNumerKadrowy());
    }

    private static Osoba parseOsoba(String line) {
        Osoba result = null;
        StringTokenizer tokenizer = new StringTokenizer(line, ":", false);
        switch (tokenizer.nextToken()) {
            case "Student":
                result = parseStudent(tokenizer);
                break;
            case "Pracownik":
                result = parsePracownik(tokenizer);
                break;
        }
        String imie = tokenizer.nextToken();
        String nazwisko = tokenizer.nextToken();
        result.setImie(imie);
        result.setNazwisko(nazwisko);
        return result;
    }

    private static Student parseStudent(StringTokenizer tokenizer) {
        Student student = new Student();
        String numerIndeksu = tokenizer.nextToken();
        student.setNumerIndeksu(numerIndeksu);
        return student;
    }

    private static Pracownik parsePracownik(StringTokenizer tokenizer) {
        Pracownik pracownik = new Pracownik();
        String numerKadrowy = tokenizer.nextToken();
        pracownik.setNumerKadrowy(numerKadrowy);
        return pracownik;
    }

}
