package Farmacie.classes;

public class MedicamentBody extends Medicament {
    public MedicamentBody(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentBody");
        sb.append("Denumire: ");
        sb.append(super.getDenumire());
        sb.append("Pret ");
        sb.append(super.getPret());
        return sb.toString();
    }
}
