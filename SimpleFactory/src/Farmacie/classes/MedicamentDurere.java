package Farmacie.classes;

public class MedicamentDurere extends Medicament {
    public MedicamentDurere(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentDurere{");
        sb.append("Denumire: ");
        sb.append(super.getDenumire());
        sb.append("Pret ");
        sb.append(super.getPret());
        return sb.toString();
    }
}
