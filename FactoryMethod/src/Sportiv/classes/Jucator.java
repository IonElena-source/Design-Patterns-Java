package Sportiv.classes;

public abstract class Jucator {
    private String denumire;

    public Jucator(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }
}
