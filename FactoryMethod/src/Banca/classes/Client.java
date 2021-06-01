package Banca.classes;

public abstract  class Client {
    private String numeClient;
    private int soldBancar;

    public Client(String numeClient, int soldBancar) {
        this.numeClient = numeClient;
        this.soldBancar = soldBancar;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getSoldBancar() {
        return soldBancar;
    }
}
