package Restaurant.classes;

public class Rezervare {
    private int nrMasa;
    private int numarPersoane;
    private int oraRezervare;

    public Rezervare(int nrMasa, int numarPersoane, int oraRezervare) {
        this.nrMasa = nrMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append('}');
        return sb.toString();
    }
}
