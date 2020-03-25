/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alojamiento;


public class Vista_Habitaciones {
    
    selva ("Al mar", 350);
    ciudad ("Al campo de golf", 200);
    
    private  String descripcion;
    private int precio;

    public Vista_Habitaciones() {
    }

    public Vista_Habitaciones(String descripcion, int precio) {
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
    public String toString(){
        return getDescripcion();
    }
}
