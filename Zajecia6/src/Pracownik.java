/**
 * Created by rpi on 18.04.2017.
 */
public class Pracownik extends Osoba {

    private String numerKadrowy;

    @Override
    public void przedstawSie() {
        System.out.println("Jestem pracownikiem i nazywam się " +
                getNazwisko() + " " + getImie());
    }

    public String getNumerKadrowy() {
        return numerKadrowy;
    }

    public void setNumerKadrowy(String numerKadrowy) {
        this.numerKadrowy = numerKadrowy;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "numerKadrowy='" + numerKadrowy + '\'' +
                "} " + super.toString();
    }
}
