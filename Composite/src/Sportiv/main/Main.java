package Sportiv.main;

import Sportiv.classes.ISectiune;
import Sportiv.classes.Tribuna;
import Sportiv.classes.TribunaNord;
import Sportiv.classes.TribunaSud;

public class Main {
    public static void main(String[] args) {
        ISectiune tribuna=new Tribuna();
        ISectiune tribunaNord=new TribunaNord();
        ISectiune tribunaSUD=new TribunaSud();
        tribuna.adaugaNod(tribunaNord);
        tribuna.adaugaNod(tribunaSUD);
        tribuna.afiseazaDescriere();
        Tribuna tribuna1=new Tribuna();
        tribuna1.adaugaNod(tribuna1);
        tribuna1.adaugaNod(new TribunaSud());
        tribuna1.afiseazaDescriere();
   }
}
