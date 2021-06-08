package Sportiv.main;

import Sportiv.classes.Client;
import Sportiv.classes.ManagerSala;
import Sportiv.classes.Observer;

public class Main {
    public static void main(String[] args) {
        Observer observer=new Client("Elena");
        Observer observer1=new Client("Ioana");
        Observer observer2=new Client("Ion");
        ManagerSala managerSala=new ManagerSala();
        managerSala.adaugaObservator(observer);
        managerSala.adaugaObservator(observer1);
        managerSala.adaugaObservator(observer2);
        managerSala.anuntaMeci("Fotbal");
        managerSala.stergeObserver(observer2);
        System.out.println("Dupa dezabonarea lui Ion");
        managerSala.anuntaMeci("VOLEI");

    }
}
