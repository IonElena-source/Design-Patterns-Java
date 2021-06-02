package Sportiv.classes;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Eu, "+this.nume+"am primit mesajul "+mesaj);
    }
}
