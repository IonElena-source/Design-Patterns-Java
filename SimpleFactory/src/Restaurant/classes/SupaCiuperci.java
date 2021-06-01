package Restaurant.classes;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(int pret) {
        super(pret);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci ");
        sb.append("Pret ");
        sb.append(super.getPret());
        return sb.toString();
    }
}
