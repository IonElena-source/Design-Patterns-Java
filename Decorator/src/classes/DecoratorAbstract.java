package classes;

public abstract class DecoratorAbstract implements INota{
    private INota iNota;

    public DecoratorAbstract(INota iNota) {
        this.iNota = iNota;
    }

    @Override
    public void printeaza() {
       this.iNota.printeaza();
    }
    public abstract void printeazaFelicitare();
}
