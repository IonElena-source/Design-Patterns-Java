package Banca.classes;

public class ProxyOperator implements IOperator{
    IOperator operator;

    public ProxyOperator(IOperator operator) {
        this.operator = operator;
    }

    @Override
    public void oferaCredit(Moneda moneda, int suma) {
        if(moneda.equals(Moneda.RON)){
            operator.oferaCredit(moneda,suma);
        }
        else {
            System.out.println("Nu va putem oferi creditul");
        }
    }
}
