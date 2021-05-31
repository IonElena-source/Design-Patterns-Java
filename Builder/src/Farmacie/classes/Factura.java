package Farmacie.classes;

public class Factura {
    private int nrPungi;
    private  int plataCuCard;
    private int puncteFidelitate;
    private int cotaTVA;

     Factura(int nrPungi, int plataCuCard, int puncteFidelitate, int cotaTVA) {
        this.nrPungi = nrPungi;
        this.plataCuCard = plataCuCard;
        this.puncteFidelitate = puncteFidelitate;
        this.cotaTVA = cotaTVA;
    }

     void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

     void setPlataCuCard(int plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

     void setPuncteFidelitate(int puncteFidelitate) {
        this.puncteFidelitate = puncteFidelitate;
    }

     void setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("nrPungi=").append(nrPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", puncteFidelitate=").append(puncteFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
