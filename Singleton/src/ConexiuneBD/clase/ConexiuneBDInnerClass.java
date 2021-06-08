package ConexiuneBD.clase;

public class ConexiuneBDInnerClass {
    private static class ConexiuneBDHelper{
        private static final ConexiuneBDInnerClass instance=new ConexiuneBDInnerClass();
    }


    public static ConexiuneBDInnerClass getInstance(){
        return ConexiuneBDHelper.instance;
    }

    private ConexiuneBDInnerClass() {
    }
}
