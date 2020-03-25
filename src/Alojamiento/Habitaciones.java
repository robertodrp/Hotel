/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alojamiento;

/**
 *
 * @author Principal
 */
public class Habitaciones {
    //Solo habitación
    sencilla("Sencilla(cama matrimonial)", 1600),
    doble("Doble(dos camas matrimoniales)", 2650),
    suite("Suite(mini bar, jacuzzi, cama King size)", 4890),
    king("King(sala, mini bar, alberca, cama King size)", 6250);
    presidencial("Presidencial(recibidor, sala, bar, alberca, dos camas King size)", 8100),
  
    //Todo incluido
    sencillaTi("Sencilla(cama matrimonial)", 2200),
    dobleTi("Doble(dos camas matrimoniales)", 3650),
    suiteTi("Suite(mini bar, jacuzzi, cama King size)", 5950),
    kingTi("King(sala, mini bar, alberca, cama King size)", 7850),
    presidencialTi("Presidencial(recibidor, sala, bar, alberca, dos camas King size)", 9950);
    
    
    private String descripcion;
    private int precio;

    public Habitaciones() {
    }

    public Habitaciones(String descripcion, int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
     
        return  getDescripcion();
    
}
}
