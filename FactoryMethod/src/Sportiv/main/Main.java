package Sportiv.main;

import Sportiv.classes.*;

public class Main {
    public static void main(String[] args) {
        IFactory factoryAtacant=new FactoryAtacant();
        IFactory factoryPortar=new FactoryPortar();
        IFactory factoryFundas=new FactoryFundas();
        Jucator atacant=factoryAtacant.getJucator("Ion");
        Jucator fundas=factoryFundas.getJucator("Mihai");
        Jucator portar=factoryPortar.getJucator("Alex");
        System.out.println(atacant);
        System.out.println(fundas);
        System.out.println(portar);

    }
}
