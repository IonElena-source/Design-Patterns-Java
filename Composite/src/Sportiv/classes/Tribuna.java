package Sportiv.classes;

import java.util.ArrayList;
import java.util.List;

public class Tribuna implements ISectiune{
    List<ISectiune> subsectiuni;

    public Tribuna() {
        this.subsectiuni=new ArrayList<>();
    }

    @Override
    public void afiseazaDescriere() {
        for(ISectiune sectiune:subsectiuni){
            if(sectiune instanceof TribunaNord || sectiune instanceof TribunaSud){
                sectiune.afiseazaDescriere();
            }

        }
    }

    @Override
    public void adaugaNod(ISectiune sectiune) {
        this.subsectiuni.add(sectiune);
    }

    @Override
    public void stergeNod(ISectiune sectiune) {
        this.subsectiuni.remove(sectiune);
    }

    @Override
    public ISectiune getNod(int index) {
        if(index>=0 && index<this.subsectiuni.size() ){
            return this.subsectiuni.get(index);
        }else
        {
            throw new IndexOutOfBoundsException();
        }
    }
}
