package Sportiv.classes;

public class FactoryPortar implements IFactory{
    @Override
    public Jucator getJucator(String denumire) {
        return new Portar(denumire);
    }
}
