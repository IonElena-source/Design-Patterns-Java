package Banca.classes;

public class Client implements IClient {

    private String denumire;
    private int soldBancar;

    public Client(String denumire, int soldBancar) {
        this.denumire = denumire;
        this.soldBancar = soldBancar;
    }
    private Client(){

    }

    @Override
    public IClient copiaza() {
        Client client=new Client();
        client.denumire=this.denumire;
        client.soldBancar=this.soldBancar;
        return client;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getSoldBancar() {
        return soldBancar;
    }

    public void setSoldBancar(int soldBancar) {
        this.soldBancar = soldBancar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", soldBancar=").append(soldBancar);
        sb.append('}');
        return sb.toString();
    }
}
