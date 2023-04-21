package ejerciciofrecuenciascardiacas;

public class FrecuenciasCardiacas {
    //Atributos
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    //Constructor

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Get

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    //Metodos
    public int calcularEdad(){
        return 2023-anio;
    }

    public int calcularFrecuenciaCardiacaMax(){
        return 220-calcularEdad();
    }

    public String calcularFrecuenciaCardiacaEsperada(){
        return 0.5*calcularFrecuenciaCardiacaMax()+"/"+0.85*calcularFrecuenciaCardiacaMax();
    }

}
