package Farmacie.main;

import Farmacie.classes.FactoryMedicament;
import Farmacie.classes.Medicament;
import Farmacie.classes.TipMedicament;

public class Main {
    public static void main(String[] args) {
        Medicament paracetamol= FactoryMedicament.getMedicament(TipMedicament.Raceala,"Paracetamol",43);
        Medicament tador= FactoryMedicament.getMedicament(TipMedicament.Durere,"Tador",23);
        Medicament aspirina= FactoryMedicament.getMedicament(TipMedicament.Body,"Aspirina",23);
        System.out.println(paracetamol);
        System.out.println(tador);
        System.out.println(aspirina);
    }
}
