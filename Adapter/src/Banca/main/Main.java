package Banca.main;

import Banca.classes.AdapterObiecte;
import Banca.classes.Credit;
import Banca.classes.CreditLeasing;
import Banca.classes.ICredit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ICredit> credite=new ArrayList<>();
        for(int i=0;i<10;i++){
            credite.add(new Credit());
        }

        for(int i=0;i<credite.size();i++){
            credite.get(i).oferaCredit(250);
        }

        CreditLeasing creditLeasing=new CreditLeasing();
        ICredit adapterLeasing2Credit=new AdapterObiecte(creditLeasing);
        credite.add(adapterLeasing2Credit);
        System.out.println("-----");
        for(int i=0;i<credite.size();i++){
            credite.get(i).oferaCredit(250);
        }

    }
}
