package Restaurant.classes;

public class SupaLegume extends Supa{
    public SupaLegume(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume ");
        sb.append("Pret: ");
        sb.append(super.getPret());
        return sb.toString();
    }
}
