package Sportiv.Clase;

public class BiletAdaptorClase extends Bilet implements EBiletOnline{
    public BiletAdaptorClase(float pret) {
        super(pret);
    }

    @Override
    public void vindeBiletOnline() {
        super.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        super.rezervare();
    }
}
