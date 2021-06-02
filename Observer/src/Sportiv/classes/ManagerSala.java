package Sportiv.classes;

public class ManagerSala extends Observabil{
    public void anuntaMeci(String meci){
        String mesaj="Are loc un meci de tip "+meci;
        super.trimiteNotificare(mesaj);
    }
}
