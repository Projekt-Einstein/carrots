package zajecia5.zadanie2;


import zajecia5.zadanie1.Punkt;

public class Prostokat {
    private Punkt point;
    private int width;
    private int height;

    public Prostokat() {
        this(new Punkt(), 0);
    }

    public Prostokat(Punkt point, int width) {
        this(point, width, width);
    }

    public Prostokat(int x, int y, int width, int height) {
        this(new Punkt(x, y), width, height);
    }

    public Prostokat(Punkt point, int width, int height) {
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public int obwod() {
        return 2 * width + 2 * height;
    }

    public int pole() {
        return width * height;
    }

    ///////////////////////
    // gettery i settery //
    ///////////////////////
    public Punkt getPunkt() {
        return point;
    }

    public void setPunkt(Punkt point) {
        this.point = point;
    }

    public void setPunktFromCoordinates(int x, int y) {
        // this.point = new Punkt(x, y); - tworze nowy punkt
        this.point.setX(x); //ustawiam na istniejacym obiekcie - nie tworze obiektu
        this.point.setY(y);

        // ktora wersje wybierzemy zalezy od wymagan ;)
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Metoda toString - wypiswanie na ekran za pomoca System.out.println
     */
    @Override
    public String toString() {
        return "punkt: " + point.toString() + " szerokosc: " + width + " wysokosc: " + height;
    }

}
