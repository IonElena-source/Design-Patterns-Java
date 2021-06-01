package Restaurant.classes;

public class FactorySupa {
    public static  Supa getSupa(TipSupa tipSupa,int pret){
        switch (tipSupa){
            case SupaCiuperci:
                return new SupaCiuperci(pret);
            case SupaLeguma:
                return new SupaLegume(pret);
            case SupaVita:
                return new SupaVita(pret);
            default:
                throw  new UnsupportedOperationException();
        }
    }
}
