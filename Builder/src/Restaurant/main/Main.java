package Restaurant.main;

import Restaurant.classes.BuilderRezervare;
import Restaurant.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new BuilderRezervare().setAreMasaDecorata(true).setGenMuzica("Rock").build();
        System.out.println(rezervare);
    }
}
