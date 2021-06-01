package Restaurant.main;

import Restaurant.classes.FactorySupa;
import Restaurant.classes.Supa;
import Restaurant.classes.TipSupa;

public class Main {
    public static void main(String[] args) {
        Supa supaCiuperci= FactorySupa.getSupa(TipSupa.SupaCiuperci,24);
        Supa supaLegume=FactorySupa.getSupa(TipSupa.SupaLeguma,26);
        Supa supaVita=FactorySupa.getSupa(TipSupa.SupaVita,90);
        System.out.println(supaCiuperci);
        System.out.println(supaLegume);
        System.out.println(supaVita);
    }
}
