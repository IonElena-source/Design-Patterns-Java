package Sportiv.classes;

public class Atacant extends Jucator{
    public Atacant(String denumire) {
        super(denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant: ");
        sb.append(super.getDenumire());

        return sb.toString();
    }
}
