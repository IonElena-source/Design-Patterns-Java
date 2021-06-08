package ConexiuneBD.main;

import ConexiuneBD.clase.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConexiuneBD conexiuneBD=ConexiuneBD.getInstance();
        ConexiuneBD conexiuneBD1=ConexiuneBD.getInstance();
        if(conexiuneBD==conexiuneBD1){
            System.out.println("Instantele sunt egale");
        }
        else {
            System.out.println("Instantele nu sunt egale");
        }

        //eager initialization
        ConexiuneBDEager conexiuneBDEager=ConexiuneBDEager.getInstance();
        ConexiuneBDEager conexiuneEager=ConexiuneBDEager.getInstance();
        if(conexiuneBDEager==conexiuneEager){
            System.out.println("Instantele sunt egale");
        }
        else {
            System.out.println("Instantele nu sunt egale");
        }

        //static block
        ConexiuneBDStaticBlock conexiuneBDStaticBlock1=ConexiuneBDStaticBlock.getInstance();
        ConexiuneBDStaticBlock conexiuneBDStaticBlock2=ConexiuneBDStaticBlock.getInstance();
        System.out.println(conexiuneBDStaticBlock1==conexiuneBDStaticBlock2);

        //thread-safe
        ConexiuneBDThreadSafe conexiuneBDThreadSafe1=ConexiuneBDThreadSafe.getInstance();
        ConexiuneBDThreadSafe conexiuneBDThreadSafe2=ConexiuneBDThreadSafe.getInstance();
        System.out.println(conexiuneBDThreadSafe1==conexiuneBDThreadSafe2);

        //inner class
        ConexiuneBDInnerClass conexiuneBDInnerClass1=ConexiuneBDInnerClass.getInstance();
        ConexiuneBDInnerClass conexiuneBDInnerClass2=ConexiuneBDInnerClass.getInstance();
        System.out.println(conexiuneBDInnerClass1==conexiuneBDInnerClass2);

        //enum
        ConexiuneBDEnum conexiuneBDEnum=ConexiuneBDEnum.INSTANCE;
        ConexiuneBDEnum conexiuneBDEnum2=ConexiuneBDEnum.INSTANCE;
        System.out.println(conexiuneBDEnum==conexiuneBDEnum2);



    }
}
