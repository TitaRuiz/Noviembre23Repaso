package com.corenetworks.modelo;

public class Empleado implements Comparable{

    private int id;
    private double sueldo;

    private String nombre;

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                '}'+"\n";
    }

    @Override
    public int compareTo(Object o) {
        Empleado parametro=null;
        if(o instanceof Empleado) {
            parametro = (Empleado) o;
        }
        if(sueldo > parametro.getSueldo()){
            return -1;
        } else if (sueldo==parametro.getSueldo()) {
            return 0;
        } else {
            return 1;
        }
    }

    public Empleado() {
    }

    public Empleado(int id, double sueldo, String nombre) {
        this.id = id;
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
