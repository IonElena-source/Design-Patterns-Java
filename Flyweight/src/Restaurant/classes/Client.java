package Restaurant.classes;

public class Client implements Flyweight{
    private String nume;
    private String numarTelefon;
    private String email;

    public Client(String nume, String numarTelefon, String email) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
        System.out.println("Apel constructor");
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Client"+this.toString()+"Rezervare"+rezervare.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
