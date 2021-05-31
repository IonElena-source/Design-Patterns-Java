package Restaurant.classes;

public class BuilderRezervare implements IBuilder{
    Rezervare rezervare;
    public BuilderRezervare setAreAsezareLaGeam(boolean areAsezareLaGeam){
        this.rezervare.setAreAsezareLaGeam(areAsezareLaGeam);
        return this;
    }

    public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic){
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }
    public BuilderRezervare setAreMasaDecorata(boolean areMasaDecorata){
        this.rezervare.setAreMasaDecorata(areMasaDecorata);
        return this;
    }
    public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala){
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }
    public BuilderRezervare setGenMuzica(String genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public BuilderRezervare() {
        this.rezervare=new Rezervare(false,false,false,false,"Muzica");
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
