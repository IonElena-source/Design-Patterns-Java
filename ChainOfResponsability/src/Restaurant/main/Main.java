package Restaurant.main;

import Restaurant.classes.Client;
import Restaurant.classes.INotificator;
import Restaurant.classes.NotificatorEmail;
import Restaurant.classes.NotificatorSMS;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Elena",null,null);
        INotificator notificatorSMS=new NotificatorSMS();
        INotificator notificatorEmail=new NotificatorEmail();
        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorSMS.trimiteNotificare(client,"hei");

        Client client2=new Client("Ion","0722546733",null);
        notificatorSMS.trimiteNotificare(client2,"heeeii");
        Client client3=new Client("Ion",null,"client@gmail.com");
        notificatorSMS.trimiteNotificare(client3,"heei");
    }
}
