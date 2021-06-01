package Banca.classes;

public class FactoryClientFizic implements IFactory{
    @Override
    public Client getClient(String denumire, int soldBancar) {
        return new ClientFizic(denumire,soldBancar);
    }
}
