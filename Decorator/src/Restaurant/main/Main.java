package Restaurant.main;

import Restaurant.classes.DecoratorLaMultiAni;
import Restaurant.classes.DecoratorPasteFericit;
import Restaurant.classes.INota;
import Restaurant.classes.NotaPlata;

public class Main {
    public static void main(String[] args) {
        INota nota=new NotaPlata();
        nota.afiseazaNota(28);

        INota decoratorLaMultiAni=new DecoratorLaMultiAni(nota);
        decoratorLaMultiAni.afiseazaNota(29);

        INota decoratorPaste=new DecoratorPasteFericit(nota) ;
        decoratorPaste.afiseazaNota(29);

        INota decoratorPaste2=new DecoratorPasteFericit(decoratorLaMultiAni) ;
        decoratorPaste2.afiseazaNota(29);
    }
}
