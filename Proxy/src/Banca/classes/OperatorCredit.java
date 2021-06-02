package Banca.classes;

public class OperatorCredit implements IOperator{
    @Override
    public void oferaCredit(Moneda moneda, int suma) {
        System.out.println("S-a oferit creditul de "+suma+"in "+moneda);
    }
}
