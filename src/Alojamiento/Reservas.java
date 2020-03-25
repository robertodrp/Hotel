/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alojamiento;


public class Reservas {
    private String huesped;
    private int horaDeEntrada;
    private int horaDeSalida;
    private int cuenta;
    private int todoIncluido;
    private String Vista;
    private String TipoHabitacion;

    public Reservas() {
    }

    public Reservas(String huesped, int horaDeEntrada, int horaDeSalida, int cuenta, int todoIncluido, String Vista, String TipoHabitacion) {
        this.huesped = huesped;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
        this.cuenta = cuenta;
        this.todoIncluido = todoIncluido;
        this.Vista = Vista;
        this.TipoHabitacion = TipoHabitacion;
    }

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public int getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(int horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getTodoIncluido() {
        return todoIncluido;
    }

    public void setTodoIncluido(int todoIncluido) {
        this.todoIncluido = todoIncluido;
    }

    public String getVista() {
        return Vista;
    }

    public void setVista(String Vista) {
        this.Vista = Vista;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }
    
    @Override
    public String toString(){
        
          String TodoIncluido = "";
    
        
        if (isTodoIncluido()) {
            TodoIncluido += "Con todo incluido (servicio a la habitación, acceso al restaurante-bar, a los conciertos y espectaculos dentro del hotel, pulsera para barra libre 24 hrs)";
        } else {
            TodoIncluido += "Sin nada extra";
        }
    
    int Cuenta;
        Cuenta = 0;
        Cuenta += getVista().getPrecio();
        Cuenta += getTipoHabitacion().getPrecio();
        setCuenta(Cuenta);
        return null;
        
}

    private boolean isTodoIncluido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
