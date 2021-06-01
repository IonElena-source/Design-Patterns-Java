package Banca.main;

import Banca.classes.Client;
import Banca.classes.FactoryClientFizic;
import Banca.classes.FactoryClientJuridic;

public class Main {
    public static void main(String[] args) {
        FactoryClientFizic factoryClientFizic=new FactoryClientFizic();
        FactoryClientJuridic factoryClientJuridic=new FactoryClientJuridic();
        Client clientFizic=factoryClientFizic.getClient("Elena",250);
        Client clientJuridic=factoryClientJuridic.getClient("SA.SRL",3999);
        System.out.println(clientFizic);
        System.out.println(clientJuridic);
    }
}
