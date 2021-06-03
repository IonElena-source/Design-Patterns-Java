package Restaurant.classes;

public class NotificatorEmail extends INotificator {
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getEmail()!=null){
            System.out.println("Trimit mail catre clientul "+client.getNume());
        }
        else {
            System.out.println("Domnule manager, va trimitem clientul "+client.getNume());
        }
    }
}
