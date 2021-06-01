package Banca.classes;

public class ClientJuridic extends Client{
    public ClientJuridic(String numeClient, int soldBancar) {
        super(numeClient, soldBancar);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientJuridic{");
        sb.append("Denumire client ");
        sb.append(super.getNumeClient());
        sb.append(super.getSoldBancar());
        return sb.toString();
    }
}
