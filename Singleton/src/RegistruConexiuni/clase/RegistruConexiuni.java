package RegistruConexiuni.clase;

import java.util.HashMap;

public class RegistruConexiuni {

    public static HashMap<String, ConexiuneBD> conexiuni = new HashMap();

    private RegistruConexiuni() {

    }

    public static void registerConexiuneBD(String denumire, ConexiuneBD conexiuneBD) {
        if (conexiuni.containsKey(denumire)) {
            throw new UnsupportedOperationException();
        }
        else {
            conexiuni.put(denumire,conexiuneBD);
        }
    }
    public static ConexiuneBD getConexiune(String denumire){
        return conexiuni.get(denumire);
    }
}
