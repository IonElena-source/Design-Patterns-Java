package classes;

public class DecoratorLaMultiAni extends DecoratorAbstract{
    public DecoratorLaMultiAni(INota iNota) {
        super(iNota);
    }

    @Override
    public void printeaza() {
        super.printeaza();
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare de La Multi Ani");
    }


}
