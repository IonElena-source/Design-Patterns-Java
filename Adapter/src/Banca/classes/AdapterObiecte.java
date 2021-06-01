package Banca.classes;

public class AdapterObiecte implements ICredit{
    CreditLeasing creditLeasing;

    public AdapterObiecte(CreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public void oferaCredit(int soldBancar) {
        this.creditLeasing.oferaCreditLeasing(soldBancar);
    }
}
