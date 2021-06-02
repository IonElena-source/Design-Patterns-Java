package Sportiv.classes;

public class TribunaNord implements ISectiune{
    @Override
    public void afiseazaDescriere() {
        System.out.println("Tribuna Nord");
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
    public ISectiune getNod(int index) {
        throw new UnsupportedOperationException();
    }
}
