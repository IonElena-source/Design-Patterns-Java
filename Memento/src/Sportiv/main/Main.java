package Sportiv.main;

import Sportiv.classes.Caretaker;
import Sportiv.classes.Meci;
import Sportiv.classes.Memento;

public class Main {
    public static void main(String[] args) {
        Meci meci=new Meci("12/08/2021","Echipa1","Echipa2",23,20);
        Caretaker caretaker=new Caretaker();
        caretaker.adaugaMemento(meci.salvareMemento());
        meci.setEchipa1("Echipa 1 Rezerva");
        System.out.println(meci);
        meci.setDataMeci("28/02/2021");
        caretaker.adaugaMemento(meci.salvareMemento());
        meci.restaurareMemento(caretaker.getMemento(0));
        System.out.println(meci);
    }
}
