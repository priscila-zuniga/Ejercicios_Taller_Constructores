package ejercicioempleado;

public class Empleado {
    //Atributos
    private String nombre;
    private String apellido;
    private double salarioMensual;

    //Constructor obj 1
    public Empleado(){

    }

    //Constructor obj 2

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0;
        }
    }

    //Set
    public void setNombre(String nombre){

        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0;
        }
    }
    //Get
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public double getSalarioMensual(){
        return salarioMensual;
    }
}
