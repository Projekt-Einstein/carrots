import java.time.LocalDate;

/**
 * Klasa przedstawiajaca koty
 * @Author Dominik Ciborowski
 */
public class Kot {

    /**
     * Imie naszego kota
     */
    private String imie;

    /**
     * umaszczenie kota
     */
    private String umaszczenie;

    /**
     * Kiedy sie nasz szcesliwiec urodzil?
     */
    private LocalDate dataUrodzenia;

    /**
     * Czy nasz milusinski byl szczepiony?
     */
    private boolean szczepiony;

    public Kot(String imie, String umaszczenie) {
        this.umaszczenie = umaszczenie;
        this.imie = imie;
        //urodzil sie w tym momencie - wartoscia domyslna jest null wiec
        dataUrodzenia = LocalDate.now();
    }

    public Kot(String imie, String umaszczenie, LocalDate dataUrodzenia) {
        // this() - odwolanie do innego konstruktora
        this(imie, umaszczenie);
        this.dataUrodzenia = dataUrodzenia;
        //pole szczepiony bedzie mialo wartosc domyslna - false
    }

    public Kot(String imie, String umaszczenie, LocalDate dataUrodzenia, boolean szczepiony) {
        // this() - odwolanie sie do innego konstruktora
        //          tej klasy ktory przyjmuje w tym wypadku 3 parametry
        this(imie, umaszczenie, dataUrodzenia);

        // this w tym wypadku oznacza ten obiekt na ktorym to wolamy
        // czyli nowo stworzony obiekt, ktory wlasnie inicjalizujemy
        this.szczepiony = szczepiony;
    }

    /**
     * Getter dla imienia
     * @return imie kota
     */
    public String getImie() {
        return imie;
    }

    /**
     * Setter dla imienia - ustawia wartosc dla obiektu (reszta getterow/setterow tak samo)
     * @param imie nowe imie kota
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getUmaszczenie() {
        return umaszczenie;
    }

    public void setUmaszczenie(String umaszczenie) {
        this.umaszczenie = umaszczenie;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public boolean isSzczepiony() {
        return szczepiony;
    }

    public void setSzczepiony(boolean szczepiony) {
        this.szczepiony = szczepiony;
    }

    /**
     * Metoda toString() sluzy do wypisywania obiektu za pomoca System.out.println()
     * w czytelny dla nas sposob.
     *
     * @return to jak ma byc wypisany nasz obiekt
     */
    @Override
    public String toString() {
        return "Moj kochany kotek " + imie + ", o umaszczeniu " + umaszczenie
                + ", ktory urodzil sie w dniu " + dataUrodzenia +
                " i " + ((szczepiony)? "byl szcepiony" : "nie byl szczepiony");
    }
}
