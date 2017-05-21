package generics;

/**
 * Created by domino on 5/16/17.
 */
public class MojaGenerycznaKlasa<T> {

    private T value;

    public MojaGenerycznaKlasa(T value) {
        this.value = value;

//        T ala = new T();
    }

    public String getValueClassName() {
        return value.getClass().getSimpleName();
    }

    public T getValue() {
        return value;
    }

}
