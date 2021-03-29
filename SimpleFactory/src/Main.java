import clase.FactoryPersonal;
import clase.PersonalSpital;
import clase.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal=new FactoryPersonal();
        PersonalSpital asistent=factoryPersonal.createPersonal(TipPersonal.Asistent,"Ion");
        PersonalSpital medic=factoryPersonal.createPersonal(TipPersonal.Medic,"Ana");
        System.out.println(asistent);
        System.out.println(medic);
    }
}
