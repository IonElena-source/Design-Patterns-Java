package Sportiv.main;

import Sportiv.classes.IVanzare;
import Sportiv.classes.Persoana;
import Sportiv.classes.ProxyVanzare;
import Sportiv.classes.VanzareBilet;

public class Main {
    public static void main(String[] args) {

        IVanzare vanzareBilet=new VanzareBilet();
        Persoana persoana=new Persoana("Elena",8);
        vanzareBilet.vindeBilet(persoana);

        IVanzare vanzareProxy=new ProxyVanzare(vanzareBilet);
        vanzareProxy.vindeBilet(persoana);
    }
}
