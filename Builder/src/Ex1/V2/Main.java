package Ex1.V2;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare.RezervareBuilder().setAreBautura(true).build();
        System.out.println(rezervare1);
        Rezervare rezervare2=new Rezervare.RezervareBuilder().setGenMuzica("Pop").build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
