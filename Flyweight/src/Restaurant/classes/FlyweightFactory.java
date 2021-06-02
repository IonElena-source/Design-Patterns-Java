package Restaurant.classes;

import java.util.HashMap;

public class FlyweightFactory {
    HashMap<String,Flyweight> clienti;

    public FlyweightFactory() {
        clienti=new HashMap<>();
    }
    public Flyweight getClient(String numarTelefon){
        if(clienti.containsKey(numarTelefon)){
            return clienti.get(numarTelefon);
        }
        else {
            Client client=new Client("Client nou","072222222","clientnou@gmail.com");
            clienti.put(numarTelefon,client);
            return client;
        }
    }
}
