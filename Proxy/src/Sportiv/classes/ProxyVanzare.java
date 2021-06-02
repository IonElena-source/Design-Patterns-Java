package Sportiv.classes;

public class ProxyVanzare implements IVanzare{
    IVanzare vanzare;

    public ProxyVanzare(IVanzare vanzare) {
        this.vanzare = vanzare;
    }

    @Override
    public void vindeBilet(Persoana persoana) {
        if(persoana.getVarsta()>=14){
            vanzare.vindeBilet(persoana);
        }
        else {
            System.out.println("Nu aveti varsta potrivita pentru bilet");
        }
    }
}
