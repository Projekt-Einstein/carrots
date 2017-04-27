package zajecia5.zadanie1;

public class Punkt {
    private int x, y;

    /**
     * Konstruktor domyslny - oba pola ustawia na 0.
     *
     * @see #Punkt(int, int)
     */
    public Punkt() {
        this(0);
    }

    /**
     * Konstruktor z jednym parametrem - oba pola na wartosc parametru x
     *
     * @param x wartosc obu pol
     * @see #Punkt(int, int)
     */
    public Punkt(int x) {
        this(x, x);
    }

    /**
     * Konstruktor z dwoma argumentami - ustawia wartosci x i y.
     *
     * @param x wspolrzedna x
     * @param y wspolrzedna y
     */
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double odlegloscDo(Punkt p) {
        int deltaX = p.getX() - this.getX();
        int deltaY = p.getY() - this.getY();

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Punkt other = (Punkt) obj;
        if (x != other.x)
            return false;

        if (y != other.y)
            return false;

        return true;
    }

}
