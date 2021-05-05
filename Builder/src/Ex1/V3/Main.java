package Ex1.V3;

public class Main {
    public static void main(String[] args) {
        Rezervare.RezervareBuilder rezervareBuilder=new Rezervare.RezervareBuilder()
                .setAreMuzicaAmbientala(true).setGenMuzica("Pop");
            Rezervare rezervare=new Rezervare(rezervareBuilder);
        System.out.println(rezervare);

        Rezervare rezervare1=rezervareBuilder.setAreBautura(true).build();
        System.out.println(rezervare1);
        System.out.println(rezervare);

    }
}
