package ejerciciofactura;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura f1 = new Factura();
        Factura f2;
        Scanner sc= new Scanner(System.in);


        String numeroPieza;
        String descripcionPieza;
        double precioPieza;
        int cantidadPieza;

        //Objeto 1
        System.out.println("Ingrese el numero de la pieza (CODIGO): ");

        numeroPieza= sc.next();

        f1.setNumeroPieza(numeroPieza);


        System.out.println("Ingrese la descripcion de la pieza: ");

        descripcionPieza= sc.next();

        f1.setDescripcionPieza(descripcionPieza);


        System.out.println("Ingrese el precio de la pieza: ");

        precioPieza= Double.parseDouble(sc.next());

        f1.setPrecioPieza(precioPieza);


        System.out.println("Ingrese la cantidad de la pieza: ");

        cantidadPieza= Integer.parseInt(sc.next());

        f1.setCantidadPieza(cantidadPieza);


        System.out.println("-----------------------------------------------");


        System.out.println("Numero de la pieza (CODIGO): "+f1.getNumeroPieza());

        System.out.println("Descripcion de la pieza: "+f1.getDescripcionPieza());

        System.out.println("Precio de la pieza: "+f1.getPrecioPieza());

        System.out.println("Cantidad pieza(s): "+f1.getCantidadPieza());

        System.out.println("TOTAL: "+f1.obtenerMontoFactura());



        //Objeto 2

        System.out.println("Ingrese el numero de la pieza (CODIGO): ");
        numeroPieza= sc.next();


        System.out.println("Ingrese la descripcion de la pieza: ");
        descripcionPieza= sc.next();


        System.out.println("Ingrese el precio de la pieza: ");
        precioPieza= Double.parseDouble(sc.next());


        System.out.println("Ingrese la cantidad de la pieza: ");
        cantidadPieza= Integer.parseInt(sc.next());

        f2= new Factura(numeroPieza, descripcionPieza, precioPieza, cantidadPieza );

        System.out.println("-----------------------------------------------");


        System.out.println("Numero de la pieza (CODIGO): "+f2.getNumeroPieza());

        System.out.println("Descripcion de la pieza: "+f2.getDescripcionPieza());

        System.out.println("Precio de la pieza: "+f2.getPrecioPieza());

        System.out.println("Cantidad pieza(s): "+f2.getCantidadPieza());

        System.out.println("TOTAL: "+f2.obtenerMontoFactura());
    }
    }
