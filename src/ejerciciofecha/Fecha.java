package ejerciciofecha;

public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int año;

    //Constructor obj 1
    public Fecha(){

    }

    //Constructor obj 2
    public Fecha(int dia, int mes, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    //Set
    public void setDia(int dia){
        this.dia=dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setAño(int año){
        this.año=año;
    }

    //Get
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }

    //Metodos
    public String mostrarFecha(){
        return dia+"/"+mes+"/"+año;
    }
}
