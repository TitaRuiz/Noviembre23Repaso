package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.TreeSet;

public class ProbarEmpleado {

    public static void main(String[] args) {
        TreeSet<Empleado> empleados = new TreeSet<>();
        empleados.add(new Empleado(1, 2_000, "Zuan Lopez"));
        empleados.add(new Empleado(2, 3_000, "Laura Flores"));
        empleados.add(new Empleado(3, 1_500, "Rosa Aguilar"));
        System.out.println(empleados);
    }
}
