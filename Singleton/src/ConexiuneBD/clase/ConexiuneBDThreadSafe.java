package ConexiuneBD.clase;

public class ConexiuneBDThreadSafe {
    private static ConexiuneBDThreadSafe instance=null;

    private ConexiuneBDThreadSafe() {
    }

    public static synchronized ConexiuneBDThreadSafe getInstance(){
        if(instance==null){
            instance=new ConexiuneBDThreadSafe();
        }
        return instance;

    }
}
