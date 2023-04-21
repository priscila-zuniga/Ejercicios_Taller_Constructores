package ejerciciofactura;

public class Factura {
//Atributos


    private String numeroPieza;

    private String descripcionPieza;

    private double precioPieza;

    private int cantidadPieza;

    //Constructor obj 1
    public Factura(){

    }

    //Constructor obj 2
    public Factura(String numeroPieza, String descripcionPieza, double precioPieza, int cantidadPieza) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.precioPieza = precioPieza;
        this.cantidadPieza = cantidadPieza;
    }

    //Set

    public void setNumeroPieza(String numeroPieza) {

        this.numeroPieza = numeroPieza;

    }


    public void setPrecioPieza(double precioPieza) {

        if (precioPieza < 0) {
            precioPieza = 0.0;
        }
        this.precioPieza= precioPieza;
    }


    public void setDescripcionPieza(String descripcionPieza) {

        this.descripcionPieza = descripcionPieza;

    }


    public void setCantidadPieza(int cantidadPieza) {

        if (cantidadPieza < 0) {
            cantidadPieza=0;
        }
        this.cantidadPieza = cantidadPieza;
    }


//Get


    public String getNumeroPieza() {

        return numeroPieza;

    }


    public String getDescripcionPieza() {

        return descripcionPieza;

    }


    public double getPrecioPieza() {

        return precioPieza;

    }


    public int getCantidadPieza() {

        return cantidadPieza;

    }


// Metodos

    public double obtenerMontoFactura() {
        return cantidadPieza * precioPieza;

    }

}

