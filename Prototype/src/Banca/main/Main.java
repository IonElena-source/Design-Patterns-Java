package Banca.main;

import Banca.classes.Client;
import Banca.classes.IClient;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("ion",250);
        Client client2= (Client) client.copiaza();
        System.out.println(client);
        System.out.println(client2);
        client2.setDenumire("Elena");
        System.out.println("------------");
        System.out.println(client);
        System.out.println(client2);
    }
}
