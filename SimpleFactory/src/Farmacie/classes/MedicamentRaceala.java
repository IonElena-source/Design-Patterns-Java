package Farmacie.classes;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentRaceala{");
        sb.append("Denumire: ");
        sb.append(super.getDenumire());
        sb.append("Pret ");
        sb.append(super.getPret());
        return sb.toString();
    }
}
