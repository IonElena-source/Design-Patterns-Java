package Farmacie.classes;

public class BuilderFactura implements IBuilder{
    Factura factura;

    public BuilderFactura arePungi(int nrPungi){
        this.factura.setNrPungi(nrPungi);
        return this;
    }

    public BuilderFactura platesteCuCard(int plataCard){
        this.factura.setPlataCuCard(plataCard);
        return this;
    }
    public BuilderFactura arePuncteFidelitate(int puncteFidelitate){
        this.factura.setPuncteFidelitate(puncteFidelitate);
        return this;
    }
    public BuilderFactura areCotaTVA(int cotaTVA){
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }

    public BuilderFactura() {
        this.factura=new Factura(0,0,0,0);

    }

    @Override
    public Factura build() {
        return this.factura;
    }
}
