package Spital.classes;

public class BuilderPacient implements AbstractBuilderPacient{
    private Pacient pacient;

    public BuilderPacient setArePatRabatabil(boolean arePatRabatabil){
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public BuilderPacient setAreMicDejun(boolean areMicDejun){
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public BuilderPacient setArePapuciCamera(boolean arePapuciCamera){
        this.pacient.setArePapuciCamera(arePapuciCamera);
        return this;
    }
    public BuilderPacient setAreHalatPentruInterior(boolean areHalatPentruInterior){
        this.pacient.setAreHalatPentruInterior(areHalatPentruInterior);
        return this;
    }

    public BuilderPacient() {
        this.pacient=new Pacient(false,false,false,false);
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }
}
