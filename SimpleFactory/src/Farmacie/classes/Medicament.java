package Farmacie.classes;

public class Medicament {
    private String denumire;
    private int pret;

    public Medicament(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }
}
