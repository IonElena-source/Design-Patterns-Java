package Sportiv.classes;

import Banca.classes.ISediu;

public interface ISectiune {
    void afiseazaDescriere();
    void adaugaNod(ISectiune sectiune);
    void stergeNod(ISectiune sectiune);
    ISectiune getNod(int index);
}
