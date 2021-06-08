package RegistruConexiuni.clase;

public class ConexiuneBD {
    private String denumire;
    private int nrInregistrari;
    private int nrTabele;

     public ConexiuneBD(String denumire, int nrInregistrari, int nrTabele) {
        this.denumire = denumire;
        this.nrInregistrari = nrInregistrari;
        this.nrTabele = nrTabele;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConexiuneBD{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrInregistrari=").append(nrInregistrari);
        sb.append(", nrTabele=").append(nrTabele);
        sb.append('}');
        return sb.toString();
    }
}
