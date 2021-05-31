package Restaurant.classes;

public class Rezervare {
    private boolean areAsezareLaGeam;
    private boolean areScaunErgonomic;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

     Rezervare(boolean areAsezareLaGeam, boolean areScaunErgonomic, boolean areMasaDecorata, boolean areMuzicaAmbientala, String genMuzica) {
        this.areAsezareLaGeam = areAsezareLaGeam;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMasaDecorata = areMasaDecorata;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

     void setAreAsezareLaGeam(boolean areAsezareLaGeam) {
        this.areAsezareLaGeam = areAsezareLaGeam;
    }

     void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

     void setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
    }

     void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

     void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("areAsezareLaGeam=").append(areAsezareLaGeam);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areMasaDecorata=").append(areMasaDecorata);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
