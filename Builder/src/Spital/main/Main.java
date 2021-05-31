package Spital.main;

import Spital.classes.BuilderPacient;
import Spital.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new BuilderPacient().setAreHalatPentruInterior(true).build();
        System.out.println(pacient);
    }
}
