package Main;

import Clase.Bilet;
import Clase.BiletAdapter;
import Clase.BiletAdaptorClase;
import Clase.EBiletOnline;

public class Main {
    public static void rezervaSiVindeBiletOnline(EBiletOnline eBiletOnline){
        eBiletOnline.rezervaBiletOnline();
        eBiletOnline.vindeBiletOnline();
    }
    private static void rezervaSiVindeBiletLaCasa(Bilet bilet){
        bilet.vanzare();
        bilet.rezervare();
    }
    public static void main(String[] args) {
        Bilet bilet=new Bilet(24.5F);
        rezervaSiVindeBiletLaCasa(bilet);

        EBiletOnline eBiletOnline=new BiletAdapter(bilet);
        eBiletOnline.rezervaBiletOnline();
        eBiletOnline.vindeBiletOnline();

        EBiletOnline eBiletOnline1=new BiletAdaptorClase(25);
        eBiletOnline1.rezervaBiletOnline();
        eBiletOnline1.vindeBiletOnline();
    }
}
