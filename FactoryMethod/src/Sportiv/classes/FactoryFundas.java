package Sportiv.classes;

public class FactoryFundas implements IFactory{
    @Override
    public Jucator getJucator(String denumire) {
        return new Fundas(denumire);
    }
}
