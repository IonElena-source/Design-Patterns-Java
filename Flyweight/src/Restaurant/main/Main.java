package Restaurant.main;

import Restaurant.classes.Client;
import Restaurant.classes.FlyweightFactory;
import Restaurant.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare(10,2,3);
        Rezervare rezervare2=new Rezervare(20,3,2);
        Rezervare rezervare3=new Rezervare(21,9,16);
        Rezervare rezervare4=new Rezervare(11,19,18);
        FlyweightFactory factory=new FlyweightFactory();
        Client client= (Client) factory.getClient("07255");
        client.printeazaRezervare(rezervare1);
        factory.getClient("07255").printeazaRezervare(rezervare2);

        factory.getClient("078888").printeazaRezervare(rezervare3);
        factory.getClient("078888").printeazaRezervare(rezervare4);
    }
}
