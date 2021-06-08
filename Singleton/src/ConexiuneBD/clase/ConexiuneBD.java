package ConexiuneBD.clase;

public class ConexiuneBD {

    private static ConexiuneBD instance=null;

    private ConexiuneBD() {

    }

    //lazy initialization
    public static ConexiuneBD getInstance(){
        if(instance==null){
            instance=new ConexiuneBD();
        }
        return instance;
    }


}
