package com.corenetworks.modelo;

import java.util.Objects;

public class Producto implements Comparable{
    private int id;
    private int cantidadExistencia;
    private double precio;

    @Override
    public int compareTo(Object o) {
        Producto parametro=null;
        if(o instanceof Producto) {
            parametro = (Producto) o;
        }
        if(precio > parametro.getPrecio()){
                return -1;
            } else if (precio==parametro.getPrecio()) {
                return 0;
            } else {
                return 1;
            }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", cantidadExistencia=" + cantidadExistencia +
                ", precio=" + precio +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id && cantidadExistencia == producto.cantidadExistencia && Double.compare(precio, producto.precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidadExistencia, precio);
    }

    public Producto() {
    }

    public Producto(int id, int cantidadExistencia, double precio) {
        this.id = id;
        this.cantidadExistencia = cantidadExistencia;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
