package Sportiv.classes;

public class FactoryAtacant implements IFactory{
    @Override
    public Jucator getJucator(String denumire) {
        return new Atacant(denumire);
    }

}
