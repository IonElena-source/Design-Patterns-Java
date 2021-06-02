package Banca.classes;

public interface ISediu {
    void afiseazaDescrire();
    void adaugaNod(ISediu sediu);
    void stergeNod(ISediu sediu);
    ISediu getNod(int index);
}
