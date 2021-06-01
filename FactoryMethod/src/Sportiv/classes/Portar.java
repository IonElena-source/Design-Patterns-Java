package Sportiv.classes;

public class Portar extends Jucator{
    public Portar(String denumire) {
        super(denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar: ");
        sb.append(super.getDenumire());
        return sb.toString();
    }
}
