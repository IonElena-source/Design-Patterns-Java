package Banca.classes;

public class Filiala implements ISediu{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaDescrire() {
        System.out.println("Filiala "+this.nume);
    }

    @Override
    public void adaugaNod(ISediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ISediu sediu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ISediu getNod(int index) {
        throw new UnsupportedOperationException();
    }
}
