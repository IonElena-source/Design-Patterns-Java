package Banca.classes;

public class FactoryClientJuridic implements IFactory{
    @Override
    public Client getClient(String denumire, int soldBancar) {
        return new ClientJuridic(denumire,soldBancar);
    }
}
