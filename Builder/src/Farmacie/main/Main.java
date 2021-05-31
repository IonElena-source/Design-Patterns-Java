package Farmacie.main;

import Farmacie.classes.BuilderFactura;
import Farmacie.classes.Factura;

public class Main {
    public static void main(String[] args) {
        Factura factura=new BuilderFactura().build();
        System.out.println(factura);
        Factura factura1=new BuilderFactura().areCotaTVA(20).build();
        System.out.println(factura1);
    }
}
