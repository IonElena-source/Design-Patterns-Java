package Farmacie.classes;

public class FactoryMedicament {
    public static Medicament getMedicament(TipMedicament tipMedicament, String denumire, int pret){
        switch (tipMedicament){
            case Body:
                return new MedicamentBody(denumire,pret);
            case Durere:
                return new MedicamentDurere(denumire,pret);
            case Raceala:
                return new MedicamentRaceala(denumire,pret);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
