import clase.FactoryAsistent;
import clase.FactoryInfirmier;
import clase.FactoryMedic;
import clase.PersonalSpital;
import clase.IFactory;
public class Main {
    public static void afisareAngajat(IFactory factory,String nume){
        PersonalSpital personalSpital=factory.getPersonal(nume);
        System.out.println(personalSpital);
    }
    public static void main(String[] args) {
        afisareAngajat(new FactoryAsistent(),"Mircea");
        afisareAngajat(new FactoryMedic(),"Vasile");
        afisareAngajat(new FactoryInfirmier(),"Ilie");


    }
}
