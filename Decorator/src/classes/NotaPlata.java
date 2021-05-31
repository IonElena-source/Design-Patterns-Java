package classes;

public class NotaPlata implements INota{
    private int sumaPlata;

    public NotaPlata(int sumaPlata) {
        this.sumaPlata = sumaPlata;
    }


    @Override
    public void printeaza() {
        System.out.println("S-a printat nota de "+sumaPlata);
    }
}
