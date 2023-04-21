package ejercicioperfilmedico;

import ejercicioperfilmedico.PerfilMedico;

import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        PerfilMedico p1;
        Scanner sc= new Scanner(System.in);

        String nombre, apellido, sexo;
        int dia, mes, anio;
        double altura, peso;

        System.out.println("Ingresa tu nombre: ");
        nombre= sc.next();

        System.out.println("Ingresa tu apellido: ");
        apellido= sc.next();

        System.out.println("Ingrese su sexo: ");
        sexo=sc.next();

        System.out.println("Ingresa tu dia de nacimiento en formato dd mm aa: ");
        dia=Integer.parseInt( sc.next());
        mes=Integer.parseInt(sc.next());
        anio=Integer.parseInt(sc.next());

        System.out.println("Ingrese su altura (cm): ");
        altura=Double.parseDouble(sc.next());

        System.out.println("Ingrese su peso (kg): ");
        peso=Double.parseDouble(sc.next());

        p1= new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        System.out.println("Nombres: "+ p1.getNombre() + " "+ p1.getApellido());
        System.out.println("Sexo: "+p1.getSexo());
        System.out.println("Fecha de nacimiento dd/mm/aa: "+ dia + "/" + mes +"/" + anio);
        System.out.println("Edad: "+p1.calcularEdad() +" " +"años");
        System.out.println("Altura: "+p1.getAltura()+" "+ "cm");
        System.out.println("Peso: "+ p1.getPeso()+ " "+  "kg");
        System.out.println("Frecuencia Cardiaca Maxima: "+ p1.calcularFrecuenciaCardiacaMax()+" " + "pulsos por minuto");
        System.out.println("Frecuencia Cardiaca Esperada: "+ p1.calcularFrecuenciaCardiacaEsperada()+"pulsos por minuto");
        System.out.println("Indice de masa corporal: "+p1.calcularBMI());

        System.out.println("==========================================");
        System.out.println("            VALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o mas");
        System.out.println("==========================================");
    }
}
