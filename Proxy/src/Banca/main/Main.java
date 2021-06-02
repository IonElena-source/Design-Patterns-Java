package Banca.main;

import Banca.classes.IOperator;
import Banca.classes.Moneda;
import Banca.classes.OperatorCredit;
import Banca.classes.ProxyOperator;

public class Main {
    public static void main(String[] args) {
        IOperator operator=new OperatorCredit();
        operator.oferaCredit(Moneda.USD,250);
        IOperator operatorProxy=new ProxyOperator(operator);
        operatorProxy.oferaCredit(Moneda.USD,204);
        operatorProxy.oferaCredit(Moneda.RON,290);

    }
}
