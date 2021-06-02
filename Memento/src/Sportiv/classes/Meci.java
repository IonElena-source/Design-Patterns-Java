package Sportiv.classes;

public class Meci {
    private String dataMeci;
    private String echipa1;
    private String echipa2;
    private int numarBilete;
    private int numarSpectatori;

    public Meci(String dataMeci, String echipa1, String echipa2, int numarBilete, int numarSpectatori) {
        this.dataMeci = dataMeci;
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.numarBilete = numarBilete;
        this.numarSpectatori = numarSpectatori;
    }

    public String getDataMeci() {
        return dataMeci;
    }

    public void setDataMeci(String dataMeci) {
        this.dataMeci = dataMeci;
    }

    public String getEchipa1() {
        return echipa1;
    }

    public void setEchipa1(String echipa1) {
        this.echipa1 = echipa1;
    }

    public String getEchipa2() {
        return echipa2;
    }

    public void setEchipa2(String echipa2) {
        this.echipa2 = echipa2;
    }

    public int getNumarBilete() {
        return numarBilete;
    }

    public void setNumarBilete(int numarBilete) {
        this.numarBilete = numarBilete;
    }

    public int getNumarSpectatori() {
        return numarSpectatori;
    }

    public void setNumarSpectatori(int numarSpectatori) {
        this.numarSpectatori = numarSpectatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("dataMeci='").append(dataMeci).append('\'');
        sb.append(", echipa1='").append(echipa1).append('\'');
        sb.append(", echipa2='").append(echipa2).append('\'');
        sb.append(", numarBilete=").append(numarBilete);
        sb.append(", numarSpectatori=").append(numarSpectatori);
        sb.append('}');
        return sb.toString();
    }

    public Memento salvareMemento(){
        Memento memento=new Memento(this.numarSpectatori,this.echipa1,this.echipa2,this.dataMeci);
        return memento;
    }
    public void restaurareMemento(Memento memento){
        this.dataMeci=memento.getDataMeci();
        this.echipa1=memento.getEchipa1();
        this.echipa2= memento.getEchipa2();
        this.numarSpectatori=memento.getNumarSpectatori();
    }
}
