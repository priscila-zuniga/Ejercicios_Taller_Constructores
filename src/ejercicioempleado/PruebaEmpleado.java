package ejercicioempleado;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado e1= new Empleado();
        Empleado e2=new Empleado();
        Empleado e3;
        Scanner sc= new Scanner(System.in);

        String nombre, apellido;
        double salarioMensual;

        //Empleado 1
        System.out.println("----EMPLEAD@ 1----");
        System.out.println("Ingresa tu nombre: ");
        nombre= sc.next();
        e1.setNombre(nombre);

        System.out.println("Ingresa tu apellido: ");
        apellido= sc.next();
        e1.setApellido(apellido);

        System.out.println("Ingresa tu Salario Mensual: ");
        salarioMensual= Double.parseDouble(sc.next());
        e1.setSalarioMensual(salarioMensual);



        System.out.println("El salario anual del emplead@ "+ nombre+" " +  apellido +" es $: " + 12*e1.getSalarioMensual());

        //Empleado 2
        System.out.println("----EMPLEAD@ 2----");
        System.out.println("Ingresa tu nombre: ");
        nombre= sc.next();
        e2.setNombre(nombre);

        System.out.println("Ingresa tu apellido: ");
        apellido= sc.next();
        e2.setApellido(apellido);

        System.out.println("Ingresa tu Salario Mensual: ");
        salarioMensual= Double.parseDouble(sc.next());
        e2.setSalarioMensual(salarioMensual);


        System.out.println("El salario anual del emplead@ "+ nombre+" " +  apellido +" es $: " + 12*e2.getSalarioMensual());

        System.out.println("----AUMENTOS----");
        System.out.println("EMPLEAD@ 1: "+((12*e1.getSalarioMensual())+((12*e1.getSalarioMensual())*0.1)));
        System.out.println("EMPLEAD@ 2: "+((12*e2.getSalarioMensual())+((12*e2.getSalarioMensual())*0.1)));

        //Empleado 3
        System.out.println("----EMPLEAD@ 3----");
        System.out.println("Ingresa tu nombre: ");
        nombre= sc.next();

        System.out.println("Ingresa tu apellido: ");
        apellido= sc.next();

        System.out.println("Ingresa tu Salario Mensual: ");
        salarioMensual= Double.parseDouble(sc.next());

        e3= new Empleado(nombre, apellido, salarioMensual);

        System.out.println("El salario anual del emplead@ "+ nombre+" " +  apellido +" es $: " + 12*e3.getSalarioMensual());

        System.out.println("----AUMENTOS----");
        System.out.println("EMPLEAD@ 3: "+((12*e3.getSalarioMensual())+((12*e3.getSalarioMensual())*0.1)));

    }
    }

