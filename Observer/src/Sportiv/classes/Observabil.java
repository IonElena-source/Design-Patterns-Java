package Sportiv.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    List<Observer> clienti;

    public Observabil() {
        this.clienti=new ArrayList<>();
    }
    public void adaugaObservator(Observer observer){
        this.clienti.add(observer);
    }
    public void stergeObserver(Observer observer){
        this.clienti.remove(observer);
    }
    public void trimiteNotificare(String mesaj){
        for(Observer observer:this.clienti){
            observer.primesteNotificare(mesaj);
        }
    }
}
