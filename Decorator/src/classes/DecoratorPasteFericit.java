package classes;

public class DecoratorPasteFericit extends DecoratorAbstract{
    public DecoratorPasteFericit(INota iNota) {
        super(iNota);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("Paste Fericit");
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare:Paste Fericit ");
    }
}
