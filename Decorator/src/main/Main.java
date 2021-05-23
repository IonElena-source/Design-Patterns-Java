package main;

import classes.*;

public class Main {
    public static void main(String[] args) {
        INota nota=new NotaPlata(25);
        nota.printeaza();

        DecoratorAbstract decoratorPasteFericit=new DecoratorPasteFericit(nota);
        decoratorPasteFericit.printeaza();

        DecoratorAbstract decoratorLaMultiAni=new DecoratorLaMultiAni(nota);
        decoratorLaMultiAni.printeaza();
        DecoratorAbstract decoratorCascada=new DecoratorLaMultiAni(decoratorPasteFericit);
        decoratorCascada.printeaza();
    }
}
