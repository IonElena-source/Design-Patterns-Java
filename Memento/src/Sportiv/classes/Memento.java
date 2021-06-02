package Sportiv.classes;

public class Memento {
    private int numarSpectatori;
    private String echipa1;
    private String echipa2;
    private String dataMeci;

    public Memento(int numarSpectatori, String echipa1, String echipa2, String dataMeci) {
        this.numarSpectatori = numarSpectatori;
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.dataMeci = dataMeci;
    }

    public int getNumarSpectatori() {
        return numarSpectatori;
    }

    public String getEchipa1() {
        return echipa1;
    }

    public String getEchipa2() {
        return echipa2;
    }

    public String getDataMeci() {
        return dataMeci;
    }

}
