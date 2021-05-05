package Ex1.V2;

public class Rezervare {
    private boolean areMancare;
    private boolean areBautura;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public Rezervare(boolean areMancare, boolean areBautura, boolean areScaunErgonomic, boolean areMuzicaAmbientala, String genMuzica) {
        this.areMancare = areMancare;
        this.areBautura = areBautura;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

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
    public static class RezervareBuilder implements IBuilder{

        Rezervare rezervare;
        public  RezervareBuilder setAreMancare(boolean areMancare){
            this.rezervare.areMancare=areMancare;
            return this;
        }
        public RezervareBuilder setAreBautura(boolean areBautura){
            this.rezervare.areBautura=areBautura;
            return this;
        }
        public RezervareBuilder setAreScaun(boolean areScaun){
            this.rezervare.areScaunErgonomic=areScaun;
            return this;
        }
        public RezervareBuilder setAreMuzica(boolean areMuzica){
            this.rezervare.areMuzicaAmbientala=areMuzica;
            return this;

        }
        public RezervareBuilder setGenMuzica(String genMuzica){
            this.rezervare.genMuzica=genMuzica;
            return this;
        }

        public RezervareBuilder() {
            this.rezervare = new Rezervare(false,false,false,false,"");
        }

        @Override
        public Rezervare build() {
            return this.rezervare;
        }
    }
}
