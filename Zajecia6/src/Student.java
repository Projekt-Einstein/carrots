/**
 * Created by rpi on 18.04.2017.
 */
public class Student extends Osoba {

    private String numerIndeksu;

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem studentem i nazywam się " +
                getImie() + " " + getNazwisko());
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerIndeksu='" + numerIndeksu + '\'' +
                "} " + super.toString();
    }
}
