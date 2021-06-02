package Banca.main;

import Banca.classes.Agentie;
import Banca.classes.Filiala;
import Banca.classes.ISediu;

public class Main {
    public static void main(String[] args) {
        ISediu filiala=new Filiala("Filiala 1");
        ISediu filiala2=new Filiala("Filiala 2");
        ISediu filiala3=new Filiala("Filiala 3");
        ISediu agentie=new Agentie();
        agentie.adaugaNod(filiala);
        agentie.adaugaNod(filiala2);
        ISediu agentie2=new Agentie();
        agentie2.adaugaNod(agentie);
        agentie2.adaugaNod(filiala3);

        agentie.afiseazaDescrire();

        agentie2.afiseazaDescrire();

        agentie2.stergeNod(filiala3);
    }
}
