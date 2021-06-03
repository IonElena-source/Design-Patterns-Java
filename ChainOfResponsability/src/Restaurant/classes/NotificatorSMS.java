package Restaurant.classes;

public class NotificatorSMS extends INotificator{
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getNumarTelefon()!=null){
            System.out.println("Trimit mesaj catre clientul "+client.getNumarTelefon());
        }
        else {
            if(super.getUrmatorulNotificator()!=null){
                super.getUrmatorulNotificator().trimiteNotificare(client,text);
            }
        }
    }
}
