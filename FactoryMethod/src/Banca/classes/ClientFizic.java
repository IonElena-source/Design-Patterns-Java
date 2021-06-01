package Banca.classes;

public class ClientFizic extends Client{

    public ClientFizic(String numeClient, int soldBancar) {
        super(numeClient, soldBancar);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientFizic");
        sb.append("Denumire: ");
        sb.append(super.getNumeClient());
        sb.append(super.getSoldBancar());
        return sb.toString();
    }
}
