package Sportiv.main;

import Sportiv.classes.Spectator;
import Sportiv.classes.SpectatorAbstract;
import Sportiv.classes.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator=new Spectator("Ionescu");
        spectator.intrareInStadion();
        System.out.println("---");
        SpectatorAbstract spectatorVIP=new SpectatorVIP("Elena");
        spectatorVIP.intrareInStadion();
    }
}
