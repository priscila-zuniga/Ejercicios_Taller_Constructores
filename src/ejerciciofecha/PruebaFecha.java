package ejerciciofecha;

import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha f1= new Fecha();
        Fecha f2;
        Scanner sc= new Scanner(System.in);

        int dia, mes, año;

        //Objeto 1
        System.out.println("Ingrese el dia: ");
        dia=Integer.parseInt(sc.next());
        f1.setDia(dia);

        System.out.println("Ingrese el mes: ");
        mes=Integer.parseInt(sc.next());
        f1.setMes(mes);

        System.out.println("Ingrese el año: ");
        año=Integer.parseInt(sc.next());
        f1.setAño(año);

        System.out.println("Fecha: "+ f1.mostrarFecha());


        System.out.println("---------------------------------");

        //Objeto 2
        System.out.println("Ingrese el dia: ");
        dia=Integer.parseInt(sc.next());

        System.out.println("Ingrese el mes: ");
        mes=Integer.parseInt(sc.next());

        System.out.println("Ingrese el año: ");
        año=Integer.parseInt(sc.next());

        f2=new Fecha(dia, mes, año);

        System.out.println("Fecha: "+ f2.mostrarFecha());

    }

    }

