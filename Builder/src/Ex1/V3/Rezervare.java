package Ex1.V3;

public class Rezervare {
    private boolean areMancare;
    private boolean areBautura;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public boolean isAreMancare() {
        return areMancare;
    }

    public boolean isAreBautura() {
        return areBautura;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public boolean isAreMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public Rezervare(RezervareBuilder rezervareBuilder) {
        this.areBautura = rezervareBuilder.areBautura;
        this.areMancare = rezervareBuilder.areMancare;
        this.areMuzicaAmbientala = rezervareBuilder.areMuzicaAmbientala;
        this.areScaunErgonomic = rezervareBuilder.areScaunErgonomic;
        this.genMuzica = rezervareBuilder.genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("areMancare=").append(areMancare);
        sb.append(", areBautura=").append(areBautura);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements IBuilder {
        private boolean areMancare;
        private boolean areBautura;
        private boolean areScaunErgonomic;
        private boolean areMuzicaAmbientala;
        private String genMuzica;

        public RezervareBuilder setAreMancare(boolean areMancare) {
            this.areMancare = areMancare;
            return this;
        }

        public RezervareBuilder setAreBautura(boolean areBautura) {
            this.areBautura = areBautura;
            return this;
        }

        public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
            this.areScaunErgonomic = areScaunErgonomic;
            return this;
        }

        public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
            this.areMuzicaAmbientala = areMuzicaAmbientala;
            return this;
        }

        public RezervareBuilder setGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}
