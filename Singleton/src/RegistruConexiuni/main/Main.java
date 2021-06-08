package RegistruConexiuni.main;

import RegistruConexiuni.clase.ConexiuneBD;
import RegistruConexiuni.clase.RegistruConexiuni;

public class Main {
    public static void main(String[] args) {
        ConexiuneBD conexiuneBD1=new ConexiuneBD("BD1",2,50);
        ConexiuneBD conexiuneBD2=new ConexiuneBD("BD1",2,50);
        ConexiuneBD conexiuneBD3=new ConexiuneBD("BD1",2,50);
        RegistruConexiuni.registerConexiuneBD("BD1",conexiuneBD1);
        System.out.println(RegistruConexiuni.getConexiune("BD1"));
        RegistruConexiuni.registerConexiuneBD("BD1",conexiuneBD2);

    }


}
