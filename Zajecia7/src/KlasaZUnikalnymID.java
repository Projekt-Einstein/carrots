/**
 * Created by rpi on 25.04.2017.
 */
public class KlasaZUnikalnymID
        implements I, IMyAwsomeInterface {

    private static int nextId = 1;

    private int id;

    public KlasaZUnikalnymID() {
        this.id = nextId++;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof KlasaZUnikalnymID) {
//            KlasaZUnikalnymID kl = (KlasaZUnikalnymID) obj;
//            return id == kl.id;
//        }
//        return false;
//    }

    /**
     * My awsome comment
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KlasaZUnikalnymID that = (KlasaZUnikalnymID) o;

        return id == that.id;
    }

    @Override
    public void zapisz() {

    }

    @Override
    public int zwroc2() {
        return 3;
    }
}
