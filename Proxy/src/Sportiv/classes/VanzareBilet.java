package Sportiv.classes;

public class VanzareBilet implements IVanzare{
    @Override
    public void vindeBilet(Persoana persoana) {
        System.out.println("S-a vandut biletul catre persoana "+persoana.getNume()+"cu varsta de "+persoana.getVarsta());
    }
}
