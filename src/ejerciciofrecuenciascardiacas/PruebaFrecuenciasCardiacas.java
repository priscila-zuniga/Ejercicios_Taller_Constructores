package ejerciciofrecuenciascardiacas;

import ejerciciofrecuenciascardiacas.FrecuenciasCardiacas;

import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        FrecuenciasCardiacas f1;
        Scanner sc= new Scanner(System.in);

        String nombre, apellido;
        int dia, mes, anio;

        System.out.println("Ingresa tu nombre: ");
        nombre= sc.next();

        System.out.println("Ingresa tu apellido: ");
        apellido= sc.next();

        System.out.println("Ingresa tu dia de nacimiento en formato dd mm aa: ");
        dia=Integer.parseInt( sc.next());
        mes=Integer.parseInt(sc.next());
        anio=Integer.parseInt(sc.next());

        f1= new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        System.out.println("Nombres: "+ f1.getNombre() + " "+ f1.getApellido());
        System.out.println("Fecha de nacimiento dd/mm/aa: "+ dia + "/" + mes +"/" + anio);
        System.out.println("Edad: "+f1.calcularEdad() +" " +"años");
        System.out.println("Frecuencia Cardiaca Maxima: "+ f1.calcularFrecuenciaCardiacaMax()+" " + "pulsos por minuto");
        System.out.println("Frecuencia Cardiaca Esperada: "+ f1.calcularFrecuenciaCardiacaEsperada()+" "+"pulsos por minuto");
    }
}
