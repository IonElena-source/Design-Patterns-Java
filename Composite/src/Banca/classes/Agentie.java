package Banca.classes;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements ISediu{
    List<ISediu> sedii;

    public Agentie() {
        this.sedii=new ArrayList<>();
    }

    @Override
    public void afiseazaDescrire() {
        for(ISediu sediu:sedii){
            sediu.afiseazaDescrire();
        }
    }

    @Override
    public void adaugaNod(ISediu sediu) {
        this.sedii.add(sediu);
    }

    @Override
    public void stergeNod(ISediu sediu) {
        this.sedii.remove(sediu);
    }

    @Override
    public ISediu getNod(int index) {
        if(index>=0 && index<this.sedii.size()){
            return this.sedii.get(index);
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
