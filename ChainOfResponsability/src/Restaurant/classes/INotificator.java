package Restaurant.classes;

public abstract class INotificator {
    INotificator urmatorulNotificator;

    public void setUrmatorulNotificator(INotificator urmatorulNotificator) {
        this.urmatorulNotificator = urmatorulNotificator;
    }

    public abstract void trimiteNotificare(Client client,String text);

    public INotificator getUrmatorulNotificator() {
        return urmatorulNotificator;
    }
}
