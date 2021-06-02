package Sportiv.classes;

public class TribunaSud implements ISectiune{
    @Override
    public void afiseazaDescriere() {
        System.out.println("Tribuna SUD");
    }

    @Override
    public void adaugaNod(ISectiune sectiune) {
            throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ISectiune sectiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ISectiune getNod(int  index) {
        throw new UnsupportedOperationException();
    }
}
