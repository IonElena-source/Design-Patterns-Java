package Sportiv.classes;

public class SpectatorVIP extends SpectatorAbstract{
    private String nume;

    public SpectatorVIP(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareLaCoada() {
        System.out.println(this.nume+" nu  a mai stat la coada");
    }

    @Override
    public void prezentareBilet() {
        System.out.println(this.nume+"a prezenatt biletul VIP");
    }

    @Override
    public void realizareControlCorporal() {
        System.out.println(this.nume+" e controlat");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume+"o ocupat locul de VIP");
    }
}
