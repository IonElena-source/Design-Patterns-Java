package ConexiuneBD.clase;

public class ConexiuneBDStaticBlock {
    private static ConexiuneBDStaticBlock instance=null;

    static {
        try {
            instance=new ConexiuneBDStaticBlock();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private ConexiuneBDStaticBlock() {
    }
    public static ConexiuneBDStaticBlock getInstance(){
        return instance;
    }
}
