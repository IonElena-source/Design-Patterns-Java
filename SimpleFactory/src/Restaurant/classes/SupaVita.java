package Restaurant.classes;

public class SupaVita extends Supa{

    public SupaVita(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita ");
        sb.append("Pret: ");
        sb.append(super.getPret());
        return sb.toString();
    }
}
