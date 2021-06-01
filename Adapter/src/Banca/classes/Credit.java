package Banca.classes;

public class Credit implements ICredit{
    @Override
    public void oferaCredit(int soldBancar) {
        System.out.println("A fost oferit un credit simplu de "+soldBancar);
    }
}
