package Ex1.V1;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder =new RezervareBuilder();
        Rezervare rezervare=rezervareBuilder.setAreBautura(true).build();
        System.out.println(rezervare.toString());
    }
}
