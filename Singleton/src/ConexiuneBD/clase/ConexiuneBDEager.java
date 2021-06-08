package ConexiuneBD.clase;

public class ConexiuneBDEager {
    private static ConexiuneBDEager instance=new ConexiuneBDEager();

    private ConexiuneBDEager() {
    }

    public static ConexiuneBDEager getInstance(){
        return instance;
    }
}
