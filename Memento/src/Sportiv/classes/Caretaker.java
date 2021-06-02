package Sportiv.classes;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList;

    public Caretaker() {
        this.mementoList=new ArrayList<>();
    }
    public void adaugaMemento(Memento memento){
        this.mementoList.add(memento);
    }
    public Memento getMemento(int index){
        if(index >=0 && index< mementoList.size()){
            return mementoList.get(index);
        }
        return null;
    }
    public Memento getLastMemento(){
        return  mementoList.get(mementoList.size()-1);
    }
}
