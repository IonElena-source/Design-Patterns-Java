package Sportiv.classes;

public class Fundas extends Jucator{
    public Fundas(String denumire) {
        super(denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas: ");
        sb.append(super.getDenumire());
        return sb.toString();
    }
}
